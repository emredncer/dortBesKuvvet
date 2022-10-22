import java.util.Scanner;

public class dortBesKuvvet {
    public static void main(String[] args) {
        int sinir ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sınır değerini giriniz: ");
        sinir = scan.nextInt();
        System.out.println("4ün kuvvetleri");
        for (int i =1 ; i <= sinir ; i *= 4){
            System.out.println(i);
        }
        System.out.print("5in kuvvetleri;");
        for (int j=1 ; j <= sinir ; j *= 5){
            System.out.println(j);
        }
    }
}
