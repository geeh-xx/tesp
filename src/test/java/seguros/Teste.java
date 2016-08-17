package seguros;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.unibh.seguros.entidades.Funcionario;
import br.unibh.seguros.entidades.Segurado;
import br.unibh.seguros.entidades.Setor;

public class Teste {
	
	Funcionario funcionario = new Funcionario(new Long(1), "RH","João","joao","12345", null, null, null, null, null);
	Funcionario funcionario2 = new Funcionario(new Long(1), "RH","João","joao","12345", null, null, null, null, null);
	Funcionario funcionario3 = new Funcionario(new Long(2), "João","pedro","Teste","4332", "Teste", "Teste", "Teste", new Date(), new Date());

	Segurado segurado = new Segurado(new Long(1), "Teste", "12345", "SSP-MG","12345", "B",
			null, null, new Date(),new Date(), "Rua", "meca", "195", 
			"30590390","betania", null, null, "BH", "MG", null, null, null, null, null);
	Segurado segurado2 = new Segurado(new Long(1), "Teste", "12345", "SSP-MG","12345", "B",
			null, null, new Date(),new Date(), "Rua", "meca", "195", 
			"30590390","betania", null, null, "BH", "MG", null, null, null, null, null);
	Segurado segurado3 = new Segurado(new Long(2), "Teste", "12345", "SSP-MG","12345", "B",
			null, null, new Date(),new Date(), "Rua", "meca", "195", 
			"30590390","betania", null, null, "BH", "MG", null, null, null, null, null);
	
	
	Setor setor = new Setor(new Long(1), "Recursos Humanos", "RH");
	Setor setor2 = new Setor(new Long(1), "Recursos Humanos", "RH");
	Setor setor3 = new Setor(new Long(2), "Recursos Humanos", "RH");
	
	@Test
	public void testeFuncionario(){
		Assert.assertEquals(new Long(1),funcionario.getId());
		System.out.println(funcionario);
		Assert.assertNotNull(funcionario);
		
		Assert.assertTrue(funcionario.equals(funcionario2));
		Assert.assertFalse(funcionario.equals(funcionario3));
		
	}
	
	@Test
	public void testeSegurado(){

		Assert.assertEquals(new Long(1),segurado.getId());
		System.out.println(segurado);
		Assert.assertNotNull(segurado);
		
		Assert.assertTrue(segurado.equals(segurado2));
		Assert.assertFalse(segurado.equals(segurado3));
		
	}
	
	@Test
	public void testeSetor(){

		Assert.assertEquals("RH",setor.getSigla());
		System.out.println(setor);
		Assert.assertNotNull(setor);
		
		Assert.assertTrue(setor.equals(setor2));
		Assert.assertFalse(setor.equals(setor3));
		
	}
	
	
}
