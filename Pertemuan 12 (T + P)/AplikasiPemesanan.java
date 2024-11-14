import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplikasiPemesanan {
    private JCheckBox steakCheckBox;
    private JCheckBox sphagetiCheckBox;
    private JCheckBox pizzaCheckBox;
    private JButton TAMBAHButton;
    private JTextField telpField;
    private JTextField alamatField;
    private JScrollPane Scroll;
    private JTextField namaField;
    private JTextArea textArea1;
    private JTextArea Total;
    private JPanel Pos;
    private JPanel Main;


    public AplikasiPemesanan() {
        TAMBAHButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean steak = steakCheckBox.isSelected();
                boolean sphageti = sphagetiCheckBox.isSelected();
                boolean pizza = pizzaCheckBox.isSelected();
                String nama = namaField.getText();
                String alamat =  alamatField.getText();
                String telp = telpField.getText();
                int total = 0;

                textArea1.append("Nama : " + nama);
                textArea1.append("\nAlamat : " + alamat);
                textArea1.append("\nTelp :" + telp);
                textArea1.append("\n---------------------------------\nPesanan : \n");
                if(steak){
                    textArea1.append("  -Steak 60000\n");
                    total += 60000;
                }
                if(sphageti){
                    textArea1.append("  -Steak 40000\n");
                    total += 40000;
                }
                if(pizza){
                    textArea1.append("  -Steak 80000\n");
                    total += 80000;
                }
                textArea1.append("---------------------------------\nTotal Bayar : " + total);
                Total.append(String.valueOf(total));
            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("AplikasiPemesanan");
        frame.setContentPane(new AplikasiPemesanan().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
