package t2_herencia.casoi1;

interface I {//I
}
class A { //A
    static{
        System.out.println("Bloque static en Clase A");
    }
    {
        System.out.println("Bloque de instancia A");
    }
}
class B { //B
    static{
        System.out.println("Bloque static de clase B");
    }
    {
        System.out.println("Bloque de instancia B");
    }
    class X extends A implements I { // B.X -> A
        static{
            System.out.println("Bloque static de clase B.X");
        }
        {
            System.out.println("Bloque de instancia B.X");
        }
    }
}
public class Caso1{
    public static void main(String[] args){

    }
}