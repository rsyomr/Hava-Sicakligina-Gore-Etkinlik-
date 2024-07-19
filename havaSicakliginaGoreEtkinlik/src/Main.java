import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Koşullar :
        //
        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        //Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        //Ödev
        //Aynı örnek üzerinden if koşulları başka hangi şekilde
        // oluşturulabilirdi farklı çözüm yolları bulunuz.

        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Değeri Giriniz : ");
        heat = input.nextInt();
        if (heat < 5){
            System.out.println("Kayak Yapabilirsiniz!");
        } else if (heat < 10) {
            System.out.println("Sinemaya Gidebilirsiniz!");
        } else if (heat < 15) {
            System.out.println("sinemaya veya Pikniğe gidebilirsiniz");
        } else if (heat < 25) {
            System.out.println("Pikniğe Gidebilirsiniz ");
        }else {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }


    }
}
