package t2_herencia.casoi2;



    //Caso 2
    class C {
        static{
            System.out.println("Bloque statico de la clase C");
        }
        {
            System.out.println("Bloque de instancia C");
        }
        C(){
            System.out.println("Constructor C()");
        }
        class X extends C {// C.X -extiende de > C
            static{
                System.out.println("Bloque statico de la clase C.X");
            }
            {
                System.out.println("Bloque de instancia C.X");
            }
            X(){
                System.out.println("Constructor C.X()");
            }
        }
    }
public class Caso2 {
        public static void main(String[] args){
        new C().new X();
        /*
        Tipificación: C, C.X, Object

        C objc = new C().new X();
        C.X cx = ((C.X)objc);
         */

        }
}
