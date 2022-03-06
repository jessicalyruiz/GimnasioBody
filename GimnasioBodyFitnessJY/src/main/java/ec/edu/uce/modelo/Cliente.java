package ec.edu.uce.modelo;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="seq_client")
	@SequenceGenerator(name = "seq_client", sequenceName = "seq_client", allocationSize = 1)
	@Column(name = "clie_id")
	private Integer id;
	
	@Column(name = "clie_nombre")
	private String nombre;
	
	@Column(name = "clie_apellido")
	private String apellido;
	
	@Column(name = "clie_fecha_nacimiento")
	private LocalDate fechaNacimiento;
	
	@Column(name = "clie_estado")
	private String estado;
	
	@Column(name = "cedula")
	private String cedula;
	
	@OneToOne
	@JoinColumn(name = "clie_fk_membresia")
	private Membresia membresia;

	
	@OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
	private RegistroPago registroPago;
	
	
	//get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RegistroPago getRegistroPago() {
		return registroPago;
	}

	public void setRegistroPago(RegistroPago registroPago) {
		this.registroPago = registroPago;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Membresia getMembresia() {
		return membresia;
	}

	public void setMembresia(Membresia membresia) {
		this.membresia = membresia;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", estado=" + estado + ", cedula=" + cedula + "]";
	}


	
	
}
