package javamodul5_tugas_kelompok9;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class KelasSatu {
 public String name;
    String tambah ="IYA";
    int w = 0;
    String jenis[] = new String [100];
    double hargasewa[] = new double [100];
    int kuantitas[] =new int [100] ;        
    double totalnya[] = new double [100];
    double hargatotal;
    double bayar;
    double kembalian;
     
   public KelasSatu(){
       Scanner kelompok9= new Scanner(System.in);
       BufferedReader pesanlagi = new BufferedReader (new InputStreamReader (System.in));
       System.out.print("Penanggung Jawab (Peminjam) : ");
       name = kelompok9.next();
      
       while(tambah.equals("IYA")|| tambah.equals("iya"))
       {
       System.out.println("");
       System.out.print("Daftar Projector Yang Bisa Dipinjam (1-9) | Estimasi Per 1 Jam : ");
       int tipe = kelompok9.nextInt();
       if (tipe==1){
        jenis[w] = "BENQ AA67G";
        hargasewa[w] = 5000;
    } else if (tipe==2){
        jenis[w] = "BENQ AB67G";
        hargasewa[w] = 2000;
    } else if (tipe==3){
        jenis[w] = "LG FF15K";
        hargasewa[w] = 3000;
    } else if (tipe==4){
        jenis[w] = "LG FG15K";
        hargasewa[w] = 4000;
    } else if (tipe==5){
        jenis[w] = "EPSON YY511";
        hargasewa[w] = 7000;
    } else if (tipe==6){
        jenis[w] = "EPSON YZ511";
        hargasewa[w] = 8000;
    } else if (tipe==7){
        jenis[w] = "DELL KL977";
        hargasewa[w] = 9000;
    } else if (tipe==8){
        jenis[w] = "DELL KM977";
        hargasewa[w] = 1000;
    } else if (tipe==9){
        jenis[w] = "DELL KN977";
        hargasewa[w] = 6000;
    }else {
        System.out.println("Projector Tidak Tersedia Atau Masih Disewa Oleh Pihak Lain, Silakan Pilih Yang Ada");
        jenis[w] = "Tidak Ada";
    }
        System.out.println("Jenis Projector Yang Ingin Disewa : "+jenis[w]);
           System.out.println("Biaya Per 1 Jam : Rp." +hargasewa[w]);
           System.out.print("Lama Meminjam (Estimasi Per Jam) : ");
           kuantitas[w] = kelompok9.nextInt();
           totalnya[w] = hargasewa[w]*kuantitas[w];
           System.out.println("Harga Yang Harus Dibayar        : Rp."+totalnya[w]);
           System.out.print("Mungkin Pinjam Jenis Yang Lainnya ? [IYA/TIDAK]: ");
           try{
              tambah = pesanlagi.readLine(); 
           }catch (IOException e){
               System.out.println("Gagal Atau Tidak Terbaca");              
           }
           w++;   
   }
       System.out.println("");
       System.out.println("**************************************");
       System.out.println("**          Review Pesanan          **");
       System.out.println("**************************************");
       System.out.println("Penanggung Jawab (Penyewa) : "+name);
       System.out.println("");
   for (int a =0; a<w;a++){
        System.out.println(jenis[a]+ " " + kuantitas[a]);
        }
        System.out.println("");
        for (int b =0; b<w;b++){
            hargatotal = hargatotal + totalnya[b];            
        }
        System.out.println("Total Biaya Semuanya : Rp." +hargatotal);
        System.out.print("Uang Yang Anda Bayarkan : Rp.");
        bayar = kelompok9.nextDouble();
        kembalian = bayar-hargatotal;
        System.out.println("Kembalian Yang Anda Terima : Rp"+kembalian);
        System.out.println("");
    }    
}

