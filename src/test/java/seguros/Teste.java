package seguros;

import org.junit.Assert;
import org.junit.Test;

import br.unibh.seguros.entidades.Funcionario;
import br.unibh.seguros.entidades.Segurado;

public class Teste {
	
	@Test
	public void criarObjetos(){
		Funcionario funcionario = new Funcionario("RH","João","joao","12345");
		Assert.assertEquals("João",funcionario.getPerfil());
		
		//Segurado segurado = new Segurado("B", "111111", "SSP-MG", "1111111", "AB", "11/2022", dataPrimeiraHabilitacao, logradouro, numero, complemento, cep, bairro, cidade, estado)
	}

}
