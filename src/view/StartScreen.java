package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.BaseAccessDAO;

public class StartScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private BaseAccessDAO dao = new BaseAccessDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartScreen frame = new StartScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartScreen() {
		
		//Propriedades da janela
		setType(Type.UTILITY);
		setForeground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 392);
		
		//Propriedades do painel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Propriedades do botão
		JButton btnSeguir = new JButton("SEGUIR");
		btnSeguir.setForeground(new Color(0, 0, 0));
		btnSeguir.setBounds(375, 182, 89, 21);
		btnSeguir.setFont(new Font("Open Sans", Font.PLAIN, 14));
		contentPane.add(btnSeguir);
		
		//Propriedades do Combobox 
		JComboBox<String> comboCondominios = new JComboBox<String>();
		comboCondominios.setForeground(new Color(0, 0, 0));
		comboCondominios.setMaximumRowCount(30);
		comboCondominios.setToolTipText("Condom\u00EDnio");
		comboCondominios.setBounds(179, 182, 184, 20);
		preencherComboCondominio(comboCondominios);
		contentPane.add(comboCondominios);
		
		//Propriedades do label
		JLabel lblControlePortaria = new JLabel("Controle de Portaria");
		lblControlePortaria.setForeground(new Color(0, 0, 0));
		lblControlePortaria.setFont(new Font("Open Sans", Font.BOLD, 40));
		lblControlePortaria.setBounds(84, 53, 448, 99);
		contentPane.add(lblControlePortaria);
		
		//Propriedades do label
		JLabel lblCondomnio = new JLabel("Condom\u00EDnio:");
		lblCondomnio.setForeground(new Color(0, 0, 0));
		lblCondomnio.setFont(new Font("Open Sans", Font.BOLD, 14));
		lblCondomnio.setBounds(84, 184, 102, 14);
		contentPane.add(lblCondomnio);
		
		//Propriedades do label (imagem de fundo)
		JLabel imagemFundo = new JLabel("");
		imagemFundo.setIcon(new ImageIcon(StartScreen.class.getResource("/images/portaria.png")));
		imagemFundo.setBounds(0, 0, 704, 353);
		contentPane.add(imagemFundo);
	}
	
	/**
	 * Preenche o combo de condomínios da tela inicial
	 * @param comboCondominios
	 */
	public void preencherComboCondominio(JComboBox<String> comboCondominios) {
		for (String item : dao.retornaCondominios()) {
			comboCondominios.addItem(item);
		}
	}
	
}
