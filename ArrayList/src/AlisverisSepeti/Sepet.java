package AlisverisSepeti;

import java.util.ArrayList;

public class Sepet{
     public static void main(String[] args) {
       ArrayList<String> listem=new ArrayList<String>();
       listem.add("mascara");
       listem.add("ruj");
       boolean varMi=listem.contains("mascara");
       System.out.println(varMi);
       listem.clear();
       boolean bosMu=listem.isEmpty();
       System.out.println(bosMu);
}
}