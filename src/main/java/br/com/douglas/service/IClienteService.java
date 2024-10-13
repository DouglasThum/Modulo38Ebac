/**
 * 
 */
package br.com.douglas.service;

import java.util.List;

import br.com.douglas.domain.Cliente;
import br.com.douglas.exceptions.DAOException;
import br.com.douglas.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
