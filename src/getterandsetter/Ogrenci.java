package getterandsetter;

public class Ogrenci {
    private int not;
    public Ogrenci(int not){
        this.not=not;
    }

    public int getNot(){
        return not;
    }

    public void setNot(int not){
        if(not>0 && not<100){
            this.not=not;
            System.out.println("Güncellenmiş Not: "+not);
        }else{
            System.out.println("0-100 arası bir değer girmeniz gerekmektedir.");
        }
    }
}
