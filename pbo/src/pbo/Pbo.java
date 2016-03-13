/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150 (class Mahasiswa, class TugasAkhir, class main(Pbo) )
 - Ika Setyasari 1301144020 (class Dosen)
 - Laela Citra Asih 1301144300 (class KelompokTA, class orang)
 */
package pbo;
public class Pbo {
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
        System.out.println("Test");
        Dosen d0 = new Dosen("Dosen0","AAA","SIDE");
        Dosen d1 = new Dosen("Dosen1","BBB","SIDE");
        Mahasiswa m0 = new Mahasiswa("Mahasiswa0","012","SIDE");
        Mahasiswa m1 = new Mahasiswa("Mahasiswa1","123","SIDE");
        
        //Minimum Specification nomor 1. Dosen dapat membuat suatu kelompok TA dengan topik tertentu
        d0.CreateKelompokTA("pbo");
        
        //Minimum Specification nomor 2. Dosen dapat menambahkan / menghapus anggota kelompok TA
        d0.GetKelompok("pbo").addAnggota(m0);
        d0.GetKelompok(0).addAnggota(m1);
        d0.GetKelompok("pbo").removeAnggota("123");
        /*optional menampilkan informasi kelompok*/
        System.out.println("Nama Topik : "+d0.GetKelompok("pbo").getTopik());
        System.out.println("Anggota    : ");
        
        // Minimum Specification nomor 3. Mahasiswa dapat membuat sebuah TugasAkhir
        m0.createTA("sistem informasi TA");
        /*optional menampilkan judul TA*/
        System.out.println("judul TA sebelum    : "+m0.getTugasAkhir().getJudul());
        
        //Minimum Specification nomor 4. Dosen dapat menambahkan dirinya menjadi pembimbing suatu tugas akhir dari seorang mahasiswa
        d0.GetKelompok("pbo").getAnggota("012").getTugasAkhir().setPembimbing(d0, 0);
        d0.setStatus("Pembimbing 1");
        
        //Minimum Specification nomor 5. Mahasiswa dapat merevisi judul TA
        m0.getTugasAkhir().setJudul("sisfo TA");
        /*optional menampilkan judul TA*/
        System.out.println("judul TA setelah    : "+m0.getTugasAkhir().getJudul());
        
        //Minimum Specification nomor 6. Mahasiswa memiliki status sudah lulus atau belum
        System.out.println("Status sebelum      : "+m0.getStatus()); 
        d0.GetKelompok("pbo").getAnggota("012").setStatus("Lulus");
        System.out.println("Status setelah      : "+m0.getStatus());

        //Minimum Specification nomor 7. Dosen memiliki status bisa sebagai pembimbing 1 atau 2
        System.out.println(d0.getStatus());
    }
    
}
