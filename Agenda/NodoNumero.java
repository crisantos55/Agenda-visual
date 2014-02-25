package Agenda;

public class NodoNumero {
	public double numero;
	public NodoNumero siguiente;

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public NodoNumero getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoNumero siguiente) {
		this.siguiente = siguiente;
	}

	public NodoNumero(double num) {
		this.numero = num;
		this.siguiente = null;
	}

}
