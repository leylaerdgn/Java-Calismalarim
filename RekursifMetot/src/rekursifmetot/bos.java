/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rekursifmetot;

public class bos {

    public static void main(String[] args) {
        String isim="leyla";
        System.out.println(isim(isim,0));
    }
    public static int isim(String isim, int n){
        if(n>=10) return 0;
        return 1+isim(isim,n+1);
    }
}
