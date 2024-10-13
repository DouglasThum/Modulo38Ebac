/**
 * 
 */
package br.com.douglas.service;

import java.util.List;

import br.com.douglas.domain.Produto;
import br.com.douglas.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
