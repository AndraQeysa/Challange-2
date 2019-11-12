
import java.util.Scanner;

public class price extends barang {

    public int banyak;
    Scanner diablo = new Scanner(System.in);

    public price(int brand, int categori, int type, int color, int size, int banyak){

    super.barang(brand, categori, type, color, size);

    System.out.println ("Mau beli berapa?");
    this.banyak = banyak = diablo.nextInt();
    if (this.banyak == 2) {
            super.nota2();
        }else if(this.banyak == 3) {
            super.nota3(); 
        } else 
            super.nota();
    }    
}

