import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputReader1{

    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String nim="", nama="";

        System.out.println("Masukan nama anda : ");

        try{
            nama = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }

        System.out.println("Masukan NIM anda : ");
        
        try{
            nim = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }

        System.out.println("");
        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("Selamat Datang " + nama);
        System.out.println("NIM  : " + nim);
    }
}