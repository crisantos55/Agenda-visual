package Agenda;

public class Nodo {
	
	public Persona persona;
	public Nodo siguiente;
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	public Nodo(Persona p){
		this.persona=p;
		this.siguiente=null;
	}

}
