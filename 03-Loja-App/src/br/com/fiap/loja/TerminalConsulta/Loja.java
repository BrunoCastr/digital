package br.com.fiap.loja.TerminalConsulta;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import br.com.fiap.loja.To.ProdutoTO;
import br.com.fiap.loja.bo.EstoqueBO.EstoqueBO;
import br.com.fiap.singleton.ConfiguracaoSingleton;

public class Loja {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calendar datao = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		EstoqueBO bo = new EstoqueBO();
		
		String filial = ConfiguracaoSingleton.getInstance().getProperty("filial");

		int codigo = 0;

		do {
			System.out.println("\n"+filial+" " + sdf.format(datao.getTime()) + "\n\nInforme o código do Produto: ");
			codigo = sc.nextInt();

			ProdutoTO to = bo.consultarProduto(codigo);

			if (to != null) {
				System.out.println(to);
			} else {
				System.out.println("Produto não encontrado\n");
			}
		} while (codigo != 0);

		sc.close();
	}
}
