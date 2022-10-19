package t2_herencia.casoi5;

class G{
        static{
                System.out.println("Bloque statico de la clase G");
        }
        {
                System.out.println("Bloque de instancia G");
        }
        class X {
                static{
                        System.out.println("Bloque statico de la clase G.X");
                }
                {
                        System.out.println("Bloque de instancia G.X");
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
        class Y extends G.X{
                static{
                        System.out.println("Bloque statico de la clase  G.Y");
                }
                {
                        System.out.println("Bloque de instancia G.Y");
                }
        }

}

public class Caso5 {
        public static void main(String[] args){
                new H().new Y();
        }
}
