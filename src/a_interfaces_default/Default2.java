package a_interfaces_default;
interface Faz1{
    static void m(){
        System.out.println("Hola");
    }
}
interface Faz2{
    default void m(){
        System.out.println("Adios");
    }
}
interface Faz3{
/*    void m(){ // Bro tiene que ser default ya te la sabes
        System.out.println("Holi");
    }*/

    default double holi(){
        System.out.println("HoliBoli");
        return 2.0;
    }
}
public class Default2 {
    public static void main(String[] args){
        Faz1.m();
        Faz2 f= new Faz2() {
            @Override
            public void m() {
                Faz2.super.m();
            }
        };
        f.m();

        // un metodo defaul es aquel que se implementa por defecto
        Faz3 d= new Faz3() {};
        d.holi();
    }
}
