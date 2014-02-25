package Agenda;

public class Persona {
	public String nombre;
	public String direccion;
	public String fechaNacimiento;
	public Telefono telefonos = new Telefono();
	public Correo correos = new Correo();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Telefono getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(Telefono telefonos) {
		this.telefonos = telefonos;
	}

	public Correo getCorreos() {
		return correos;
	}

	public void setCorreos(Correo correos) {
		this.correos = correos;
	}

}
