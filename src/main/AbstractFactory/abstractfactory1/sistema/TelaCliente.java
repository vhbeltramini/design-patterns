package main.AbstractFactory.abstractfactory1.sistema;

import main.AbstractFactory.abstractfactory1.dao.abstractfactory.ClienteDados;
import main.AbstractFactory.abstractfactory1.dao.abstractfactory.DadosFactory;
import main.AbstractFactory.abstractfactory1.dao.abstractfactory.PedidoDados;
import main.AbstractFactory.abstractfactory1.dao.randomaccessfactory.DadosRandomAccess;
import main.AbstractFactory.abstractfactory1.dao.xmlfactory.DadosXML;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class TelaCliente {

	public static void main(String[] args) throws Exception {

		DadosFactory dadosFac = createFactory();
		ClienteDados cliDados = dadosFac.createCliente();
		PedidoDados pediDados = dadosFac.createPedido();
		// daqui por diante a aplicacao usado cliDados e pediDados sem realmente saber se eh XML ou RandomAccess
		
		cliDados.ler();
		cliDados.imprimir();
		
		pediDados.ler();
		pediDados.lerItens();
		
	}

	private static DadosFactory createFactory() throws Exception {
		// com base na leitura de algum arquivo de configuracao
	   	Properties props = new Properties();
    	props.load(new InputStreamReader(new FileInputStream("conf.properties")));
    	String factory = props.getProperty("factory");
    	if (factory.equals("xml"))
    		return new DadosXML();
    	else
    		return new DadosRandomAccess();
	}

}
