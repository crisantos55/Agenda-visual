package Agenda;

public class Telefono {
	public NodoNumero inicio;

	public void insertar(double num) {
		NodoNumero nuevo = new NodoNumero(num);
		if (inicio == null) {
			inicio = nuevo;
		} else {
			NodoNumero aux = inicio;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			aux = nuevo;
		}

	}

	public void imprime() {
		NodoNumero aux = inicio;
		while (aux != null) {
			System.out.printf("El numero es: %.0f %n ", aux.getNumero());
			aux = aux.getSiguiente();
		}
		System.out.printf("%n ");

	}

}
