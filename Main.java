import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        float yariCap, merkezAci, pi=3.14f;

        System.out.print("Yarıçap giriniz: ");
        yariCap = inp.nextFloat();
        System.out.print("Merkez açıyı giriniz: ");
        merkezAci = inp.nextFloat();

        float sonuc = (pi*(yariCap*yariCap)*merkezAci)/360;
        System.out.print("Daire diliminin alanı: "+sonuc);
    }
}