package t2_herencia;

interface I5 {  // I5

    }

    class A5 {  //A5
        static{
            System.out.println("Static A5");
        }
        {
            System.out.println("Bloque de inicializacion de A5");
        }
    }

    class B5 { //B5
        static{
            System.out.println("Static B5");
        }
        {
            System.out.println("Bloque de inicializacion de b5");
        }
        static class X extends A5 implements I5 { //B5.X->A5->I5
            static{
                System.out.println("Static B5.X");
            }
            {
                System.out.println("Bloque de inicializacion de X");
            }
        }
    }
