/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150 (class Mahasiswa, class TugasAkhir, class main(Pbo) )
 - Ika Setyasari 1301144020 (class Dosen)
 - Laela Citra Asih 1301144300 (class KelompokTA, class orang)
 */
package model;
public class KelompokTA {
    /*
    Task (berdarkan https://drive.google.com/file/d/0BxMqes854yZcRlpEbFU4TmtudGM/view)
    - Kelompok TA full attribute, encapsulate
    - Add Anggota kelompok
    - Get Anggota by index
    - Get Anggota by NIM
    - Remove Anggota
    */
    
    /*--- class KelompokTA full atribut, encapsulate ---*/
    private String topik;
    private Mahasiswa[] anggota = new Mahasiswa[2];
    private int nAnggota;
    /*--- end of class KelompokTA full atribut, encapsulate ---*/
    
    /*------------------------- sprint 1 ------------------------- */
    public KelompokTA(String topik){
        this.topik = topik;
    }
    /*--- add anggota kelompok ---*/
    public void addAnggota(Mahasiswa m){
        if(nAnggota<anggota.length){
            anggota[nAnggota]= m;
            nAnggota++;
        }
    }
    /*--- end of add anggota kelompok ---*/
   /*--- get Topik ---*/ 
   public String getTopik(){
       return topik;
   }
   /*--- end of get Topik ---*/ 
   /*--- get anggota by index ---*/
    public Mahasiswa getAnggota(int n){
        return anggota[n];
    }
    /*--- end of get anggota by index ---*/
    /*--- get anggota by NIM ---*/
    public Mahasiswa getAnggota(String NIM){
        for(int i=0;i<nAnggota;i++){
            if(NIM.equals(anggota[i].getNIM())){
                return anggota[i];
            }
        }
        return null;
    }
    /*--- end of get anggota by NIM ---*/
    /*--- remove anggota ---*/
    public void removeAnggota(String NIM){
        int j = -1;
        for(int i=0;i<nAnggota;i++){
            if(NIM.equals(anggota[i].getNIM())){
                j = i;
                anggota[i] = null;
            }
        }
        if (j!= -1){
            for(int i=j;i<nAnggota-1;i++){
                anggota[i]=anggota[i+1];
            }
            nAnggota--;
        }
    }
    /*--- end of remove anggota ---*/
    /*------------------------- end of sprint 1 ------------------------- */
    
    /*------------------------- sprint 2 ------------------------- */
    /*--- toString ---*/
    public String toString(){
        String x = "Topik\t="+this.getTopik()
                +"\nMahasiswa\t=\n";
        for(int i = 0;i<nAnggota;i++){
            x = x + this.getAnggota(i).toString() + "\n";
        }
        return x;
    }
    /*--- end of toString ---*/
    public Mahasiswa[] getAllAnggota(){
        return anggota;
    }
            
    /*------------------------- end of sprint 2 ------------------------- */
}