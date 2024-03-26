import java.util.Scanner;

public class tiket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jurusan               || Bisnis    || Eksekutif");
        System.out.println("......................||...........||...........");
        System.out.println("1. Cikampek - Tuparev || Rp 20.000 || Rp 30.000");
        System.out.println("2. Klari - Badami     || Rp 10.000 || Rp 20.000");
        System.out.println("3. Johar - Bypass     || Rp 10.000 || RP 25.000");

        System.out.print("Masukkan jurusan : ");
        String jurusan = scanner.nextLine();
        System.out.print("Masukkan kelas : ");
        String kelas = scanner.nextLine();

        scanner.close();

        String hargaTiket = "";
        if (jurusan.equals("Cikampek - Tuparev")) {
            if(kelas.equals("Bisnis")) {
                hargaTiket = "20.000";
            } else if(kelas.equals("Eksekutif")) {
                hargaTiket = "30.0000";
            }
        } else if (jurusan.equals("Klari - Badami")) {
            if (kelas.equals("Eksekutif")) {
                hargaTiket = "10.000";
            } else if (kelas.equals("Bisnis")) {
                hargaTiket = "20.000";
            }
        } else if (jurusan.equals("Johar - Bypass")) {
            if (kelas.equals("Eksekutif")) {
                hargaTiket = "10.000";
            } else if (kelas.equals("Bisnis")) {
                hargaTiket = "2.5000";
            }
        }

        System.out.println("======= Informasi Tiket Kereta Api =======");
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Kelas : " + kelas);
        System.out.println("Harga tiket : Rp " + hargaTiket);
    }
}
