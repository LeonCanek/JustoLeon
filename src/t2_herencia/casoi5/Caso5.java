package t2_herencia.casoi5;

class G{
        static{
                System.out.println("Bloque statico de la clase G");
        }
        {
                System.out.println("Bloque de instancia G");
        }
        G(){
                System.out.println("G()");
        }
        class X {
                static{
                        System.out.println("Bloque statico de la clase G.X");
                }
                {
                        System.out.println("Bloque de instancia G.X");
                }
                X(){
                        System.out.println("X()");
                }

        }
}
class H extends G{
        static{
                System.out.println("Bloque de la clase H");
        }
        {
                System.out.println("Bloque statico de la clase G.Y");
        }
        H(){
                System.out.println("H()");
        }
        class Y extends G.X{
                static{
                        System.out.println("Bloque statico de la clase  G.Y");
                }
                {
                        System.out.println("Bloque de instancia G.Y");
                }
                Y(){
                        System.out.println("Y()");
                }
        }

}

public class Caso5 {
        public static void main(String[] args){
                new H().new Y();
        }
}
