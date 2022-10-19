package t2_herencia.casoi2;



    //Caso 2
    class C {
        static{
            System.out.println("Bloque statico de la clase C");
        }
        {
            System.out.println("Bloque de instancia C");
        }
        class X extends C {// C.X -extiende de > C
            static{
                System.out.println("Bloque statico de la clase C.X");
            }
            {
                System.out.println("Bloque de instancia C.X");
            }
        }
    }
public class Caso2 {
        public static void main(String[] args){

        }
}
