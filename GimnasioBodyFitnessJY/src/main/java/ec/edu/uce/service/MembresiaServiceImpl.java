package ec.edu.uce.service;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.FacturaSRI;
import ec.edu.uce.modelo.Membresia;
import ec.edu.uce.modelo.RegistroPago;
import ec.edu.uce.repository.IMembresiaRepo;

@Service
public class MembresiaServiceImpl implements IMembresiaService{

	
	@Autowired
	private IMembresiaRepo membresiaRepo;
	
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private IRegistroPagoService registriService;
	
	@Autowired
	
	private IFacturaService facturaService;
	
	@Override
	public void create(Membresia membresia) {
		// TODO Auto-generated method stub
		this.membresiaRepo.create(membresia);
	}

	@Override
	public Membresia read(Integer id) {
		// TODO Auto-generated method stub
		return this.membresiaRepo.read(id);
	}

	@Override
	public void update(Membresia membresia) {
		// TODO Auto-generated method stub
		this.membresiaRepo.update(membresia);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.membresiaRepo.delete(id);
	}

	@Override
	@Transactional
	public void pagarMembresia(String cedula, String codigo) {
		// TODO Auto-generated method stub
		Cliente cliente=this.clienteService.buscarCedula(cedula);
		Membresia membresia=this.buscarCodigo(codigo);
		membresia.setCliente(cliente);
		cliente.setMembresia(membresia);
		//Registrar el pago de la membresía
		RegistroPago pago=new RegistroPago();
		pago.setCliente(cliente);
		pago.setFechaPago(LocalDateTime.now());
		pago.setMembresia(membresia);
		pago.setValorPago(membresia.getValor());
		this.registriService.create(pago);
		
		//Actualizarel estado delcliente a:P (Pagado membresía)
		cliente.setEstado("P");
		clienteService.update(cliente);
		
		//Aumentar la cantidad de clientes pagados en la membresía.
			//verifico que no sea null
		if(membresia.getCantidad()==null) {
			membresia.setCantidad(0);
		}
		
		membresia.setCantidad(membresia.getCantidad()+1);
		membresiaRepo.update(membresia);
		
		//Generar factura electrónica con el SRI
		FacturaSRI factura=new FacturaSRI();
		factura.setCedulaCliente(cedula);
			//para el error
		//factura.setCedulaCliente(null);
		factura.setFechaPago(pago.getFechaPago());
		factura.setValorPago(pago.getValorPago());
		facturaService.create(factura);
		
	}

	@Override
	public Membresia buscarCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.membresiaRepo.buscarCodigo(codigo);
	}

}
