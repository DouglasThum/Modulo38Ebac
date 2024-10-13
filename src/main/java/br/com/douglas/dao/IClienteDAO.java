/**
 * 
 */
package br.com.douglas.dao;

import java.util.List;

import br.com.douglas.dao.generic.IGenericDAO;
import br.com.douglas.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
