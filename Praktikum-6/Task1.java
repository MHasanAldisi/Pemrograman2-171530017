import java.io.*;

public class Task1{
    public static void main(String[]args) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String kd_barang="", nama_barang="", jml_barang="";
        System.out.println("__________________________________");
        System.out.println("__________________________________");
        int i=0;
        do{
            System.out.println("Transaksi " + (i+1));
            System.out.print("Masukkan Kode Barang : ");
                kd_barang = dataIn.readLine();
            System.out.print("Masukkan Nama Barang : ");
                nama_barang = dataIn.readLine();
            System.out.print("Masukkan Jumlah Barang : ");
                jml_barang = dataIn.readLine();
        
        System.out.println("");

        System.out.println("Kode Barang : " + kd_barang);
        System.out.println("Nama Barang : " + nama_barang);
        System.out.println("Jumlah Barang : " + jml_barang);
        System.out.println("__________________________________");
        System.out.println("__________________________________");
        i++;
        }while(i<3);

    }
}