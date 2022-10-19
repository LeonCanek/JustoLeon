package t2_herencia;

class J5 {
    static{
        System.out.println("Hola soy el static J5");
    }
        {
            System.out.println("Soy el bloque de instancia J5");
        }
        static class X {
            static{
                System.out.println("Static DE LA CLASE ESTATICA J5.X");
            }
            {
                System.out.println("Bloque de inicializacion de J5.X");
            }
        }
    }

    class K5 extends J5 {
        static{
            System.out.println("Static DE LA clase k5");
        }
        {
            System.out.println("Bloque de inicializacion de k5");
        }
        static class Y extends X {
            static{
                System.out.println("cLASE STATIC K5.Y");
            }
            {
                System.out.println("Bloque de inicializacion de Y");
            }
        }
    }

