package t2_herencia;

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


