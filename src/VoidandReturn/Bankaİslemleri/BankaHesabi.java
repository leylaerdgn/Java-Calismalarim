package VoidandReturn.Bankaİslemleri;
public class BankaHesabi{
    int bakiye;

    public BankaHesabi(int bakiye){
        this.bakiye=bakiye;
    }

public void paraYatirma(int para){
     if(para>0){
        bakiye+=para;
        System.out.println("Yeni bakiyeniz: " +bakiye);
     }else{
        System.out.println("Para 0'dan büyük olamlıdır.");
     }
}
public int bonus(int bonus){
    if(bonus>0){
        bakiye+=bonus;
        return bakiye;
    }else{
      return -1;
    }
}
}