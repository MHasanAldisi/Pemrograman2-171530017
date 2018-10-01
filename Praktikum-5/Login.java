import java.io.*;

public class Login{
    public static void main(String[] args)throws IOException{

        BufferedReader dataInput = new BufferedReader (new InputStreamReader(System.in));

        String id_user;
        String password;
        boolean status=true;

        do{
            System.out.println("Masukkan ID.User :");
            id_user = dataInput.readLine();

            System.out.println("Masukkan Password :");
            password = dataInput.readLine();

            if(!id_user.equals("171530017")){
                System.out.println("ID.User yang anda masukkan salah!");
            }else{
                if(!password.equals("mahasiswa123")){
                    System.out.println("Password yang anda masukkan salah!");
                }else{
                    status=false;
                }
            }
        }while(status);
            System.out.println("Selamat datang : " + id_user);
    }
}