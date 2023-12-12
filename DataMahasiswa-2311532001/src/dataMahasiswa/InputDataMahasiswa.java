package dataMahasiswa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InputDataMahasiswa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNama;
	private JTextField textNIM;
	private JComboBox cbJurusan;
	JLabel lblInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputDataMahasiswa frame = new InputDataMahasiswa();
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
	public InputDataMahasiswa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Input Data Mahasiswa");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(83, 11, 294, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nama");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(31, 58, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NIM");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(30, 89, 49, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Jurusan");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(30, 125, 74, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textNama = new JTextField();
		textNama.setBounds(129, 55, 192, 20);
		contentPane.add(textNama);
		textNama.setColumns(10);
		
		textNIM = new JTextField();
		textNIM.setBounds(129, 89, 192, 20);
		contentPane.add(textNIM);
		textNIM.setColumns(10);
		
		JComboBox cbJurusan = new JComboBox();
		cbJurusan.setModel(new DefaultComboBoxModel(new String[] {"Teknik Komputer", "Sistem Informasi", "Informatika"}));
		cbJurusan.setBounds(128, 124, 193, 21);
		contentPane.add(cbJurusan);
		
		JLabel lblInfo = new JLabel("");
		lblInfo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblInfo.setBounds(31, 165, 324, 58);
		contentPane.add(lblInfo);
		
		JButton btnSimpan = new JButton("Simpan");
		btnSimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textNama.getText();
				long NIM = Long.parseLong(textNIM.getText());
				String Jurusan = cbJurusan.getSelectedItem().toString();
				
				lblInfo.setText("Data Anda berhasil disimpan.");
			}
		});
		btnSimpan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSimpan.setBounds(41, 229, 89, 23);
		contentPane.add(btnSimpan);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNama.setText("");
				textNIM.setText("");
				cbJurusan.setSelectedIndex(0);
				lblInfo.setText("");
			}

		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnReset.setBounds(292, 229, 89, 23);
		contentPane.add(btnReset);
	}
}
