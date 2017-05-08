package com.carveras.gamelibrary.model.dao;

import com.carver_as.carverjsf.model.ICarverHibernateDAO;
import com.carveras.gamelibrary.model.Joc;
import com.carveras.gamelibrary.model.Valoracio;

import java.util.List;


public interface GameLibDao extends ICarverHibernateDAO
{
	List<Joc> findJocs(boolean esborrats);

	List<Valoracio> findValoracions(boolean esborrats);

}