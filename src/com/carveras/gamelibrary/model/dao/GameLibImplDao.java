package com.carveras.gamelibrary.model.dao;

import com.carver_as.carverjsf.model.CarverHibernateDAO;
import com.carveras.empresa.model.Departament;
import com.carveras.empresa.model.Empleat;
import com.carveras.gamelibrary.model.Joc;
import com.carveras.gamelibrary.model.Valoracio;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class GameLibImplDao extends CarverHibernateDAO implements GameLibDao
{

	@Override
	public List<Joc> findJocs(boolean esborrats)
	{
		DetachedCriteria criteria = DetachedCriteria.forClass(Joc.class);
		criteria.add(esborrats ? Restrictions.isNotNull("deletionDate") : Restrictions.isNull("deletionDate"));
		return find(criteria);
	}

	@Override
	public List<Valoracio> findValoracions(boolean esborrats)
	{
		DetachedCriteria criteria = DetachedCriteria.forClass(Valoracio.class);
		criteria.add(esborrats ? Restrictions.isNotNull("deletionDate") : Restrictions.isNull("deletionDate"));
		return find(criteria);
	}

}
