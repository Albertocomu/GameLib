package beans;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.carveras.empresa.model.Departament;
import com.carveras.empresa.model.Empleat;
import com.carveras.gamelibrary.model.Joc;
import com.carveras.gamelibrary.model.Valoracio;

@Named
@SessionScoped
public class VariableEnSessioBean implements Serializable
{
	private static final long serialVersionUID = -7419160864682758199L;

	private Joc jocAEditar;

	private Valoracio ValoracioAEditar;

	public Joc getJocAEditar() {
		return jocAEditar;
	}

	public void setJocAEditar(Joc jocAEditar) {
		this.jocAEditar = jocAEditar;
	}

	public Valoracio getValoracioAEditar() {
		return ValoracioAEditar;
	}

	public void setValoracioAEditar(Valoracio valoracioAEditar) {
		ValoracioAEditar = valoracioAEditar;
	}
}
