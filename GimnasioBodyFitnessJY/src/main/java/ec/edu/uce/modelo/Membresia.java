package ec.edu.uce.modelo;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "membresia")
public class Membresia {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="seq_membre")
	@SequenceGenerator(name = "seq_membre", sequenceName = "seq_membre", allocationSize = 1)
	@Column(name = "memb_id")
	private Integer id;
	
	@Column(name = "memb_nombre")
	private String nombre;
	
	@Column(name = "memb_codigo")
	private String codigo;
	
	@Column(name = "memb_vigencia")
	private String vigencia;
	
	@Column(name = "memb_cantidad")
	private Integer cantidad;
	
	@Column(name = "memb_valor")
	private BigDecimal valor;
	
	@OneToOne(mappedBy = "membresia", cascade = CascadeType.ALL)
	private Cliente cliente;

	@OneToOne(mappedBy = "membresia", cascade = CascadeType.ALL)
	private RegistroPago registroPago;
	
	//get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public RegistroPago getRegistroPago() {
		return registroPago;
	}

	public void setRegistroPago(RegistroPago registroPago) {
		this.registroPago = registroPago;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getVigencia() {
		return vigencia;
	}

	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Membresia [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", vigencia=" + vigencia
				+ ", cantidad=" + cantidad + ", valor=" + valor + "]";
	}


	
	
}
