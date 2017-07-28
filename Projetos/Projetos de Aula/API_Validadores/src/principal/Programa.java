package principal;

import javax.swing.JOptionPane;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cpf = JOptionPane.showInputDialog("Digite um cpf para fazer a validação: ");
		CPFValidator validador = new CPFValidator();
		
		try {
			validador.assertValid(cpf);
			System.out.println("CPF validado com sucesso!");
			
		} catch (InvalidStateException e) {
			// TODO: handle exception
			System.out.println("Erro: " + e.getInvalidMessages() + " não foi possivel validar este CPF!");
		}
		
	}

}
