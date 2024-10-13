/**
 * 
 */
package br.com.douglas.dao;

import java.util.List;

import br.com.douglas.dao.generic.IGenericDAO;
import br.com.douglas.domain.Produto;

/**
 * @author rodrigo.pires
 *
 */
public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
