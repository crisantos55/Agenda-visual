package Agenda;

public class NodoCorreo {

	public String dato;
	public NodoCorreo siguiente;

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public NodoCorreo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoCorreo siguiente) {
		this.siguiente = siguiente;
	}

	public NodoCorreo(String cadena) {
		this.dato = cadena;
		this.siguiente = null;
	}

}
