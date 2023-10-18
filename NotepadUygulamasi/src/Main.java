import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String dosyaAdi = "notlar.txt";


            FileReader fileReader = new FileReader(dosyaAdi);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String okunanMetin = "";
            String satir;
            while ((satir = bufferedReader.readLine()) != null) {
                okunanMetin += satir + "\n";
            }
            bufferedReader.close();


            System.out.println("En son kaydedilen metin:");
            System.out.println(okunanMetin);

            System.out.print("Yeni metin girin: ");
            String yeniMetin = scanner.nextLine();


            FileWriter fileWriter = new FileWriter(dosyaAdi);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(yeniMetin);
            printWriter.close();

            System.out.println("Metin başarıyla kaydedildi.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
