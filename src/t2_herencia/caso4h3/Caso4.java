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
                System.out.println("Bloque de inicializacion de E5.X");
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
        //E5.X up4 = new F5();//Upcasting
        //E5.X up44 = (E5.X)up4;//Downcasting
    }
}
//
//    Se ejecuta el static de E5.X
//    Se ejecuta el static de F5
//    sigue con el bloque de instancia de E5.X
//    y baja a ejecutar el bloque de instancia de F5

