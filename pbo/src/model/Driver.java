/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150 (class Mahasiswa, class TugasAkhir, class main(Driver) )
 - Ika Setyasari 1301144020 (class Dosen)
 - Laela Citra Asih 1301144300 (class KelompokTA, class orang)
 */
package model;
import view.*;
import model.*;
import controller.*;
public class Driver {
    /*
    Minimum Specification (berdarkan https://drive.google.com/file/d/0BxMqes854yZcRlpEbFU4TmtudGM/view)
    1. Dosen dapat membuat suatu kelompok TA dengan topik tertentu
    2. Dosen dapat menambahkan / menghapus anggota kelompok TA
    3. Mahasiswa dapat membuat sebuah TugasAkhir
    4. Dosen dapat menambahkan dirinya menjadi pembimbing suatu tugas akhir dari seorang mahasiswa
    5. Mahasiswa dapat merevisi judul TA
    6. Mahasiswa memiliki status sudah lulus atau belum
    7. Dosen memiliki status bisa sebagai pembimbing 1 atau 2
    */
    public static void main(String[] args) {
        /*------------------------- sprint 1 ------------------------- */
        /*
        System.out.println("Sprint 1");
        Dosen d0 = new Dosen("Dosen0","AAA","SIDE","Dosen0","Dosen0");
        Dosen d1 = new Dosen("Dosen1","BBB","SIDE","Dosen1","Dosen1");
        Mahasiswa m0 = new Mahasiswa("Mahasiswa0","012","SIDE","Mahasiswa0","Mahasiswa0");
        Mahasiswa m1 = new Mahasiswa("Mahasiswa1","123","SIDE","Mahasiswa1","Mahasiswa1");
        */
        //Minimum Specification nomor 1. Dosen dapat membuat suatu kelompok TA dengan topik tertentu
        /*
        d0.CreateKelompokTA("pbo");
        */
        //Minimum Specification nomor 2. Dosen dapat menambahkan / menghapus anggota kelompok TA
        /*
        d0.GetKelompok("pbo").addAnggota(m0);
        d0.GetKelompok(0).addAnggota(m1);
        d0.GetKelompok("pbo").removeAnggota("123");
        */
        /*optional menampilkan informasi kelompok*/
        /*
        System.out.println("Nama Topik : "+d0.GetKelompok("pbo").getTopik());
        System.out.println("Anggota    : ");
        */
        // Minimum Specification nomor 3. Mahasiswa dapat membuat sebuah TugasAkhir
        /*
        m0.createTA("sistem informasi TA");
        */
        /*optional menampilkan judul TA*/
        /*
        System.out.println("judul TA sebelum    : "+m0.getTugasAkhir().getJudul());
        */
        //Minimum Specification nomor 4. Dosen dapat menambahkan dirinya menjadi pembimbing suatu tugas akhir dari seorang mahasiswa
        /*
        d0.GetKelompok("pbo").getAnggota("012").getTugasAkhir().setPembimbing(d0, 0);
        d0.setStatus("Pembimbing 1");
        */
        //Minimum Specification nomor 5. Mahasiswa dapat merevisi judul TA
        /*
        m0.getTugasAkhir().setJudul("sisfo TA");
        */
        /*optional menampilkan judul TA*/
        /*
        System.out.println("judul TA setelah    : "+m0.getTugasAkhir().getJudul());
        */
        //Minimum Specification nomor 6. Mahasiswa memiliki status sudah lulus atau belum
        /*
        System.out.println("Status sebelum      : "+m0.getStatus()); 
        d0.GetKelompok("pbo").getAnggota("012").setStatus("Lulus");
        System.out.println("Status setelah      : "+m0.getStatus());
        System.out.println("end of Sprint 1");
        */
        //Minimum Specification nomor 7. Dosen memiliki status bisa sebagai pembimbing 1 atau 2
        /*
        System.out.println(d0.getStatus());
        */
        /*------------------------- end of sprint 1 ------------------------- */
        /*------------------------- sprint 2 ------------------------- */
        /*
        System.out.println("Sprint 2");
        Aplikasi xxx = new Aplikasi();
        xxx.addDosen("Dosen0","AAA","SIDE","Dosen0","Dosen0");
        xxx.addDosen("Dosen1","BBB","SIDE","Dosen1","Dosen1");
        xxx.addMahasiswa("Mahasiswa0","012","SIDE","Mahasiswa0","Mahasiswa0");
        xxx.addMahasiswa("Mahasiswa1","123","SIDE","Mahasiswa1","Mahasiswa1");
        xxx.MainMenu();
        System.out.println("end of sprint 2");
        */
        /*------------------------- end of sprint 2 ------------------------- */
        /*------------------------- sprint 3 ------------------------- */
        Aplikasi app = new Aplikasi();
        app.addDosen("Dosen0","AAA","SIDE","Dosen0","Dosen0");
        app.addDosen("Dosen1","BBB","SIDE","Dosen1","Dosen1");
        app.addMahasiswa("Mahasiswa0","012","SIDE","Mahasiswa0","Mahasiswa0");
        app.addMahasiswa("Mahasiswa1","123","SIDE","Mahasiswa1","Mahasiswa1");
        new Controller(app);
        /*------------------------- end of sprint 3 ------------------------- */
    }
    
}