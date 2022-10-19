package c_referencias_metodos;

import java.util.ArrayList;

interface pako{
     String p();
}

class Cp{
    String p(){return "Hola";}
}
public class ReferenciaPaco {
    public static void main(String[] args){
        pako p = () ->"Bue";
        String response = "";
        p= () -> "Lizbeth";
        System.out.println(p.p());
        Cp p1 = new Cp();
        pako p11 = p1::p;
        ArrayList<String> justoArrayList = new ArrayList<>();
        justoArrayList.add("Lizbeth");
        justoArrayList.add(1, "Jeanny");
        justoArrayList.add("Jeanny");
        justoArrayList.forEach((n) -> System.out.println(n));
        justoArrayList.forEach((t) -> System.out.println(t));
    }


}
