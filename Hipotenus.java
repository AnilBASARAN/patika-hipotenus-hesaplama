import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir dik kenar uzunluğu giriniz");
        a = input.nextInt();

        System.out.println("Diğer dik kenar uzunluğu giriniz");
        b = input.nextInt();

        double c = Math.sqrt(((a*a)+(b*b)));

        System.out.println(a +" ve " + b + " dik kenarlarının oluşturduğu üçgenin hipotenüsü "+ c+ " kenarıdır.");

    }
}
