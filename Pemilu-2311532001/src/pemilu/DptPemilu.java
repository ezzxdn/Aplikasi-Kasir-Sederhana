package pemilu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DptPemilu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNama;
	private JTextField textUmur;
	private JComboBox cbMenikah;
	JLabel lblInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DptPemilu frame = new DptPemilu();
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
	public DptPemilu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aplikasi DPT Pemilu 2024");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(79, 23, 298, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nama");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBounds(29, 72, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		textNama = new JTextField();
		textNama.setBounds(128, 72, 238, 20);
		contentPane.add(textNama);
		textNama.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Umur");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(29, 107, 49, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Menikah");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_1_1.setBounds(29, 143, 78, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textUmur = new JTextField();
		textUmur.setColumns(10);
		textUmur.setBounds(128, 106, 96, 20);
		contentPane.add(textUmur);
		
		JComboBox cbMenikah = new JComboBox();
		cbMenikah.setModel(new DefaultComboBoxModel(new String[] {"ya", "tidak"}));
		cbMenikah.setBounds(128, 141, 67, 22);
		contentPane.add(cbMenikah);
		
		JLabel lblInfo = new JLabel("");
		lblInfo.setBounds(29, 182, 344, 36);
		contentPane.add(lblInfo);
		
		JButton btnNewButton = new JButton("PROSES");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textNama.getText();
				int umur = Integer.parseInt(textUmur.getText());
				String status = cbMenikah.getSelectedItem().toString();
				
				if (umur > 17) {
					lblInfo.setText(n+", Anda terdaftar di DPT Pemilu 2024");
					} else if ((umur < 17)&&(status.equals("ya"))) {
						lblInfo.setText(n+", Anda terdaftar di DPT Pemilu 2024");
					} else if ((umur < 17)&&(!status.equals("ya"))) {
						lblInfo.setText(n+", Anda tidak terdaftar di DPT Pemilu 2024");
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(41, 229, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNama.setText("");
				textUmur.setText("");
				cbMenikah.setSelectedIndex(0);
				lblInfo.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnReset.setBounds(288, 229, 89, 23);
		contentPane.add(btnReset);
		
		
	}
}
