/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150 (class Mahasiswa, class TugasAkhir, class main(Pbo) )
 - Ika Setyasari 1301144020 (class Dosen)
 - Laela Citra Asih 1301144300 (class KelompokTA, class orang)
 */
package model;
import java.util.Scanner;
public class Aplikasi {
    /*
    Task (berdarkan https://drive.google.com/file/d/0BxMqes854yZcRlpEbFU4TmtudGM/view)
    Console:
    - Menampung array/list objek yang dibutuhkan
    - Buat method add/create untuk setiap array/list
    - Buat method search untuk setiap array/list
    - Buat method delete untuk setiap array/list
    - Buat method untuk setiap menu (1 menu = 1 method)
    
    Main Menu:
    - buatlah sebuah method "main menu"
    --  method ini akan menampilkan daftar menu yang ada,
    --  method menerima input pilihan menu dari user dan memanggil method menu yang sesuai
    --  usahakan menaruh semua proses i/o di dalam method ini 
    */
    
    /*------------------------- sprint 2 ------------------------- */
    /*--- Menampung array/list objek yang dibutuhkan ---*/
    private Dosen[] daftarDosen = new Dosen[10];
    private int nDosen = 0;
    private Mahasiswa[] daftarMahasiswa = new Mahasiswa[10];
    private int nMahasiswa = 0;
    /*--- end of Menampung array/list objek yang dibutuhkan ---*/
    /*--- toString ---*/
    public String toString(){
        String x = "Nama Dosen\t="+daftarDosen.toString()+
                "Nama Mahasiswa\t="+daftarMahasiswa.toString();
        return x;
    }
    /*--- end of toString ---*/
    /*---  Buat method add/create untuk setiap array/list ---*/
    public void addDosen(String nama, String kode, String kk, String username, String password){
        if(nDosen < daftarDosen.length){
            daftarDosen[nDosen]= new Dosen(nama,kode,kk,username,password);
            nDosen++;
        }
    }
    public void addMahasiswa(String nama,String nim, String kk, String username, String password){
        if(nMahasiswa < daftarMahasiswa.length){
            daftarMahasiswa[nMahasiswa]= new Mahasiswa(nama,nim,kk,username,password);
            nMahasiswa++;
        }
    }
    /*---  end of Buat method add/create untuk setiap array/list ---*/
    /*---  Buat method search untuk setiap array/list ---*/
    public Dosen getDosen(String kode){
        for(int i=0;i<nMahasiswa;i++){
            if(daftarDosen[i].getKode().equals(kode)){
                return daftarDosen[i];
            }
        }
        return null;
    } 
    public Mahasiswa getMahasiswa(String nim){
        for(int i=0;i<nMahasiswa;i++){
            if(daftarMahasiswa[i].getNIM().equals(nim)){
                return daftarMahasiswa[i];
            }
        }
        return null;
    }
    /*---  end of Buat method search untuk setiap array/list ---*/
    /*---  Buat method delete untuk setiap array/list ---*/
    public void deleteDosen(int kode){
        int j = -1;
        for(int i=0;i<nDosen;i++){
            if(daftarDosen[i].getKode().equals(kode)){
                j = i;
            }
        }
        if (j != -1){    
            for(int i=j;i<nDosen-1;i++){
                daftarDosen[i]=daftarDosen[i+1];
            }
            nDosen--;
        }
    }
    public void deleteMahasiswa(int nim){
        int j = -1;
        for(int i=0;i<nMahasiswa;i++){
            if(daftarMahasiswa[i].getNIM().equals(nim)){
                j = i;
            }
        }
        if (j != -1){    
            for(int i=j;i<nMahasiswa-1;i++){
                daftarMahasiswa[i]=daftarMahasiswa[i+1];
            }
            nMahasiswa--;
        }
    }
    public String[] getAllTA(Dosen d){
        return d.getAllTopikTA();
    }
    public String getAllTA1(Mahasiswa m){
        return m.getTugasAkhir().toString();
    }
    public String[] getNIMMhs(){
        String[] s = new String[nMahasiswa];
        for (int i = 0;i < nMahasiswa;i++){
            s[i] = daftarMahasiswa[i].getNIM();
        }
        return s;
    }
    public String[] getKodeDosen(){
        String[] s = new String[nDosen];
        for (int i = 0;i < nDosen;i++){
            s[i] = daftarDosen[i].getKode();
        }
        return s;
    }
    /*---  end of Buat method search untuk setiap array/list ---*/
    /*---  Buat method untuk setiap menu (1 menu = 1 method) ---*/
    /*-- menu 1 --*/
    public Orang Menu01(String username,String password){
        for(int i=0;i<nDosen;i++){
            if(daftarDosen[i].getUsername().equals(username)&daftarDosen[i].getPassword().equals(password)){
                return daftarDosen[i];
            }
        }
        for(int i=0;i<nMahasiswa;i++){
            if(daftarMahasiswa[i].getUsername().equals(username)&daftarMahasiswa[i].getPassword().equals(password)){
                return daftarMahasiswa[i];
            }
        }
        return null;
    }
    /*-- end of menu login --*/
    /*-- menu lecturer only --*/
    /*-- menu Create KelompokTA --*/
    public void Menu11(Dosen d, String topik){
        d.CreateKelompokTA(topik);
    }
    /*-- end of menu Create KelompokTA --*/
    /*-- menu delete KelompokTA --*/
    public void Menu12(Dosen d, int n){
        d.deleteKelompok(n);
    }
    /*-- end of menu delete KelompokTA --*/
    /*-- menu find KelompokTA --*/
    public KelompokTA Menu13(Dosen d, int n){
        KelompokTA a = d.GetKelompok(n);
        return a;
    }
    /*-- end of menu find KelompokTA --*/
    /*-- menu add member KelompokTA --*/
    public void Menu14(Dosen d, int n,Mahasiswa m){
        d.GetKelompok(n).addAnggota(m);
    }
    /*-- end of menu add member KelompokTA --*/
    /*-- menu delete member KelompokTA --*/
    public void Menu15(Dosen d, int n,String NIM){
        d.GetKelompok(n).removeAnggota(NIM);
    }
    /*-- end of menu delete member KelompokTA --*/

    /*-- menu find member KelompokTA --*/
    public Mahasiswa Menu16(Dosen d, int n,String NIM){
        return d.GetKelompok(n).getAnggota(NIM);
    }
    /*-- end of menu find member KelompokTA --*/
    /*-- end of menu lecturer only --*/
    
    /*-- menu student only --*/
    /*-- menu create Tugas Akhir --*/
    public void Menu21(Mahasiswa m, String judul){
        m.createTA(judul);
    }
    /*-- end of menu create Tugas Akhir --*/
    /*-- menu set Pembimbing --*/
    public void Menu22(Mahasiswa m, Dosen d, int i){
        m.getTugasAkhir().setPembimbing(d, i);
    }
    /*-- end of menu set Pembimbing --*/
    /*-- menu get Pembimbing --*/
    public Dosen Menu23(Mahasiswa m, String kode){
        for (int i = 0;i < 2;i++){
            if (m.getTugasAkhir().getPembimbing(i) != null){
                if (m.getTugasAkhir().getPembimbing(i).getKode().equals(kode))
                    return m.getTugasAkhir().getPembimbing(i);
            }
        }
        return null;
    }
    /*-- end of menu get Pembimbing --*/
    /*-- end of menu student only --*/
    /*---  end of Buat method untuk setiap menu (1 menu = 1 method) ---*/
    
    /*---  buatlah sebuah method "main menu" ---*/
    public void MainMenu(){
        boolean ulang = true;
        do { 
            Scanner sc = new Scanner (System.in);
            Scanner sc2 = new Scanner (System.in);
            System.out.println("Main Menu");
            System.out.println("1.Login");
            System.out.println("0.exit");
            System.out.print("pilihan     : ");
            int a1 = sc.nextInt();
            switch (a1) {
                case 1:
                    System.out.println("Main Menu");
                    System.out.print("Masukan Username    = ");
                    String user = sc.next();
                    System.out.println("Username kamu adalah "+user);
                    System.out.print("Masukan Password    = ");
                    String pass = sc.next();
                    System.out.println("Password kamu adalah "+pass);
                    Orang b1 = Menu01(user,pass);
                    if (b1 != null){
                        if (b1.getClass() == Dosen.class){
                            int a2 = 0;
                            Dosen d = (Dosen) b1;
                            while (a2 != 7){
                                System.out.println(" Menu Dosen");
                                System.out.println(" 1. Create KelompokTA");
                                System.out.println(" 2. Delete KelompokTA");
                                System.out.println(" 3. Find KelompokTA");
                                System.out.println(" 4. Add member KelompokTA");
                                System.out.println(" 5. Delete member KelompokTA");
                                System.out.println(" 6. Find member KelompokTA");
                                System.out.println(" 7. keluar");
                                System.out.print(" input      : ");
                                a2 = sc.nextInt();
                                switch(a2){
                                    case 1:
                                        System.out.print("Topik : ");
                                        String topik = sc2.nextLine();
                                        Menu11(d,topik);
                                        break;
                                    case 2:
                                        System.out.print("Nomor Kelompok : ");
                                        int n = sc.nextInt();
                                        Menu12(d,n);
                                        break;
                                    case 3:
                                        System.out.print("Nomor Kelompok : ");
                                        n = sc.nextInt();
                                        KelompokTA a = Menu13(d,n);
                                        System.out.println(a.toString());
                                        break;
                                    case 4:
                                        for (int i = 0;i < nMahasiswa;i++){
                                            System.out.println(daftarMahasiswa[i].toString());
                                        }
                                        System.out.print("Nomor Kelompok : ");
                                        n = sc.nextInt();
                                        System.out.print("NIM            : ");
                                        String nim = sc2.nextLine();
                                        Menu14(d,n,getMahasiswa(nim));
                                        break;
                                    case 5:
                                        System.out.print("Nomor Kelompok : ");
                                        n = sc.nextInt();
                                        System.out.print("NIM            : ");
                                        nim = sc2.nextLine();
                                        if (Menu16(d,n,nim) != null)
                                            Menu15(d,n,nim);
                                        break;
                                    case 6:
                                        System.out.print("Nomor Kelompok : ");
                                        n = sc.nextInt();
                                        System.out.print("NIM            : ");
                                        nim = sc2.nextLine();
                                        Mahasiswa m = Menu16(d,n,nim);
                                        if (m != null)
                                            System.out.println(m.toString());
                                        break;
                                    default:
                                        System.out.println("masukan hanya dari 1 - 6");
                                        break;
                                }
                            }
                        } else if (b1.getClass() == Mahasiswa.class) {
                            int a2 = 0;
                            Mahasiswa m = (Mahasiswa) b1;
                            while (a2 != 4){
                                System.out.println(" Menu Mahasiswa");
                                System.out.println(" 1. Create TA");
                                System.out.println(" 2. Set Pembimbing");
                                System.out.println(" 3. Get Pembimbing");
                                System.out.println(" 4. Keluar");
                                System.out.print(" input      : ");
                                a2 = sc.nextInt();

                                switch(a2){
                                    case 1:
                                        System.out.print("Judul            : ");
                                        String judul = sc2.nextLine();
                                        Menu21(m,judul);
                                        break;
                                    case 2:
                                        for(int i = 0;i < nDosen;i++){
                                            System.out.println(daftarDosen[i].toString());
                                        }
                                        System.out.print("Kode Dosen dipilih : ");
                                        String kode = sc2.nextLine();
                                        System.out.print("Set Pembimbing ke : ");
                                        int no = sc.nextInt();
                                        Menu22(m,getDosen(kode),no-1);
                                        break;
                                    case 3:
                                        System.out.print("Kode Dosen dipilih : ");
                                        kode = sc2.nextLine();
                                        Dosen d = Menu23(m,kode);
                                        if (d != null)
                                            System.out.println(d.toString());
                                        break;
                                    default:
                                        System.out.println("masukan hanya dari 1 - 3");
                                        break;
                                }
                                System.out.println("");
                            }
                        } break;
                    } else {
                        System.out.println("Username atau Password salah");
                    } break;
                case 0:
                    System.out.println("exit");
                    ulang = false;
                    break;
                default:
                    System.out.println("masukan angka 1 atau 0");
                    System.out.println();
                    break;
            }
        }while(ulang == true);
    }
    /*---  end of buatlah sebuah method "main menu" ---*/
    /*------------------------- end of sprint 2 ------------------------- */
}