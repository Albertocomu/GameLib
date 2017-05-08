package com.carveras.gamelibrary.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Valoracio implements Serializable
{

	private static final long serialVersionUID = -3448229397874713538L;
	@Id
	@ManyToOne
	private Joc joc;
	@Id
	@ManyToOne
	private Usuari usuari;

	private Integer nota;
	private String comentari;

	public Valoracio()
	{
	}

	public Joc getJoc()
	{
		return joc;
	}

	public void setJoc(Joc joc)
	{
		this.joc = joc;
	}

	public Usuari getUsuari()
	{
		return usuari;
	}

	public void setUsuari(Usuari usuari)
	{
		this.usuari = usuari;
	}

	public Integer getNota()
	{
		return nota;
	}

	public void setNota(Integer nota)
	{
		this.nota = nota;
	}

	public String getComentari()
	{
		return comentari;
	}

	public void setComentari(String comentari)
	{
		this.comentari = comentari;
	}

}
