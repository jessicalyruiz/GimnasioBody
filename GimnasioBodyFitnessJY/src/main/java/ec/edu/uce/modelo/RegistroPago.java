package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "registro_pago")
public class RegistroPago {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="seq_regis_pago")
	@SequenceGenerator(name = "seq_regis_pago", sequenceName = "seq_regis_pago", allocationSize = 1)
	@Column(name = "repa_id")
	private Integer id;
	
	@Column(name = "repa_fecha_pago")
	private LocalDateTime fechaPago;
	
	@Column(name = "repa_valor_pago")
	private BigDecimal valorPago;

	
	@OneToOne
	@JoinColumn(name = "repa_fk_cliente")
	private Cliente cliente;

	@OneToOne
	@JoinColumn(name = "repa_fk_membresia")
	private Membresia membresia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDateTime fechaPago) {
		this.fechaPago = fechaPago;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Membresia getMembresia() {
		return membresia;
	}

	public void setMembresia(Membresia membresia) {
		this.membresia = membresia;
	}

	@Override
	public String toString() {
		return "RegistroPago [id=" + id + ", fechaPago=" + fechaPago + ", valorPago=" + valorPago + "]";
	}
	
	
}
