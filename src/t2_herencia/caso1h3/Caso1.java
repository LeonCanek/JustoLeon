package t2_herencia.caso1h3;

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
public class Caso1{
     public static void main(String[] args){
     //new B5.X();
     A5 up1 = new B5.X();//Upcasting
     B5.X up11= (B5.X)up1;//Downcasting

     }
}
