package t2_herencia;

class C5 { //C5
        static{
            System.out.println("Static C5");
        }
        {
            System.out.println("Bloque de inicializacion de C5");
        }
        static class X extends C5 { //C5.X->C5
            static{
                System.out.println("Static X");
            }
            {
                System.out.println("Bloque de inicializacion de X");
            }
        }
    }
