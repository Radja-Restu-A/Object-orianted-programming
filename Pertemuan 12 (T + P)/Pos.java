import javax.swing.*;
import java.awt.*;

public class Pos {
    public static void main(String[] args) {
        // Membuat frame (jendela utama)
        JFrame frame = new JFrame("Data Customer");

        // Mengatur layout untuk frame dengan BorderLayout
        frame.setLayout(new BorderLayout());

        // Judul label
        JLabel judul = new JLabel("APLIKASI PEMESANAN", SwingConstants.CENTER);
        judul.setFont(new Font("Arial", Font.BOLD, 15));

        // Membuat panel untuk menampung form
        JPanel panelCust = new JPanel();
        panelCust.setLayout(new GridLayout(4, 2, 10, 10));
        panelCust.setBorder(BorderFactory.createTitledBorder("Pilih Menu"));
        panelCust.setPreferredSize(new Dimension(350, 190));

        // Membuat label dan field untuk Nama
        JLabel nameLabel = new JLabel("Nama :");
        JTextField nameField = new JTextField(20);

        // Membuat label dan field untuk Alamat
        JLabel addressLabel = new JLabel("Alamat :");
        JTextField addressField = new JTextField(20);

        // Membuat label dan field untuk No Telepon
        JLabel phoneLabel = new JLabel("No Telp :");
        JTextField phoneField = new JTextField(20);

        // Menambahkan komponen ke dalam panel
        panelCust.add(nameLabel);
        panelCust.add(nameField);
        panelCust.add(addressLabel);
        panelCust.add(addressField);
        panelCust.add(phoneLabel);
        panelCust.add(phoneField);

        JPanel panelMenu = new JPanel();
        panelMenu.setLayout(new GridLayout(3,2,10,10));
        // Menambahkan komponen ke dalam frame
        frame.add(judul, BorderLayout.NORTH);
        frame.add(panelCust, BorderLayout.WEST); // Menempatkan panelMenu di sebelah kiri

        // Mengatur ukuran frame
        frame.setSize(1000, 800);

        // Menutup aplikasi saat jendela ditutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
