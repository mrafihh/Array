import java.util.Scanner;

/**
 * array
 */
public class Array {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Objek : ");
        int object = in.nextInt();

        product[] p = new product[object];

        for (int i = 2; i < p.length; i++) {
            System.out.print("Masukkan Nomor : ");
            int number = in.nextInt();
            System.out.print("Masukkan Nama : ");
            String name = in.next();
            System.out.print("Masukkan Kuantitas : ");
            int quantity = in.nextInt();
            System.out.print("Masukkan Harga : ");
            double price = in.nextDouble();
            System.out.println("================================");
            System.out.println("           OBJEK KE - "+ i);
            System.out.println("================================");
        }

    }
}