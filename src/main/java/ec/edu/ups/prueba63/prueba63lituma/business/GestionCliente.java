package ec.edu.ups.prueba63.prueba63lituma.business;

import java.util.List;

import ec.edu.ups.prueba63.prueba63lituma.dao.ClienteDAO;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import ec.edu.ups.prueba63.prueba63lituma.model.Cliente;

@Stateless
public class GestionCliente {

	@Inject
	private ClienteDAO daoCliente;
	
	public  void guardarClientes(Cliente cliente) {
		Cliente cli = daoCliente.read(cliente.getCodigo());
		if(cli != null) {
			daoCliente.update(cliente);
		}else {
			daoCliente.insert(cliente);
		}
	}
	
	public  void  actualizarClientes(Cliente cliente) {
		Cliente cli = daoCliente.read(cliente.getCodigo());
		if(cli != null) {
			daoCliente.update(cliente);
		}else {
			daoCliente.insert(cliente);
		}
	}
	
	public Cliente getClienteCedula(String dni) throws Exception {
		if(dni.length() >= 5) {
			return daoCliente.getCliente(dni);
		}
		throw new Exception("Cedula incorrecta");
	}
	
	public List<Cliente> getClientes(){
		return daoCliente.getAll();
	}
	
	public void borrar(int id) {
		daoCliente.remove(id);
	}
	
}