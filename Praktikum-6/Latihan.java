import java.io.*;

public class Latihan{
    public static void main(String[] args)throws IOException{
        BufferedReader = new BufferedReader (new InputStreamReade(System.in));
        
        String nama="", nim="", kelas="";

        System.out.print("Masukkan Nama Anda : ");
            nama = dataIn.readLine();
        System.out.print("Masukkan NIM Anda : ");
            nim = dataIn.readLine();
        System.out.print("Masukkan Kelas Anda : ");
            kelas = dataIn.readLine();

        System.out.println("Slamat datang " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
    }
}