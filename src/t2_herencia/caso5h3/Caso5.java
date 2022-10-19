package t2_herencia.caso5h3;


class G5 { //G5
        static{
            System.out.println("Static G5");
        }
        {
            System.out.println("Bloque de inicializacion de G5");
        }
        static class X { //G5.X
            static{
                System.out.println("Static X");
            }
            {
                System.out.println("Bloque de inicializacion de X");
            }
        }
    }

    class H5 extends G5 { //H5->G5
        static{
            System.out.println("Bloque statico H5");
        }
        {
            System.out.println("Bloque de instancia H5");
        }
        class Y extends X { //H5.Y -> G5.X
            static{
                System.out.println("Static Y");
            }
            {
                System.out.println("Bloque de inicializacion de Y");
            }
        }
    }
public class Caso5{
    public static void main(String[] args){
        //new H5();
        G5 up5 = new H5();//Upcasting
        H5 up55 = (H5)up5;//Downcasting


    }
}

