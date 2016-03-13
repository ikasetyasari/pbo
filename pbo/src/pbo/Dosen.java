/*
 Kelompok 8 Sistem Informasi Pengolahan Data-TA
 - Imam Rahman 1301140150 (class Mahasiswa, class TugasAkhir, class main(Pbo) )
 - Ika Setyasari 1301144020 (class Dosen)
 - Laela Citra Asih 1301144300 (class KelompokTA, class orang)
 */
package pbo;
public class Dosen extends Orang{
    /*--- class Dosen full atribut, encapsulate ---*/
    private KelompokTA[] topikTA = new KelompokTA[10];
    private String kode;
    private int nTopik;
    private String status;
    /*--- end of class Dosen full atribut, encapsulate ---*/
    /*--- constractor Dosen ---*/
    public Dosen(String nama, String kode, String kk){
        super(nama,kk);
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
        return topikTA[n];
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
    /*--- end of getKelompok by topik ---*/
    /*--- deleteKelompok ---*/
    public void deleteKelompok(int n){
        for(int i=n;i<nTopik-1;i++){
                topikTA[i]=topikTA[i+1];
            }
        nTopik--;
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
}	