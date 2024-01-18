package ec.edu.ups.prueba63.prueba63lituma.business;

import ec.edu.ups.prueba63.prueba63lituma.dao.ClienteDAO;
import ec.edu.ups.prueba63.prueba63lituma.model.Cliente;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class GestionDatos {

	@Inject
	private ClienteDAO daoCliente;
	
	
	@PostConstruct
	public void init() {
		System.out.println("iniciando");
		
		Cliente cliente = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		Cliente cliente4 = new Cliente();
		cliente.setCodigo(1);
		cliente.setDni("0302321013");
		cliente.setDireccion("Azogues");
		cliente.setNombre("Jorge Lituma");
		cliente.setDeudas(50);
		
		cliente2.setCodigo(2);
		cliente2.setDni("0154174512");
		cliente2.setDireccion("Cuenca");
		cliente2.setNombre("Juan Daniel");
		cliente2.setDeudas(100);
		
		cliente3.setCodigo(3);
		cliente3.setDni("0745194589");
		cliente3.setDireccion("Guayas");
		cliente3.setNombre("Esteban Castro");
		cliente3.setDeudas(200);
		
		cliente4.setCodigo(4);
		cliente4.setDni("0186453489");
		cliente4.setDireccion("Quito");
		cliente4.setNombre("Maria Paula");
		cliente4.setDeudas(24);
		
		
		daoCliente.insert(cliente);
		daoCliente.insert(cliente2);
		daoCliente.insert(cliente3);
		daoCliente.insert(cliente4);
			
		
	}
}