## Thread Nedir?
Bir programın yaptığı işlerin akışına thread (iş parçacığı) denir.
Amacı bir program içinde birden fazla işi aynı anda yürütmek.

##Nasıl Yazılır?
class BenimThread extends Thread {

}
##run() Metodu
Bir thread çalışınca ne yapacağını burada yazarız.
class BenimThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread çalışıyor");
    }
}

##Thread'i Başlatmak
public class Main {
    public static void main(String[] args) {
        BenimThread t1 = new BenimThread();
        t1.start();
    }
}

Çıktı: Thread çalışıyor

##Thread'ın Özellikleri
1- Bağımsız çalışır. Her thread kendi işini yapar.
2- Aynı anda çalışıyormuş gibi görünür. İşletim sistemi thread'lar arasında hızlı geçiş yapar.
3- Kendi çalışma metodu vardır. Her thread'in çalıştıracağı kod: public void run()
4- start() ile başlatılır.
5- Uyutulabilir: thread.sleep(1000) 1 saniye bekler.
