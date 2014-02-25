package Agenda;

import java.util.Scanner;
import Agenda.fra;
public class Agenda {
	public Nodo inicio;

	public String scaner() {
		Scanner a = new Scanner(System.in);
		String cadena = a.nextLine();
		a.reset();
		return cadena;

	}

	public double sca() {
		Scanner num = new Scanner(System.in);
		double numero = num.nextDouble();
		num.reset();
		return numero;
	}
	
	public void control() {
		Integer seleccion = 0;
		do {
			this.menu();
			System.out.println("ingrese el numero del menu");

			seleccion = this.validaMenu();
			switch (seleccion) {

			case 1:
			//	this.agregarContacto();
				break;
			case 2:
				this.modifica();

				break;
			case 3:
				this.elimina();
				break;
			case 4:
				this.busca();
				break;
			case 5:
				this.recorrer();
				break;

			}
		} while (seleccion != 6);
	}

	public void menu() {
		System.out
				.println("Bienvenidos a la agenda de angel, acontinuacion eliga un numero:\n\n");
		System.out.println("1.- Agregar contacto");
		System.out.println("2.- Modificar contacto");
		System.out.println("3.- Eliminar contacto");
		System.out.println("4.- Buscar contacto");
		System.out.println("5.- Mostrar la agenda");
		System.out.println("6.- Salir");
	}

	public Integer validaMenu() {
		boolean bandera = false;
		Integer aux = 0;
		while (bandera == false) {
			String cad = null;
			cad = this.scaner();
			if (this.valida(cad)) {
				aux = Integer.parseInt(cad);
				bandera = true;
			} else {
				System.out.println("Error caracter invalido, vuelva a teclear uno");

			}
		}

		return aux;

	}

	public boolean valida(String cadena) {
		boolean bandera = true;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) < 49 || cadena.charAt(i) > 54) {
				bandera = false;
			}
		}

		return bandera;
	}

	/*public void agregarContacto() {
		Persona nueva = new Persona();
		Nodo nuevo = new Nodo(nueva);
		this.rellenaClase(nueva);
		if (inicio == null) {
			inicio = nuevo;
		} else {
			Nodo aux = inicio;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			aux = nuevo;
		}

	}
*/
	/*public void rellenaClase(Persona p) {
		System.out.println("Ingrese el nombre de su contacto");
		p.nombre = this.scaner();
		System.out.println("Ingrese la direccion");
		p.direccion = this.scaner();
		System.out.println("Ingrese su fecha de nacimiento");
		p.fechaNacimiento = this.scaner();
		do {
			System.out.println("Ingrese el numero");
			double num = this.sca();
			p.getTelefonos().insertar(num);
			System.out.println("1 Agregar otro numero ,2 salir ");
		} while (this.sca() != 2);
		do {
			System.out.println("Ingrese el correo");
			String cadena = this.scaner();
			p.getCorreos().insertar(cadena);
			System.out.println("1 Agregar otro correo ,2 salir ");
		} while (this.sca() != 2);

	}*/

	public void recorrer() {
		Nodo aux = inicio;
		while (aux != null) {

			System.out.printf("Nombre: %s %n", aux.persona.nombre);
			System.out.printf("Direccion: %s %n", aux.persona.direccion);
			System.out.printf("Fecha de nacimiento: %s %n",
					aux.persona.fechaNacimiento);
			aux.persona.getTelefonos().imprime();
			aux.persona.getCorreos().imprime();
			aux = aux.getSiguiente();

		}

	}

	public void submenu() {
		System.out.println("Modificar");
		System.out.println("1.-Nombre");
		System.out.println("2.-Direccion");
		System.out.println("3.-Fecha de nacimiento");
		System.out.println("4.-Telefono");
		System.out.println("5.-Correo");
		System.out.println("6.-salir");
	}

	public void modifica() {
		System.out.println("Ingrese el nombre a modificar");
		String modificar = this.scaner();
		Nodo aux = inicio;
		boolean bandera = false;
		while (aux != null && bandera == false) {
			if (aux.persona.nombre.equals(modificar)) {

				bandera = true;
			}
			if (bandera != true) {
				aux = aux.getSiguiente();
			}

		}
		// empieza a modificar
		Integer seleccion = 0;
		do {
			this.submenu();
			System.out.println("ingrese el numero del menu");

			seleccion = this.validaMenu();
			switch (seleccion) {
			case 1:
				System.out.println("Ingrese el nuevo nombre");
				aux.persona.nombre = this.scaner();
				break;
			case 2:
				System.out.println("Ingrese la nueva direccion");
				aux.persona.direccion = this.scaner();
				break;
			case 3:
				System.out.println("Ingrese la nueva fecha de nacimiento");
				aux.persona.fechaNacimiento = this.scaner();
				break;
			case 4:
				System.out.println("Ingrese los nuevos numeros");
				// aux.persona.telefonos=this.scaner();
				break;
			case 5:
				System.out.println("Ingrese los nuevos correos");
				break;

			}
		} while (seleccion != 6);

	}

	public void elimina() {
		System.out.println("Ingresa el nombre a eliminar");
		String modificar = this.scaner();
		Nodo aux = inicio;
		Nodo aux2 = null;
		boolean bandera = false;
		while (aux != null && bandera == false) {

			if (aux.persona.nombre.equals(modificar)) {
				bandera = true;
			}

			if (bandera != true) {
				aux2 = aux;
				aux = aux.getSiguiente();
			}
		}
		// comienza la eliminacion
		if (bandera) {

			if (aux2 != null) {
				if (aux.getSiguiente() != null) {
					aux2.setSiguiente(aux.getSiguiente());
				} else {
					aux2.setSiguiente(null);
					aux = null;
				}
			} else {

				if (aux.getSiguiente() == null) {
					inicio = null;
				} else {
					inicio = aux.getSiguiente();

				}
			}
		}

		else {
			System.out.println("No encontrado");
		}

	}

	public void busca() {
		System.out.println("Ingrese el nombre a buscar");
		String modificar = this.scaner();
		Nodo aux = inicio;
		boolean bandera = false;
		while (aux != null && bandera == false) {
			if (aux.persona.nombre.equals(modificar)) {

				bandera = true;
			}
			if (bandera != true) {
				aux = aux.getSiguiente();
			}
		}
		this.imprimir(aux);

	}
	
	public void imprimir(Nodo aux){
		System.out.printf("Nombre: %s %n", aux.persona.nombre);
		System.out.printf("Direccion: %s %n", aux.persona.direccion);
		System.out.printf("Fecha de nacimiento: %s ",aux.persona.fechaNacimiento);
		aux.persona.getTelefonos().imprime();
		aux.persona.getCorreos().imprime();
	}

}