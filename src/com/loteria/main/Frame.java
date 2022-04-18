package com.loteria.main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txbNumApostas;
	private JTextField txbSalvarEm;
	private JTextField txbNum;
	private JTextField txbTotalNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setTitle("Gerador de Números da Loteria");
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					
					frame.setIcon();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	void setIcon() throws FileNotFoundException {
		setIconImage(new ImageIcon(getClass().getResource("/icone-png.png")).getImage());
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gerador de N\u00FAmeros da Loteria");
		lblNewLabel.setBounds(-30, 11, 434, 18);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apostas");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(205, 119, 92, 35);
		contentPane.add(lblNewLabel_1);
		
		txbNumApostas = new JTextField();
		txbNumApostas.setHorizontalAlignment(SwingConstants.CENTER);
		txbNumApostas.setFont(new Font("Arial", Font.PLAIN, 17));
		txbNumApostas.setBounds(152, 123, 43, 26);
		contentPane.add(txbNumApostas);
		txbNumApostas.setColumns(2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gerar");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(87, 119, 55, 35);
		contentPane.add(lblNewLabel_1_1);
		
		JRadioButton rdBtnSalvarEm = new JRadioButton("Gerar arquivo de texto no mesmo local do programa");
		rdBtnSalvarEm.addActionListener(new ActionListener() {
			
			boolean isDisabled = false;
			
			public void actionPerformed(ActionEvent e) {
				isDisabled = !isDisabled;
				
				txbSalvarEm.setEnabled(!isDisabled);
			}
			
		});
		rdBtnSalvarEm.setBounds(24, 277, 320, 23);
		contentPane.add(rdBtnSalvarEm);
		
		txbSalvarEm = new JTextField();
		txbSalvarEm.setBounds(150, 250, 183, 20);
		contentPane.add(txbSalvarEm);
		txbSalvarEm.setColumns(10);
		
		JLabel txtNumValido = new JLabel("Por Favor insira um n\u00FAmero v\u00E1lido!");
		txtNumValido.setVisible(false);
		txtNumValido.setForeground(Color.RED);
		txtNumValido.setFont(new Font("Arial", Font.BOLD, 16));
		txtNumValido.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumValido.setBounds(37, 66, 296, 14);
		contentPane.add(txtNumValido);
		
		JLabel lblNewLabel_2 = new JLabel("Salvar Texto Em");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(24, 249, 118, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblGeradoSuc = new JLabel("Gerado arquivo com apostas com sucesso!");
		lblGeradoSuc.setForeground(new Color(51, 102, 0));
		lblGeradoSuc.setHorizontalAlignment(SwingConstants.CENTER);
		lblGeradoSuc.setFont(new Font("Arial", Font.BOLD, 13));
		lblGeradoSuc.setBounds(24, 40, 334, 14);
		lblGeradoSuc.setVisible(false);
		contentPane.add(lblGeradoSuc);
		
		JLabel lblNewLabel_3 = new JLabel("Com");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(97, 165, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txbNum = new JTextField();
		txbNum.setFont(new Font("Arial", Font.PLAIN, 17));
		txbNum.setHorizontalAlignment(SwingConstants.CENTER);
		txbNum.setBounds(152, 162, 43, 24);
		contentPane.add(txbNum);
		txbNum.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("N\u00FAmeros");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(205, 165, 81, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Entre 1 e");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(97, 209, 81, 14);
		contentPane.add(lblNewLabel_5);
		
		txbTotalNum = new JTextField();
		txbTotalNum.setFont(new Font("Arial", Font.PLAIN, 17));
		txbTotalNum.setHorizontalAlignment(SwingConstants.CENTER);
		txbTotalNum.setColumns(10);
		txbTotalNum.setBounds(172, 206, 43, 24);
		contentPane.add(txbTotalNum);
		
		JLabel lblAvisoArray = new JLabel("O n\u00FAmero do total n\u00E3o pode ser menor do que o de n\u00FAmeros!");
		lblAvisoArray.setForeground(Color.RED);
		lblAvisoArray.setFont(new Font("Arial", Font.BOLD, 11));
		lblAvisoArray.setBounds(10, 94, 347, 14);
		lblAvisoArray.setVisible(false);
		contentPane.add(lblAvisoArray);
		
		JButton btnGerar = new JButton("Gerar!");
		btnGerar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					int numJogos = Integer.parseInt(txbNumApostas.getText());
					
					Main main = new Main();
					
					try {
						main.jogar(numJogos, txbSalvarEm.getText(), Integer.parseInt(txbNum.getText()), Integer.parseInt(txbTotalNum.getText()));
						
						lblAvisoArray.setVisible(false);
						txtNumValido.setVisible(false);
						
						lblGeradoSuc.setVisible(true);
					} catch (IOException a) {
						File folder = new File("/" + txbSalvarEm.getText() + "/");
						folder.mkdir(); //mkdir cria uma nova pasta com o nome que vc colocou no salvar em
						
						try {
							main.jogar(numJogos, txbSalvarEm.getText(), Integer.parseInt(txbNum.getText()), Integer.parseInt(txbTotalNum.getText()));
						} catch (IOException naoCaiaAqui) {} // esse catch nunca deve acontecer
						
 					} catch (ArrayIndexOutOfBoundsException b) {
 						lblAvisoArray.setVisible(true);
 						
 						try {
 							main.jogar(numJogos, txbSalvarEm.getText(), Integer.parseInt(txbNum.getText()), Integer.parseInt(txbTotalNum.getText()));
 						} catch (Exception naoCaiaAquiTbm) {} // esse catch nunca deve acontecer também
 					}
					
				} catch (NumberFormatException a) {
					txtNumValido.setVisible(true);
				}
			}
			
		});
		btnGerar.setBounds(24, 307, 320, 23);
		contentPane.add(btnGerar);
	}
}
