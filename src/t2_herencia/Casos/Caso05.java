package t2_herencia.Casos;

class G {
    static {
        System.out.println("Bloque statico de la clase G");
    }{
        System.out.println("Bloque de instancia G");
    }
    class X {
        static{
            System.out.println("Blpque statico de la clase G.X");
        }
        {
            System.out.println("Bloque de instancia G.X");
        }
    }
}
class H extends t2_herencia.Casos.G {
    static{
        System.out.println("Bloque statico de la clase G.Y");
    }
    {
        System.out.println("Bloque de intancia G.Y");
    }
}
public class Caso05 {
    public static void main(String[] args){

    }
}
