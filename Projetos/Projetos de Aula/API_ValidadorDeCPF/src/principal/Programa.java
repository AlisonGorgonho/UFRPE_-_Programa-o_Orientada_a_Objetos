package principal;

import negocio.BuscaCEP;

import java.io.IOException;

import javax.swing.JOptionPane;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class Programa {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		String cpf = JOptionPane.showInputDialog("Digite um cpf para fazer a valida��o: ");
		CPFValidator validador = new CPFValidator();
		
		try {
			validador.assertValid(cpf);
			System.out.println("CPF validado com sucesso!");
			
		} catch (InvalidStateException e) {
			// TODO: handle exception
			System.out.println("Erro: " + e.getInvalidMessages() + " n�o foi possivel validar este CPF!");
		}
		
		BuscaCEP buscaCep = new BuscaCEP();
		
		String cep = JOptionPane.showInputDialog("Digite um cep para fazer a valida��o: ");
		
		System.out.println("Estado: " + buscaCep.getUF(cep) + "\n" +
						   "Cidade: " + buscaCep.getCidade(cep) + "\n" +
						   "Bairro: " + buscaCep.getBairro(cep) + "\n" +
						   "Rua: "    + buscaCep.getEndereco(cep));

	}

}
