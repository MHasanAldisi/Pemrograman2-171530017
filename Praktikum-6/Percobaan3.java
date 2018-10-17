import javax.swing.JOptionPane;

public class Percobaan3{
    public static void main(String[]args){

        String nim="", nama="", tempat="", tgllahir="";
        nama = JOptionPane.showInputDialog("Masukkan nama anda : ");
        JOptionPane.showMessageDialog(null, "Nama : "+nama);
        nim = JOptionPane.showInputDialog("Masukkan nim anda : ");
        JOptionPane.showMessageDialog(null, "NIM : "+nim);
        tempat = JOptionPane.showInputDialog("Masukkan tempat lahir anda : ");
        JOptionPane.showMessageDialog(null, "Tempat Lahir : "+tempat);
        tgllahir = JOptionPane.showInputDialog("Masukkan tgl lahir anda : ");
        JOptionPane.showMessageDialog(null, "Tanggal Lahir : "+tgllahir);

    }
}