/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150 (class Mahasiswa, class TugasAkhir, class main(Pbo) )
 - Ika Setyasari 1301144020 (class Dosen)
 - Laela Citra Asih 1301144300 (class KelompokTA, class orang)
 */
package model;
public class Mahasiswa extends Orang {
    /*
    Task (berdarkan https://drive.google.com/file/d/0BxMqes854yZcRlpEbFU4TmtudGM/view)
    - Mahasiswa full attribute, encapsulate
    - Create new Tugas Akhir
    */

    /*--- class mahasiswa full atribut, encapsulate ---*/
    private TugasAkhir tugasAkhir;
    private String status;
    private String NIM;
    /*--- end of class mahasiswa full atribut, encapsulate ---*/
    /*--- constractor Mahasiswa ---*/    
    
    /*------------------------- sprint 1 ------------------------- */
    public Mahasiswa(String nama,String nim, String kk, String username, String password){
        super(nama,kk,username,password);
        this.NIM = nim;
        //membuat status mahasiswa, dalam kasus ini default status yakni belum lulus
        createStatus();
    }
    /*--- end constractor Mahasiswa ---*/    
    /*--- setNIM ---*/    
    public void setNIM(String nim){
        this.NIM = nim;
    }
    /*--- end of setNIM ---*/    
    /*--- getNIM ---*/    
    public String getNIM(){
        return NIM;
    }
    /*--- end of getNIM ---*/    
    /*--- create new tugas akhir ---*/
    public void createTA(String judul){
        tugasAkhir = new TugasAkhir(judul);
    }
    /*--- end of create new tugas akhir ---*/
    /*--- get tugas akhir ---*/
    public TugasAkhir getTugasAkhir(){
        return tugasAkhir;
    }
    public String[] getAllTA(){
        String[] a = new String[0];
        a[0] = tugasAkhir.getJudul();
        return a;
    }
    /*--- end of get tugas akhir ---*/
    /*--- create Status ---*/
    public void createStatus(){
        setStatus("Belum Lulus");
    }
    /*--- end of create Status ---*/
    /*--- setStatus ---*/
    public void setStatus(String status){
        this.status = status;
    }
    /*--- end of setStatus ---*/
    /*--- getStatus ---*/
    public String getStatus(){
        return status;
    }
    /*--- end of getStatus ---*/
    /*------------------------- end of sprint 1 ------------------------- */
    
    /*------------------------- sprint 2 ------------------------- */
    /*--- toString ---*/
    public String toString(){
        String x ="Nama\t="+this.getNama()
                +"\nNIM\t="+this.getNIM()
                +"\nKK\t="+this.getKk()
                +"\nStatus\t="+this.getStatus();
        return x;
    }
    /*--- end of toString ---*/
    /*------------------------- end of sprint 2 ------------------------- */
}