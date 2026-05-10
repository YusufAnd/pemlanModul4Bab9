import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormDaftarUlang extends JFrame implements ActionListener {
    JLabel lblNama, lblTanggal,lblNoDaftar, lblTelp, lblAlamat, lblEmail;
    JTextField tfNama, tfTanggal, tfNoDaftar, tfTelp, tfEmail;
    JTextArea taAlamat;
    JButton btnSubmit;

    public FormDaftarUlang(){
        setTitle("Form Pendaftaran Mahasiswa");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        lblNama = new JLabel("Nama Lengkap");
        lblTanggal = new JLabel("Tanggal Lahir");
        lblNoDaftar = new JLabel("Nomor Pendaftaran");
        lblTelp = new JLabel("No.Telp");
        lblAlamat = new JLabel("Alamat");
        lblEmail = new JLabel("E-mail");

        tfNama = new JTextField();
        tfTanggal = new JTextField();
        tfNoDaftar = new JTextField();
        tfTelp = new JTextField();
        tfEmail = new JTextField();

        taAlamat = new JTextArea();

        btnSubmit = new JButton("Submit");

        lblNama.setBounds(40, 30, 150, 25);
        tfNama.setBounds(200, 30, 220, 25);

        lblTanggal.setBounds(40, 70, 150, 25);
        tfTanggal.setBounds(200, 70, 220, 25);

        lblNoDaftar.setBounds(40, 110, 150, 25);
        tfNoDaftar.setBounds(200, 110, 220, 25);

        lblTelp.setBounds(40, 150, 150, 25);
        tfTelp.setBounds(200, 150, 220, 25);

        lblAlamat.setBounds(40, 190, 150, 25);
        taAlamat.setBounds(200, 190, 220, 70);

        lblEmail.setBounds(40, 280, 150, 25);
        tfEmail.setBounds(200, 280, 220, 25);
        btnSubmit.setBounds(320, 330, 100, 30);

        panel.add(lblNama);
        panel.add(tfNama);

        panel.add(lblTanggal);
        panel.add(tfTanggal);

        panel.add(lblNoDaftar);
        panel.add(tfNoDaftar);

        panel.add(lblTelp);
        panel.add(tfTelp);

        panel.add(lblAlamat);
        panel.add(taAlamat);

        panel.add(lblEmail);
        panel.add(tfEmail);

        panel.add(btnSubmit);

        btnSubmit.addActionListener(this);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (tfNama.getText().isEmpty() || tfTanggal.getText().isEmpty() || tfNoDaftar.getText().isEmpty() || tfTelp.getText().isEmpty() || taAlamat.getText().isEmpty() || tfEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            int pilih = JOptionPane.showConfirmDialog(this, "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
            if (pilih == JOptionPane.OK_OPTION) {
                JFrame hasil = new JFrame("Data Mahasiswa");
                hasil.setSize(500, 350);
                hasil.setLocationRelativeTo(null);

                JPanel panelHasil = new JPanel();
                panelHasil.setLayout(null);
                panelHasil.setBackground(new Color(230, 230, 230));

                //Judul
                JLabel title = new JLabel("Data Mahasiswa");
                title.setFont(new Font("Arial", Font.BOLD, 18));
                title.setBounds(170, 20, 200, 30);

                JPanel kotak = new JPanel();
                kotak.setLayout(null);
                kotak.setBackground(Color.WHITE);
                kotak.setBorder(BorderFactory.createLineBorder(Color.BLUE));

                kotak.setBounds(50, 70, 370, 210);

                JLabel data = new JLabel("<html>" +  "Nama &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : " + tfNama.getText() + "<br>" +  "Tanggal Lahir &nbsp; : " + tfTanggal.getText() + "<br>" + "No.Pendaftaran : " + tfNoDaftar.getText() + "<br>" +  "No.Telp &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : " + tfTelp.getText() + "<br>" + "Alamat &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : " + taAlamat.getText() + "<br>" + "E-mail &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : " + tfEmail.getText() + "</html>");
                data.setFont(new Font("Arial", Font.PLAIN, 12));
                data.setBounds(5, 0, 320, 150);

                kotak.add(data);

                panelHasil.add(title);
                panelHasil.add(kotak);

                hasil.add(panelHasil);
                hasil.setVisible(true);
            }
        }
    }   
    public static void main(String[] args) {
        new FormDaftarUlang();
    }
}
