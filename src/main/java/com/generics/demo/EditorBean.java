package com.generics.demo;
 
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.generics.model.GencoLenguaje;
 
 
@ManagedBean(name = "editor")
public class EditorBean {
 
//	@PersistenceUnit(unitName = "ventas")
 //   EntityManagerFactory emf;

	
	@PostConstruct
	public void  inicializa(){
		System.out.println("X");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ventas");
		EntityManager em = emf.createEntityManager();
		lenguajes = (List<GencoLenguaje>) em.createQuery("select u from GencoLenguaje u").getResultList();
		System.out.println(lenguajes.get(0).getNombreLenguaje());		
						
	}
	
	private String value = "This editor is provided by PrimeFaces";
	private List<GencoLenguaje> lenguajes;
	
	public List<GencoLenguaje> getLenguajes() {
		return lenguajes;
	}
	
	public String getValue() {
		
		return value;
	}
 
	public void setValue(String value) {
		this.value = value;
	}
	
	 public void buttonAction(ActionEvent actionEvent) {
	        addMessage("Welcome to Primefaces!!");
	    }
	     
	    public void addMessage(String summary) {
	        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	    }
}