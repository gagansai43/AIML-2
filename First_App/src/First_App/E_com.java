package First_App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class E_com {
	int i=0;
	

	private JFrame frame;
	private JTextField txtRs;
	private JTextField textField_1;
	private JTextField txtRs_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E_com window = new E_com();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public E_com() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\m2.jpg"));
		lblNewLabel_1.setBounds(10, 11, 191, 317);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\m5.jpg"));
		lblNewLabel_2.setBounds(595, 27, 266, 309);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtRs = new JTextField();
		txtRs.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtRs.setText("RS 1,20,000");
		txtRs.setBounds(41, 319, 129, 20);
		frame.getContentPane().add(txtRs);
		txtRs.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("    1,50,000");
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textField_1.setBounds(693, 340, 102, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "6gb", "8gb", "64gb"}));
		comboBox.setBounds(70, 341, 75, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"select", "4gb", "6gb"}));
		comboBox_1.setBounds(717, 373, 65, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("APPLE STORE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(334, 11, 209, 20);
		frame.getContentPane().add(lblNewLabel);
		JLabel lb = new JLabel("CART :");
		lb.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lb.setBounds(773, 455, 102, 30);
		frame.getContentPane().add(lb);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	i++;
				lb.setText("CART : "+i);
			}
		});
		btnNewButton.setBounds(70, 374, 89, 20);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		JLabel lb1 = new JLabel("CART :");
		lb1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lb1.setBounds(773, 455, 102, 30);
		frame.getContentPane().add(lb1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb1.setText("CART : "+i);
			}
		});
		btnNewButton_1.setBounds(706, 406, 89, 20);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\m2.jpg"));
		lblNewLabel_3.setBounds(314, 52, 201, 262);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtRs_1 = new JTextField();
		txtRs_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtRs_1.setText("Rs 80,000");
		txtRs_1.setBounds(348, 321, 102, 20);
		frame.getContentPane().add(txtRs_1);
		txtRs_1.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"select", "4gb"}));
		comboBox_2.setBounds(369, 352, 65, 22);
		frame.getContentPane().add(comboBox_2);
		
		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.setBounds(359, 385, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 918, 572);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
