package beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import com.carveras.gamelibrary.model.Valoracio;
import com.carveras.gamelibrary.model.dao.GameLibDao;

@Named
@RequestScoped
public class ValoracionsBean implements Serializable
{

	private static final long serialVersionUID = -168438728952897858L;

	@Inject
	private GameLibDao gameLibDao;

	@Inject
	private VariableEnSessioBean variableEnSessioBean;

	private List<Valoracio> valoracions;
	private List<Valoracio> valoracionsEsborrades;

	public List<Valoracio> getValoracions()
	{
		return valoracions;
	}

	public List<Valoracio> getValoracionsEsborrades()
	{
		return valoracionsEsborrades;
	}

	public String crearValoracio()
	{
		Valoracio valoracio = new Valoracio();
		return editar(valoracio);
	}

	public String eliminar(Valoracio valoracio)
	{
		valoracio.delete();
		gameLibDao.store(valoracio);
		return "valoracions?faces-redirect=true";
	}

	public String restaurar(Valoracio valoracio)
	{
		valoracio.setDeletionDate(null);
		gameLibDao.store(valoracio);
		return "valoracions?faces-redirect=true";
	}

	public String editar(Valoracio valo)
	{
		variableEnSessioBean.setValoracioAEditar(valo);
		return "gestioValoracio?faces-redirect=true";
	}

	// public String cancelar()
	// {
	// return "Valoracio?faces-redirect=true";
	// }

	@PostConstruct
	private void init()
	{
		valoracions = gameLibDao.findValoracions(false);
		valoracionsEsborrades = gameLibDao.findValoracions(true);
	}

}
