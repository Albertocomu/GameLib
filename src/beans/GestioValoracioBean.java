package beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.carveras.empresa.model.Departament;
import com.carveras.empresa.model.Empleat;
import com.carveras.empresa.model.dao.EmpresaDao;
import com.carveras.gamelibrary.model.Valoracio;
import com.carveras.gamelibrary.model.dao.GameLibDao;

@Named
@RequestScoped
public class GestioValoracioBean
{
	private Valoracio valoracio;

	@Inject
	private GameLibDao gameLibDao;

	@Inject
	private VariableEnSessioBean variableEnSessioBean;


	public String guardar()
	{
		gameLibDao.merge(valoracio);
		return "departaments?faces-redirect=true";
	}

	public Departament getValoracio()
	{
		return valoracio;
	}

	@PostConstruct
	private void init()
	{
		valoracio = variableEnSessioBean.getDepartamentAEditar();
// TODO		empleats = gameLibDao.findEmpleats(valoracio);
	
		}
}
