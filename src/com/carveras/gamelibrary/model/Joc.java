package com.carveras.gamelibrary.model;

import javax.persistence.Entity;

import com.carver_as.carverjsf.model.Nameable;

@Entity
public class Joc extends Nameable
{

	private Usuari creador;
	private Productora productora;
	private Distribuidora distribuidora;
	private String director;
	private Genere genere;

	public Joc()
	{
	}

	public Usuari getCreador()
	{
		return creador;
	}

	public void setCreador(Usuari creador)
	{
		this.creador = creador;
	}

	public Productora getProductora()
	{
		return productora;
	}

	public void setProductora(Productora productora)
	{
		this.productora = productora;
	}

	public Distribuidora getDistribuidora()
	{
		return distribuidora;
	}

	public void setDistribuidora(Distribuidora distribuidora)
	{
		this.distribuidora = distribuidora;
	}

	public String getDirector()
	{
		return director;
	}

	public void setDirector(String director)
	{
		this.director = director;
	}

	public Genere getGenere()
	{
		return genere;
	}

	public void setGenere(Genere genere)
	{
		this.genere = genere;
	}

}
