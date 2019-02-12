package br.com.fiap.singleton;

import java.util.Properties;

public class ConfiguracaoSingleton {

	// 1 - Atributo est�tico que ser� �nico na aplica��o

	private static Properties prop;

	// 2 - Construtor privado

	private ConfiguracaoSingleton() {
	}

	// 3 - M�todo est�tico getInstance

	public static Properties getInstace() {
		if (prop == null) {
			prop = new Properties();
			try {
	// carregar o objeto com os dados do arquivo
				prop.load(ConfiguracaoSingleton.class.getResourceAsStream("/configuracao.properties"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return prop;
	}

}
