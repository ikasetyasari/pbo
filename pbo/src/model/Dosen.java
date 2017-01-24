/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150 (class Mahasiswa, class TugasAkhir, class main(Pbo) )
 - Ika Setyasari 1301144020 (class Dosen)
 - Laela Citra Asih 1301144300 (class KelompokTA, class orang)
 */
package model;
public class Dosen extends Orang{
    /*
    Task (berdarkan https://drive.google.com/file/d/0BxMqes854yZcRlpEbFU4TmtudGM/view)
    - Dosen full attribute, encapsulate
    - Create new Kelompok
    - Get Kelompok by index
    - Get Kelompok by topik / id kelompok
    - Delete Kelompok
    /*
    
    /*--- class Dosen full atribut, encapsulate ---*/
    private KelompokTA[] topikTA = new KelompokTA[10];
    private String kode;
    private int nTopik;
    private String status;
    /*--- end of class Dosen full atribut, encapsulate ---*/
    
    /*------------------------- sprint 1 ------------------------- */
    /*--- constractor Dosen ---*/
    public Dosen(String nama, String kode, String kk, String username, String password){
        super(nama,kk,username,password);
        this.kode = kode;
    }
    /*--- end of constractor Dosen ---*/
    /*--- Create new KelompokTA ---*/
    public void CreateKelompokTA(String topik) {
        if (nTopik< topikTA.length){
            topikTA[nTopik] = new KelompokTA(topik);
            nTopik++;
        }
    }
    /*--- end of CreateKelompokTA ---*/
    /*--- getKode ---*/
    public String getKode() {
        return kode;
    }
    /*--- end of getKode ---*/
    /*--- setKode ---*/
    public void setKode(String kode) {
        this.kode = kode;
    }
    /*--- end of setKode ---*/
    /*--- getKelompok by index ---*/
    public KelompokTA GetKelompok(int n){
        if (n < nTopik)
            return topikTA[n];
        else return null;
    }
    /*--- end of getKelompok by index ---*/
    /*--- getKelompok by topik ---*/
    public KelompokTA GetKelompok(String topik){
        for(int i=0;i<nTopik;i++){
            if(topikTA[i].getTopik().equals(topik)){
                return topikTA[i];
            }
        }
        return null;
    }
    public String[] getAllTopikTA(){
        String[] a = new String[nTopik];
        for(int i=0;i<nTopik;i++){
            a[i] = topikTA[i].getTopik();
        }
        return a;
    }
    /*--- end of getKelompok by topik ---*/
    /*--- deleteKelompok ---*/
    public void deleteKelompok(int n){
        if (n < nTopik&&n >= 0){
            for(int i=n;i<nTopik-1;i++){
                    topikTA[i]=topikTA[i+1];
                }
            topikTA[nTopik] = null;
            //System.out.println(topikTA[nTopik].getTopik());
            nTopik--;
        }
    }
    /*--- end of deleteKelompok ---*/
    /*--- setStatus ---*/
    public void setStatus(String s){
        status = s;
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
        String x = "Nama\t="+this.getNama()
                +"\nKode\t= "+this.getKode()
                +"\nKK\t="+this.getKk()
                +"\nStatus\t="+this.getStatus();
         return x;       
    }
    /*--- end of toString ---*/
    /*------------------------- end of sprint 2 ------------------------- */
    
}