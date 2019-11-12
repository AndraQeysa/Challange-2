
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class barang {

    private String color;
    private String type;
    private String category;
    private String brand;
    private int price;
    private int size;
    Scanner blanc = new Scanner(System.in);

    private String getDate() {
        DateFormat Tanggal = new SimpleDateFormat("dd/MM/yyyy");
        Date tgl = new Date();
        return Tanggal.format(tgl);
    }

    private String getWaktu() {
        DateFormat waktu = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
        return waktu.format(time);
    }

    public void barang (int brand, int category, int type, int color, int size) {
        int price = 0;
        System.out.println("=============BRAN=============");
        System.out.println("[1] 910 \n[2] Adidas \n[3] Nike \n[4] Skechers \n[5] Puma \n[6] Reebok \n[7] Vans \n[8] Converse \n[9] Fila");
        brand = blanc.nextInt();
        switch (brand) {
            case 1:
                this.brand = "910";
                price = 400000;
                break;
            case 2:
                this.brand = "Adidas";
                price = 600000;
                break;
            case 3:
                this.brand = "Nike";
                price = 550000;
                break;
            case 4:
                this.brand = "Skechers";
                price = 390000;
                break;
            case 5:
                this.brand = "Puma";
                price = 800000;
                break;
            case 6:
                this.brand = "Reebok";
                price = 770000;
                break;
            case 7:
                this.brand = "Vans";
                price = 950000;
                break;
            case 8:
                this.brand = "Converse";
                price = 870000;
                break;
            case 9:
                this.brand = "Fila";
                price = 400000;
                break;
            default:
                System.out.println("Maaf Pesanan Anda Tidak Ada");
        }

        System.out.println("=============CATEGORY=============");
        System.out.println("[1] Pria \n[2] Wanita");
        category = blanc.nextInt();
        switch (category) {
            case 1:
                this.category = "Pria";
                break;
            case 2:
                this.category = "Wanita";
                break;
            default:
                System.out.println("Maaf Pesanan Anda Tidak Ada");
        }

        System.out.println("=============TYPE=============");
        System.out.println("[1] Olaraga \n[2] Kantoran \n[3] Santai \n[4] Lari"
        );
        type = blanc.nextInt();
        switch (type) {
            case 1:
                this.type = "Olaraga";
                break;
            case 2:
                this.type = "Kantoran";
                break;
            case 3:
                this.type = "Santai";
                break;
            case 4:
                this.type = "lari";
                break;
            default:
                System.out.println("Maaf Pesanan Anda Tidak Ada");
        }

        System.out.println("=============COLOR=============");
        System.out.println("[1] Black \n[2] White \n[3] Gold \n[4] Silver \n[5] Orange \n[6] Green \n[7] Yellow \n[8] Blue \n[9] Red");
        color = blanc.nextInt();
        switch (color) {
            case 1:
                this.color = "Black";
                break;
            case 2:
                this.color = "White";
                break;
            case 3:
                this.color = "Gold";
                break;
            case 4:
                this.color = "Silver";
                break;
            case 5:
                this.color = "Orange";
                break;
            case 6:
                this.color = "Green";
                break;
            case 7:
                this.color = "Yellow";
                break;
            case 8:
                this.color = "Blue";
                break;
            case 9:
                this.color = "Red";
                break;
            default:
                System.out.println("Maaf Pesanan Anda Tidak Ada");
        }

        System.out.println("=============SIZE=============");
        System.out.println(
        "Size mulai dari 25 hingga 34");
        size = blanc.nextInt();
    }

    public void nota() {
        System.out.println("================= Andra Store =================");
        System.out.println("Jl Pelan Pelan nomor 0");
        System.out.println("===============================================");
        System.out.println(getDate() + getWaktu()
        );
        System.out.println("===============================================");
        System.out.println("Kasir       : " + "Andra");
        System.out.println("Brand       : " + this.brand);
        System.out.println("Category    : " + this.category);
        System.out.println("Type        : " + this.type);
        System.out.println("Color       : " + this.color);
        System.out.println("Size        : " + this.size);
        System.out.println("Price       : " + this.price);
        System.out.println("===============================================");
    }

    public void nota2() {
        System.out.println("================= Andra Store =================");
        System.out.println("Jl Pelan Pelan nomor 0");
        System.out.println("===============================================");
        System.out.println(getDate() + getWaktu()
        );
        System.out.println("===============================================");
        System.out.println("Kasir       : " + "Andra");
        System.out.println("Brand       : " + this.brand);
        System.out.println("Category    : " + this.category);
        System.out.println("Type        : " + this.type);
        System.out.println("Color       : " + this.color);
        System.out.println("Size        : " + this.size);
        System.out.println("Price       : " + this.price);
        int temp = this.price * 2 - 50000;
        this.price = temp;
        System.out.println("===============================================");
        System.out.println("Diskon      : 50000");
        System.out.println("Total       : " + this.price);
        System.out.println("===============================================");
    }

    public void nota3() {
        System.out.println("================= Andra Store =================");
        System.out.println("Jl Pelan Pelan nomor 0");
        System.out.println("===============================================");
        System.out.println(getDate() + getWaktu()
        );
        System.out.println("===============================================");
        System.out.println("Kasir       : " + "Andra");
        System.out.println("Brand       : " + this.brand);
        System.out.println("Category    : " + this.category);
        System.out.println("Type        : " + this.type);
        System.out.println("Color       : " + this.color);
        System.out.println("Size        : " + this.size);
        System.out.println("Price       : " + this.price);
        int temp = this.price * 3 - 100000;
        this.price = temp;
        System.out.println("===============================================");
        System.out.println("Diskon      : 100000");
        System.out.println("Total       : " + this.price);
        System.out.println("===============================================");
    }
}
