import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Degiskenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınfıını tanımla.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan degerleri al
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6.0;
        System.out.println(sonuc);
        boolean gecmekalma = sonuc > 60;

        String str = gecmekalma ? "Sınıfı geçti" : "Sınıfta kaldı";

        System.out.println(str);

        }
    }

