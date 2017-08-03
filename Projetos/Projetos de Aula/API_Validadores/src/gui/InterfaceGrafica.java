package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import negocio.BuscaCEP;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class InterfaceGrafica {

	private JFrame frmConsultaDeCep;
	private JTextField textCEP_1;
	private JTextField textEstado;
	private JTextField textCidade;
	private JTextField textBairro;
	private JTextField textRua;
	private JLabel lblifem;
	private JTextField textCEP_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGrafica window = new InterfaceGrafica();
					window.frmConsultaDeCep.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConsultaDeCep = new JFrame();
		frmConsultaDeCep.setTitle("Consulta de CEP");
		frmConsultaDeCep.setBounds(100, 100, 450, 331);
		frmConsultaDeCep.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConsultaDeCep.getContentPane().setLayout(null);
		
		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setBounds(10, 14, 46, 14);
		frmConsultaDeCep.getContentPane().add(lblCEP);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(10, 62, 46, 14);
		frmConsultaDeCep.getContentPane().add(lblEstado);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 107, 46, 14);
		frmConsultaDeCep.getContentPane().add(lblCidade);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(10, 160, 46, 14);
		frmConsultaDeCep.getContentPane().add(lblBairro);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(10, 212, 46, 14);
		frmConsultaDeCep.getContentPane().add(lblRua);
		
		textCEP_1 = new JTextField();
		textCEP_1.setBounds(87, 11, 86, 20);
		frmConsultaDeCep.getContentPane().add(textCEP_1);
		textCEP_1.setColumns(10);
		
		textEstado = new JTextField();
		textEstado.setBounds(87, 59, 297, 20);
		frmConsultaDeCep.getContentPane().add(textEstado);
		textEstado.setColumns(10);
		
		textCidade = new JTextField();
		textCidade.setBounds(87, 104, 297, 20);
		frmConsultaDeCep.getContentPane().add(textCidade);
		textCidade.setColumns(10);
		
		textBairro = new JTextField();
		textBairro.setBounds(87, 157, 297, 20);
		frmConsultaDeCep.getContentPane().add(textBairro);
		textBairro.setColumns(10);
		
		textRua = new JTextField();
		textRua.setBounds(87, 209, 297, 20);
		frmConsultaDeCep.getContentPane().add(textRua);
		textRua.setColumns(10);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				BuscaCEP buscacep = new BuscaCEP();
				try {
					textEstado.setText(buscacep.getUF(textCEP_1.getText()+textCEP_2.getText()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				try {
					textCidade.setText(buscacep.getCidade(textCEP_1.getText()+textCEP_2.getText()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				try {
					textBairro.setText(buscacep.getBairro(textCEP_1.getText()+textCEP_2.getText()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				try {
					textRua.setText(buscacep.getEndereco(textCEP_1.getText()+textCEP_2.getText()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
			
			
		});
		btnValidar.setBounds(174, 258, 89, 23);
		frmConsultaDeCep.getContentPane().add(btnValidar);
		
		lblifem = new JLabel("  -");
		lblifem.setBounds(174, 14, 20, 14);
		frmConsultaDeCep.getContentPane().add(lblifem);
		
		textCEP_2 = new JTextField();
		textCEP_2.setBounds(193, 11, 46, 20);
		frmConsultaDeCep.getContentPane().add(textCEP_2);
		textCEP_2.setColumns(10);
	}
}
