public class Transaksi {
    public static void main(String[] args) {
        int barangA = 12000;
        int barangB = 5000;
        int barangC = 3000;
        int barangD = 6000;
        int barangE = 8000;
        float total = barangA + barangB + barangC + barangD + barangE;
        System.out.println("Barang A = "+barangA);
        System.out.println("Barang B = "+barangB);
        System.out.println("Barang C = "+barangC);
        System.out.println("Barang D = "+barangD);
        System.out.println("Barang E = "+barangE);
        System.out.println("Total = "+total);

        double uang = 50000;
        int kembali = (int) uang- (int) total;
        System.out.println("Jumlah Uang = "+uang);
        System.out.println("Kembalian = "+kembali);
    }
}