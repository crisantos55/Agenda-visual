package Agenda;

public class Correo {
	public NodoCorreo inicio;

	public void insertar(String num) {
		NodoCorreo nuevo = new NodoCorreo(num);
		if (inicio == null) {
			inicio = nuevo;
		} else {
			NodoCorreo aux = inicio;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			aux = nuevo;
		}

	}

	public void imprime() {
		NodoCorreo aux = inicio;
		while (aux != null) {
			System.out.printf("El correo es: %s %n ", aux.getDato());
			aux = aux.getSiguiente();
		}
		System.out.printf("%n");

	}

}
