package com.generics.model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

public class TestJpa {

	/**
	 * @param args
	 */
	
	@PersistenceUnit
	EntityManagerFactory emf;
	
	public void Ejecucion(){
		GencoUsuario user = (GencoUsuario) emf.createEntityManager().createQuery("select u from genco_usuarios u").getResultList().get(0);
		System.out.println(user.getNombre());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ejec");
		new TestJpa().Ejecucion();
		

	}

}
