import java.util.Scanner;


public class Artikyill {
    public static void main(String[] args) {
        int x;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz: ");
        x=inp.nextInt();

        while (x<=50) {
            x++;
            if (x%2==0){
                System.out.println(x);
            }

        }












    }
}

