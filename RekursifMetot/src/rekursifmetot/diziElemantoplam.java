
package rekursifmetot;

public class diziElemantoplam {

    public static void main(String[] args) {
        int[] dizi={1,2,3,4,5};
        System.out.println(elemanTopla(dizi,0));
    }
    
    public static int elemanTopla(int[] dizi, int index){
        if(index==dizi.length){
            return 0;
        }
        return dizi[index]+elemanTopla(dizi,index+1);
    }
}
