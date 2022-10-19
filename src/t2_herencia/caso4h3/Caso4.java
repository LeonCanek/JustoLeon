package t2_herencia.caso4h3;



class E5 { //E5
        static{
        System.out.println("Static E5");
    }
        {
            System.out.println("Bloque de inicializacion de E5");
        }
        static class X {  //E5.X
            static{
                System.out.println("CLASE INTERNA Static E5.X");
            }
            {
                System.out.println("Bloque de inicializacion de X");
            }
        }
    }
class F5 extends E5.X {  //F5->E5.X

    static {
        System.out.println("Static F5");
        }
        {
            System.out.println("Bloque de inicializacion de F5");
        }
}

public class Caso4{
    public static void main(String[] args){
        new F5();
    }
}

