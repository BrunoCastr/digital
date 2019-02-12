package br.com.fiap.teste;

import org.apache.log4j.Logger;

import br.com.fiap.singleton.ConfiguracaoSingleton;

public class Teste {
	
	private static Logger log = Logger.getLogger(Teste.class);
	
	public static void main(String[]args) {
		
		log.info("Iniciando aplica��o");
		//Recuperar a configura��o de idioma
		String idioma = ConfiguracaoSingleton.getInstace().getProperty("idioma");
		log.warn("Recuperando a configura��o do sistema");
		System.out.println(idioma);
	}

}
