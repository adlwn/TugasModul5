package javamodul5_tugas_kelompok9;
import java.util.*;
public class KelasDua {
    String owner;
    int saran;
    String id;
    String nomor;
    String jenis;
    
    public KelasDua(){
        System.out.println(""); // Testing Divi
    }
    public KelasDua (String owner, String id){
        this.owner=owner;
        this.id=id;
    } 
    public String data(){
        return "Pemilik  : "+ owner+"\nNomor Pegawai : "+id;
    }
    public void hubungi(){
        System.out.println("TERIMAKASIH");
    }
    public void daftarprojector(){
        System.out.println("**************************************");
        System.out.println("**  DAFTAR PROJECTOR YANG TERSEDIA  **");
        System.out.println("**************************************");
        System.out.println("** 1. BENQ AA67G      5 Ribu/Jam   **");
        System.out.println("** 2. BENQ AB67G      2 Ribu/Jam   **");
        System.out.println("** 3. LG FF15K        3 Ribu/Jam   **");
        System.out.println("** 4. LG FG15K        4 Ribu/Jam   **");
        System.out.println("** 5. EPSON YY511     7 Ribu/Jam   **");
        System.out.println("** 6. EPSON YZ511     8 Ribu/Jam   **");
        System.out.println("** 7. DELL KL977      9 Ribu/Jam   **");
        System.out.println("** 8. DELL KM977      1 Ribu/Jam   **");
        System.out.println("** 9. DELL KN977      6 Ribu/Jam   **");
        System.out.println("**************************************"); 
        System.out.println("");
    }
    public void layanan(int layanan){
        
        Scanner inp = new Scanner (System.in);
        System.out.println("Saran Agar Usaha Kami Membaik : ");
        System.out.println("1. Penambahan Projector Tipe Baru");
        System.out.println("2. Tolong Perbaiki Lagi Projector");
        System.out.println("3. Diskon Lebih Untuk Peminjaman Dengan Durasi Lama");
        System.out.println("4. Pelayanan Tolong Ditingkatkan");
        System.out.println("5. Buka Cabang Di Area Lain");
        System.out.print("Menurut Anda, Nomor Berapa : ");
        saran = inp.nextInt();
        if (saran==0){
            System.out.println("Inputan Hanya (1-5) Saja, Tolong Masukan Yang Benar :)");
        if (saran==1){
            System.out.println("Kami Akan Secepatnya Menerima Saran Dari Anda");
    }else {
            System.out.println("Kami Akan Segera Memperbaiki Usaha Kami Agar Anda Puas");
        }
}
}
}
