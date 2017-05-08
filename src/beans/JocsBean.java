package beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.carveras.empresa.model.Empleat;
import com.carveras.empresa.model.dao.EmpresaDao;
import com.carveras.gamelibrary.model.Joc;
import com.carveras.gamelibrary.model.dao.GameLibDao;

@Named
@RequestScoped
public class JocsBean implements Serializable
{

	private static final long serialVersionUID = -168438728952897858L;

	@Inject
	private GameLibDao gameLibDao;

	@Inject
	private VariableEnSessioBean variableEnSessioBean;

	private List<Joc> jocs;

	public List<Joc> getJocs()
	{
		return jocs;
	}

	public String crearJoc()
	{
		Joc joc = new Joc();
		return editar(joc);
	}


	public String editar(Joc joc)
	{
		variableEnSessioBean.setJocAEditar(joc);
		return "gestioJoc?faces-redirect=true";
	}
	
	public String esborrar(Joc joc)
	{
		joc.delete();
		gameLibDao.store(joc);
		return "jocs?faces-redirect=true";
	}

	@PostConstruct
	private void init()
	{
		jocs = gameLibDao.findJocs(false);
	}

}
