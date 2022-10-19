package t2_herencia.caso6h3;

class J5 { // J5
    static{
        System.out.println("Hola soy el static J5");
    }
        {
            System.out.println("Soy el bloque de instancia J5");
        }
        static class X {  //J5 -> X
            static{
                System.out.println("Static DE LA CLASE ESTATICA J5.X");
            }
            {
                System.out.println("Bloque de inicializacion de J5.X");
            }
        }
    }

    class K5 extends J5 {  //K5 -> J5
        static{
            System.out.println("Static DE LA clase k5");
        }
        {
            System.out.println("Bloque de inicializacion de k5");
        }
        static class Y extends J5.X { //Y -> J5.X
            static{
                System.out.println("cLASE STATIC K5.Y");
            }
            {
                System.out.println("Bloque de inicializacion de Y");
            }
        }
    }

public class Caso6{
    public static void main(String[] args){
        new K5();
        J5 up6 = new K5();//Upcasting
        K5 up66 = (K5)up6;//Downcasting

    }
}
