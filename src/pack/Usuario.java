package pack;

import java.io.Serializable;


public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellidos;
	private String email;
	private String telefono;
	private String cp;
	
	public Usuario() {
		nombre="";
		apellidos="";
		email="";
		telefono="";
		cp="";
	}
	
	public Usuario(String nombre, String apellidos, String email, String telefono, String cp) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.email=email;
		this.telefono=telefono;
		this.email=email;
		this.cp=cp;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono=telefono;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp=cp;
	}
}
