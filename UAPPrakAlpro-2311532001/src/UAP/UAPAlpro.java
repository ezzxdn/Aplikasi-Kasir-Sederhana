package UAP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class UAPAlpro {

	private JFrame frame;
	private JTextField txtHarga;
	private JTextField txtJumlah;
	private JTextField txtTotal;
	private JTextField txtJmlBayar;
	private JTextField txtKembalian;
	
	double harga, jumlah, total, bayar, Kembalian, kembalian;
	String pembayaran;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UAPAlpro window = new UAPAlpro();
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
	public UAPAlpro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 884, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PASTRY HOUSE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(313, 47, 258, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel Menu = new JLabel("Pilih Menu");
		Menu.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Menu.setBounds(60, 149, 104, 32);
		frame.getContentPane().add(Menu);
		
		JLabel Harga = new JLabel("Harga");
		Harga.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Harga.setBounds(60, 188, 104, 32);
		frame.getContentPane().add(Harga);
		
		JLabel Jumlah = new JLabel("Jumlah");
		Jumlah.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Jumlah.setBounds(60, 228, 104, 32);
		frame.getContentPane().add(Jumlah);
		
		JLabel Total = new JLabel("Total Harga");
		Total.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Total.setBounds(60, 271, 104, 32);
		frame.getContentPane().add(Total);
		
		JLabel Metode = new JLabel("Pembayaran");
		Metode.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Metode.setBounds(60, 314, 104, 32);
		frame.getContentPane().add(Metode);
		
		JLabel JmlBayar = new JLabel("Jumlah Bayar");
		JmlBayar.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		JmlBayar.setBounds(60, 357, 104, 32);
		frame.getContentPane().add(JmlBayar);
		
		JLabel Kembalian = new JLabel("Kembalian");
		Kembalian.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Kembalian.setBounds(60, 396, 104, 32);
		frame.getContentPane().add(Kembalian);
		
		txtHarga = new JTextField();
		txtHarga.setBounds(237, 194, 212, 24);
		frame.getContentPane().add(txtHarga);
		txtHarga.setColumns(10);
		
		String[] menu = {"Pilih di sini", "Croissant", "Chocolate Eclair", "Choux au Craquelin", "Cinnamon Rolls", "Cromboloni"};
		int[] harga = {0, 20000, 20000, 15000, 15000, 25000};
		
		txtJumlah = new JTextField();
		txtJumlah.setColumns(10);
		txtJumlah.setBounds(237, 234, 212, 24);
		frame.getContentPane().add(txtJumlah);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(237, 269, 212, 24);
		frame.getContentPane().add(txtTotal);
		
		txtJmlBayar = new JTextField();
		txtJmlBayar.setColumns(10);
		txtJmlBayar.setBounds(237, 357, 212, 24);
		frame.getContentPane().add(txtJmlBayar);
		
		txtKembalian = new JTextField();
		txtKembalian.setColumns(10);
		txtKembalian.setBounds(237, 404, 212, 24);
		frame.getContentPane().add(txtKembalian);
		
		JComboBox<String> cbMenu = new JComboBox<>();
		cbMenu.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbMenu.setModel(new DefaultComboBoxModel(new String[] {"Pilih di sini", "Croissant", "Chocolate Eclair", "Choux au Craquelin", "Cinnamon Rolls", "Cromboloni"}));
		cbMenu.setBounds(237, 149, 212, 22);
		frame.getContentPane().add(cbMenu);
		cbMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = cbMenu.getSelectedIndex();
                txtHarga.setText(String.valueOf(harga[selectedIndex]));
            }
        });;
		
		JComboBox cbMetode = new JComboBox();
		cbMetode.setModel(new DefaultComboBoxModel(new String[] {"Pilih di sini", "Cash", "QRIS"}));
		cbMetode.setBounds(237, 321, 212, 22);
		frame.getContentPane().add(cbMetode);
		
		JButton btnHitung = new JButton("HITUNG");
		btnHitung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double harga, jumlah;
				harga = Double.parseDouble(txtHarga.getText());
				jumlah = Integer.parseInt(txtJumlah.getText());
				
				total = 0;
				
				for (int i=0; i < menu.length; i++) {
					if (menu[i].equals(cbMenu.getSelectedItem())) {
						total = harga * jumlah;
						break;
					}
				}
				txtTotal.setText(String.format("%.2f", total));
			}
		});
		btnHitung.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnHitung.setBounds(548, 235, 104, 23);
		frame.getContentPane().add(btnHitung);
		
		JLabel lblInfo = new JLabel("");
		lblInfo.setBounds(33, 490, 515, 78);
		frame.getContentPane().add(lblInfo);
		
		JButton btnProses = new JButton("PROSES");
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String metode = cbMetode.getSelectedItem().toString();
				String kembalian;
		        double Kembalian;
		        
		        double total = Double.parseDouble(txtTotal.getText());
		        double bayar = Double.parseDouble(txtJmlBayar.getText());
		        
		        Kembalian = bayar - total;
		        kembalian = String.format("%2.2f", Kembalian);
		        txtKembalian.setText(kembalian);
		        
		        if (metode.equals("Cash")) {
		            if (Kembalian == bayar) {
		                lblInfo.setText("Terima kasih telah berkunjung!");
		            } else if (bayar > Kembalian) {
		            	txtKembalian.setText(kembalian);
		            }
		        } else if (metode.equals("QRIS")) {
		            lblInfo.setText("Terima kasih telah berkunjung!");
		        } else {
		            lblInfo.setText("Metode pembayaran tidak valid.");
		        }
			}
		});
		btnProses.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnProses.setBounds(548, 362, 104, 23);
		frame.getContentPane().add(btnProses);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHarga.setText(null);
				txtJumlah.setText(null);
				txtTotal.setText(null);
				txtJmlBayar.setText(null);
				txtKembalian.setText(null);
				cbMenu.setSelectedIndex(0);
				cbMetode.setSelectedIndex(0);
				lblInfo.setText(null);
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnReset.setBounds(661, 527, 104, 23);
		frame.getContentPane().add(btnReset);

	}
}
