package t2_herencia.caso2h3;



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

public class Caso2{
    public static void main(String[] args){
        //new C5.X();
        C5 up2 = new C5.X();//Upcasting
        C5.X up22 = (C5.X)up2;//Downcasting



    }
}
