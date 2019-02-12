package br.com.fiap.loja.bo.EstoqueBO;

import br.com.fiap.loja.To.ProdutoTO;

public class EstoqueBO {

	public ProdutoTO consultarProduto(int codProduto) {

		ProdutoTO produto = null;
		switch (codProduto) {
		case 401:
			produto = new ProdutoTO(401, 10, 5, "Camisa Branca");
			break;
		case 402:
			produto = new ProdutoTO(402, 11, 6, "Camisa Azul");
			break;
		case 403:
			produto = new ProdutoTO(403, 12, 7, "Camisa Rosa");
			break;
		default:
			break;
		}
		return produto;
	}
}
