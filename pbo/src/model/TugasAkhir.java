/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150 (class Mahasiswa, class TugasAkhir, class main(Pbo) )
 - Ika Setyasari 1301144020 (class Dosen)
 - Laela Citra Asih 1301144300 (class KelompokTA, class orang)
 */
package model;
public class TugasAkhir {
     /*
    Task (berdarkan https://drive.google.com/file/d/0BxMqes854yZcRlpEbFU4TmtudGM/view)
    - TugasAkhir full attribute, encapsulate
    - Set Pembimbing by index
    - Get Pembimbing by index
    - Get Pembimbing by kode dosen
    */
    
    /*--- class TugasAkhir full atribut, encapsulate ---*/
    private Dosen[] pembimbing = new Dosen[2];
    private String judul;
    /*--- end of class TugasAkhir full atribut, encapsulate ---*/
    
    /*------------------------- sprint 1 ------------------------- */
    /*--- constractor TugasAkhir ---*/
    public TugasAkhir(String judul){
        //this.judul = judul;
        setJudul(judul);
    }
    /*--- end of constractor TugasAkhir ---*/
    /*--- setJudul ---*/
    public void setJudul(String judul){
        this.judul = judul;
    }
    /*--- end of setJudul ---*/
    /*--- getJudul ---*/
    public String getJudul(){
        return judul;
    } 
    /*--- end of getJudul ---*/
    /*--- set pembimbing by index ---*/
    public void setPembimbing(Dosen d,int i){
        this.pembimbing[i] = d;
    }
    /*--- end of set pembimbing by index ---*/
    /*--- get pembimbing by index ---*/
    public Dosen getPembimbing(int i){
        return pembimbing[i];
    }
    /*--- end of get pembimbing by index ---*/
    /*--- get pembimbing by kode dosen ---*/
    public Dosen getPembimbing(String kode){
        for(int i=0;i<2;i++){
            if (pembimbing[i].getKode().equals(kode)){
                return pembimbing[i];
            }
        }
        return null;
    }
    public int getNomorPembimbing(String kode){
        for(int i=0;i<2;i++){
            if (pembimbing[i].getKode().equals(kode)){
                return i+1;
            }
        }
        return 0;
    }
    /*--- end of get pembimbing by kode dosen ---*/
    /*------------------------- end of sprint 1 ------------------------- */
    
    /*------------------------- sprint 2 ------------------------- */
    /*--- toString ---*/
    public String toString(){
        String x = "Judul\t="+this.getJudul();
        return x;
    }
    
    public String getDosenView(){
        String s = "";
        if (pembimbing[0]!=null){
            s = s +"Pembimbing 1: " + pembimbing[0].toString();
        }
        if (pembimbing[1]!=null){
            s = s +"\nPembimbing 2: " + pembimbing[1].toString();
        }
        return s;
    }
    /*--- end of toString ---*/
    /*------------------------- end of sprint 2 ------------------------- */
}