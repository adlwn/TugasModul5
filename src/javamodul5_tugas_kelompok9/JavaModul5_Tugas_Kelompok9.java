package javamodul5_tugas_kelompok9;
public class JavaModul5_Tugas_Kelompok9 {
    public static void main(String[] args) 
{
     {
        System.out.println("------PROGRAM PENYEWAAN PROJECTOR SEMARANG------");
        System.out.println("************************************************");
        System.out.println("**          Oleh Kelompok 9 (Shift 4)         **");
        System.out.println("************************************************");
        System.out.println("**   1. Divianis Oktaviyani - 21120117120017  **");
        System.out.println("**   2. Heidi Amellie A. A. - 21120117120022  **");
        System.out.println("************************************************");
        KelasDua func = new KelasDua();
        func.daftarprojector();
        KelasSatu objek = new KelasSatu();  
        System.out.println("");
        KelasDua one = new KelasDua("Heidi Amellie Ayu Astria","21120117120022");
        System.out.println(one.data());
        func.layanan(1-5);
        System.out.println("");
        func.hubungi();
        }  
    }
}
