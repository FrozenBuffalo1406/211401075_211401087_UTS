public class Show {
    public Show(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("Jumlah Pengunjung Diharapkan: " + Checkout.totalOmset / Checkout.totalKeuntungan);
        System.out.println("Jumlah Pengunjung: " + Main.jumlahPengunjung);
        System.out.println("Total Keuntungan: " + Checkout.totalKeuntungan);
        Main.Menu();
    }
}