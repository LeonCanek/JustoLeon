package t2_herencia.casoi3;

class A{
    static {
        System.out.println("A.<clinit>");
    }
    {
        System.out.println("A.<init>");
    }
    A(){
        System.out.println("A()");
    }
}

class D extends A { // D-> A
        static{
            System.out.println("Bloque statico de la clase D");
        }
        {
            System.out.println("Bloque de instancia D");
        }
        D(){
            System.out.println("D()");
        }
        class X extends D { // D.X -> D
            static{
                System.out.println("Bloque statico de la clase D.X");
            }
            {
                System.out.println("Bloque de instancia D.X");
            }
            X(){
                System.out.println("D.X()");
            }
        }
    }
public class Caso3 {
        public static void main(String[] args){
            new D().new X();
            // A a= new D();
            // D.X dx = new D().new X();
        }
}
