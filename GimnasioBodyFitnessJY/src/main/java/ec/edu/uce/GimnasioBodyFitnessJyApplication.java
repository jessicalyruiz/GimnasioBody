package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.Membresia;
import ec.edu.uce.service.IClienteService;
import ec.edu.uce.service.IMembresiaService;

@SpringBootApplication
public class GimnasioBodyFitnessJyApplication implements CommandLineRunner{

	@Autowired IMembresiaService membresiaService;
	
	@Autowired IClienteService clienteService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(GimnasioBodyFitnessJyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		Cliente cliente =new Cliente();
		cliente.setApellido("Yanez");
		cliente.setEstado("N");
		cliente.setFechaNacimiento(LocalDate.of(1992, 06, 24));
		cliente.setNombre("Jessica");
		cliente.setCedula("2300115066");
		clienteService.create(cliente);
		
		Cliente cliente2 =new Cliente();
		cliente2.setApellido("Ruiz");
		cliente2.setEstado("N");
		cliente2.setFechaNacimiento(LocalDate.of(2000, 03, 17));
		cliente2.setNombre("Lorena");
		cliente2.setCedula("04895623178");
		clienteService.create(cliente2);
		*/
		/*
		Membresia membresia=new Membresia();
		membresia.setCodigo("hjk-78");
		membresia.setNombre("platinium");
		membresia.setValor(new BigDecimal(500));
		membresia.setVigencia("12 meses");
		this.membresiaService.create(membresia);
		
		Membresia membresia2=new Membresia();
		membresia2.setCodigo("ert-12");
		membresia2.setNombre("gold");
		membresia2.setValor(new BigDecimal(400));
		membresia2.setVigencia("10 meses");
		this.membresiaService.create(membresia2);
		*/
		
		//this.membresiaService.pagarMembresia("2300115066", "hjk-78");
		
		//para que me de error al insertar factura
		this.membresiaService.pagarMembresia("04895623178", "ert-12");
		
	}

}
