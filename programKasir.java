import java.util.Scanner;

public class programKasir{
    public static void main (String[] args) {
        boolean isRunning = true;
        Scanner noir = new Scanner (System.in);
        System.out.println("===========Andra Store===========");
        System.out.println("===========Today Promo===========");
        System.out.println("Beli 2 Diskon 50000");        
        System.out.println("Beli 3 Diskon 100000");
        while (isRunning) {
            price legend = new price (0, 0, 0, 0, 0, 0);
            System.out.println("Mau Beli lagi nggak?");
            System.out.println("[Ya]");
            System.out.println("[Tidak]");
            System.out.print(">>>>");
            String answ = noir.nextLine();
            if (answ.equalsIgnoreCase("tidak")){
                isRunning = false;
            } 
        }
    }
}