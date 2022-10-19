package t2_herencia.casoi4;


class E{
    static{
        System.out.println("E.<clinit>");
    }
    {
        System.out.println("E.<init>");
    }
    E(){
        System.out.println("E()");
    }
    class X {
        {
            System.out.println("E.X.<init>");
        }
        X(){
            System.out.println("E.X.<init>");
        }
        static{
            System.out.println("Bloque estatico de super clase interna");
        }
    }
}
class F extends E.X{
    static {
        System.out.println("F.<clinit>");
    }
    {
        System.out.println("F<init>");
    }
    F(){
        new E().super();
        System.out.println("F()");
    }
}

public class Casoi4 {
    public static void main(String[] args){new F();}
}

