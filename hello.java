import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, sonuc;
        int c;
        

        System.out.println("1. sayı");
        a = input.nextInt();
        System.out.println("2. sayı");
        b = input.nextInt();
        System.out.println("1-çıkartma 2-toplama 3-çarpma 4-bölme");
        System.out.println("işlem giriniz:");
        c = input.nextInt();

        if (c==1)
            sonuc = a - b;
    
        else if (c==2)
            sonuc = a + b;
        else if (c==3)
            sonuc = a * b;
        else
            sonuc = a / b;
    System.out.println(sonuc);

        
    }

}