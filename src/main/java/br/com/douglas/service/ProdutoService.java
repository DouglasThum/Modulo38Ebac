/**
 * 
 */
package br.com.douglas.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.douglas.dao.IProdutoDAO;
import br.com.douglas.domain.Produto;
import br.com.douglas.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	
	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
