import java.io.Console;
import java.util.Scanner;





public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplam =0;
        int n =0;
        System.out.print("Sayı:");
        int sayi = input.nextInt();
        for(int i=0;i<=sayi;i++)
        {
            if(i%3==0&&i%4==0)
            {
                toplam +=i;
                n++;
            }
        }
        System.out.print("Bu sayıların Ortalaması:"+(toplam/n) +" "+"Toplamları:"+toplam);
    }

}
