package t2_herencia.caso3h3;



class A5 {  //A5
    static{
        System.out.println("Static A5");
    }
    {
        System.out.println("Bloque de inicializacion de A5");
    }
}
class D5 extends A5 { //D5->A5
        static{
            System.out.println("Static D5");
        }
        {
            System.out.println("Bloque de inicializacion de D5");
        }
        static class X extends D5 { //D5.X -> D5
            static{
                System.out.println("Static D5.X");
            }
            {
                System.out.println("Bloque de inicializacion de X");
            }
        }
    }
public class Caso3 {
    public static void main(String[] args) {
        new D5.X();
        // A a= new D();
        // D.X dx = new D().new X();


    }
}



