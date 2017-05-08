package beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.carveras.empresa.model.Departament;
import com.carveras.empresa.model.Empleat;
import com.carveras.empresa.model.dao.EmpresaDao;
import com.carveras.gamelibrary.model.Joc;
import com.carveras.gamelibrary.model.Valoracio;
import com.carveras.gamelibrary.model.dao.GameLibDao;

@Named
@RequestScoped
public class GestioJocBean
{
	private Joc joc;

	@Inject
	private GameLibDao gameLibDao;

	@Inject
	private VariableEnSessioBean variableEnSessioBean;

	public List<Joc> getJocs()
	{
		return gameLibDao.findJocs(false);
	}

	public List<Valoracio> getValoracions()
	{
		return gameLibDao.findValoracions(false);
	}

	public String guardar()
	{
		gameLibDao.merge(joc);
		return "empleats?faces-redirect=true";
	}

	public Joc getJoc()
	{
		return joc;
	}

	@PostConstruct
	private void init()
	{
		joc = variableEnSessioBean.getJocAEditar();
	}
}
