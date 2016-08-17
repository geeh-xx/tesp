package seguros;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.unibh.seguros.entidades.Funcionario;
import br.unibh.seguros.entidades.Segurado;
import br.unibh.seguros.entidades.Setor;

public class Teste {
	
	Funcionario funcionario = new Funcionario("RH","João","joao","12345");

	Segurado segurado = new Segurado("Teste", "12345", "SSP-MG","12345", "B",
			new Date(),new Date(), "Rua", "meca", "195", 
			"30590390","betania", "BH", "MG");
	
	Setor setor = new Setor(new Long(1), "Recursos Humanos", "RH");
	
	@Test
	public void criarObjetos(){
		Assert.assertEquals("João",funcionario.getPerfil());
		
		Assert.assertEquals("12345",segurado.getNumeroRG());

		Assert.assertEquals("RH",setor.getSigla());
		
	}
	
	@Test
	public void comparaObjetos(){

		Segurado segurado2 = segurado;
		Funcionario funcionario2 = funcionario;
		Setor setor2 = setor;
		
		Assert.assertEquals(segurado, segurado2);
		Assert.assertEquals(funcionario, funcionario2);
		Assert.assertEquals(setor, setor2);		
		
	}
	

}
