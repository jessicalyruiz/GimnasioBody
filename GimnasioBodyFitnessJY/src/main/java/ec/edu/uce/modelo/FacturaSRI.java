package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "factura_sri")
public class FacturaSRI {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="seq_factura")
	@SequenceGenerator(name = "seq_factura", sequenceName = "seq_factura", allocationSize = 1)
	@Column(name = "fact_id")
	private Integer id;
	
	@Column(name = "fact_cedula_cliente")
	private String cedulaCliente;
	
	@Column(name = "fact_fecha_pago")
	private LocalDateTime fechaPago;
	
	@Column(name = "fact_valor_pago")
	private BigDecimal valorPago;

	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
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

	@Override
	public String toString() {
		return "FacturaSRI [id=" + id + ", cedulaCliente=" + cedulaCliente + ", fechaPago=" + fechaPago + ", valorPago="
				+ valorPago + "]";
	}
	
	
	
}
