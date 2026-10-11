
package rekursifmetot;
public class tekBoyutluDiziCevir {

    public static void main(String[] args) {
        // Örnek bir 2D matris
        int[][] matris = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Metodu çağırıyoruz
        int[] sutunMatrisi = matrisiTekBoyutaCevir(matris);

        // Sonucu yazdırma
        for (int eleman : sutunMatrisi) {
            System.out.println(eleman); // Her eleman yeni bir satıra (sütun görünümü)
        }
    }

    /**
     * İki boyutlu diziyi tek boyutlu diziye dönüştürür.
     */
    public static int[] matrisiTekBoyutaCevir(int[][] dizi2D) {
        // 1. Adım: Matrisin toplam eleman sayısını hesapla
        int satirSayisi = dizi2D.length;
        int sutunSayisi = dizi2D[0].length;
        int[] sonuc = new int[satirSayisi * sutunSayisi];

        int indeks = 0;

        // 2. Adım: Elemanları sırayla yeni diziye aktar
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                sonuc[indeks] = dizi2D[i][j];
                indeks++;
            }
        }

        return sonuc;
    }
}
    
