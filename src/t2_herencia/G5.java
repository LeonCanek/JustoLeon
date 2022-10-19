package t2_herencia;

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

