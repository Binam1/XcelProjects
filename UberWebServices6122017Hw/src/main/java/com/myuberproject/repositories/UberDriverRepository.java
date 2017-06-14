package com.myuberproject.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myuberproject.entities.UberDriver;

@Repository
public class UberDriverRepository
	{
		@PersistenceContext
		EntityManager em;
		
		@Transactional
		public UberDriver save(UberDriver d)
			{
				return em.merge(d);
			}
		
	@Transactional
	public List<UberDriver> findByName(String firstName)
		{
			String sql = "select * from uber_driver where firstName = '"+ firstName + "'";
			Query q = em.createNativeQuery(sql, UberDriver.class);
			return q.getResultList();
		}
	
	@Transactional
	public UberDriver update(UberDriver c)
		{
			return em.merge(c);
		}
}

	
