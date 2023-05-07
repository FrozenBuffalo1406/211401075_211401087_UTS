import java.util.Scanner;
public class Appetizer{
    public static float harga;
    public void Show(){
        System.out.println("This is Appetizer Menu");
    }

    int[] biayaProduksi = new int[] {20000,24000,27000};
    public void Menu(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "Pilih Menu Appetizer:" +
                "\n1. French Fries - Rp " + 1.25*biayaProduksi[0] +
                "\n2. Onion Rings - Rp " + 1.25*biayaProduksi[1] +
                "\n3. Mozzarella Sticks - Rp " + 1.25*biayaProduksi[2] +
                "\n4.Kembali");
        System.out.print("\nPilih:");
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                harga+=1.25*biayaProduksi[0];
                Menu();
                break;
            case 2:
                harga+=1.25*biayaProduksi[1];
                Menu();
                break;
            case 3:
                harga+=1.25*biayaProduksi[2];
                Menu();
                break;
            case 4:
                new Order();
                break;
            default:
                System.out.print("Pilihan Salah!");
                Menu();
                break;
        }
    }
}
