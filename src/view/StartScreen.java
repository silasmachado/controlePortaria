package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class StartScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setType(Type.UTILITY);
		setForeground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSeguir = new JButton("SEGUIR");
		btnSeguir.setForeground(new Color(0, 0, 0));
		btnSeguir.setBounds(375, 182, 89, 21);
		btnSeguir.setFont(new Font("Open Sans", Font.PLAIN, 14));
		contentPane.add(btnSeguir);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--SELECIONE--", "ASTORIA", "COLIBRI", "MARAVILHA"}));
		comboBox.setMaximumRowCount(30);
		comboBox.setToolTipText("Condom\u00EDnio");
		comboBox.setBounds(179, 182, 184, 20);
		contentPane.add(comboBox);
		
		JLabel lblCondomnio = new JLabel("Condom\u00EDnio:");
		lblCondomnio.setForeground(new Color(0, 0, 0));
		lblCondomnio.setFont(new Font("Open Sans", Font.BOLD, 14));
		lblCondomnio.setBounds(84, 184, 102, 14);
		contentPane.add(lblCondomnio);
		
		JLabel lblNewLabel = new JLabel("Controle de Portaria");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Open Sans", Font.BOLD, 40));
		lblNewLabel.setBounds(84, 53, 448, 99);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(StartScreen.class.getResource("/images/portaria.png")));
		label.setBounds(0, 0, 704, 353);
		contentPane.add(label);
	}
}
