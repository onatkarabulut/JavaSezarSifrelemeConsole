import java.util.Scanner;

public class Main {

    public static void Sifrele() {
        Scanner scan = new Scanner(System.in);
        System.out.println("kelime giriniz: ");
        String ad = scan.nextLine();
        System.out.println("öteleme miktarı giriniz: ");
        int otele = scan.nextInt();
        char[] alfabe = new char[52];
        int k = 0, tut;
        for (int i = 65; i < 91; i++) {
            alfabe[k] = (char) i;
            k++;

        }
        for (int i = 97; i < 123; i++) {
            alfabe[k] = (char) i;
            k++;
        }
        for (int i = 0; i < ad.length(); i++) {
            for (int j = 0; j < 52; j++) {
                if (ad.charAt(i) == alfabe[j]) {
                    if (j < 26) {
                        tut = j + otele;
                        tut %= 26;
                        System.out.print((char) alfabe[tut]);
                    } else {
                        tut = j + otele; 
                        if (tut > 51) {
                            tut = (tut % 52) + 26;
                            System.out.print((char) alfabe[tut]);
                            break;
                        } else
                            tut = (tut % 52);
                        System.out.print((char) alfabe[tut]);
                    }

                }

            }
        }
        scan.close();

    }

    public static void SifreCoz() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Şifrelenmiş kelimeyi giriniz: ");
        String ad = scan.nextLine();
        System.out.println("Gerileme miktarı giriniz: ");
        int otele = scan.nextInt();
        char[] alfabe = new char[52];
        int k = 0, tut;
        for (int i = 65; i < 91; i++) {
            alfabe[k] = (char) i;
            k++;
        }
        for (int i = 97; i < 123; i++) {
            alfabe[k] = (char) i;
            k++;
        }
        for (int i = 0; i < ad.length(); i++) {
            for (int j = 0; j < 52; j++) {
                if (ad.charAt(i) == alfabe[j]) {
                    if (j < 26) {
                        tut = j - otele;
                        tut %= 26;
                        System.out.print((char) alfabe[tut]);
                    } else {
                        tut = j - otele;
                        if (tut > 51) {
                            tut = (tut % 52) + 26;
                            System.out.print((char) alfabe[tut]);
                            break;
                        } else
                            tut = (tut % 52);
                        System.out.print((char) alfabe[tut]);
                    }
                }

            }
        }
        scan.close();
    }

    public static void main(String[] args) {
        System.out.println("Şifrelemek için [1] Şifre çözmek için [2] giriniz:");
        Scanner scn = new Scanner(System.in);
        int secim = scn.nextInt();
        if (secim == 1)
            Sifrele();
        else if (secim == 2)
            SifreCoz();
        else
            System.out.println("Geçerli bir seçim yapınız!");
        scn.close();
    }

}

/*
 * 
 * Scanner scan=new Scanner (System.in) Bu satırda Scanner sınıfında scan
 * adında bir nesne üretiyoruz.
 * String ad=scan.nextLine() Bu satırda scan nesnesine nextLine komutu ile
 * metin türündeki girilen veriyi ad değişkenine atıyoruz.
 * int otele=scan.nextInt() Bu satırda scan nesnesine nextLine komutu ile tam
 * sayı türünde girilen anahtar değerini otele değişkenine atıyoruz.
 * char [] alfabe=new char [52] Bu satırda 52 harflik alfabe adında bir
 * karakter türünde bir dizi oluşturuyoruz.
 * (ad.charAt(i)==alfabe[j]) Burada charAt komutu ile ad değişkenindeki
 * belirtilen indexdeki karakteri döndürür.
 * 
 */
