package t2_herencia.CasosHerencia01.casoi4;

/**
 * @author Justo
 */

class E {
    static {
        System.out.println("E.<clinit>");
    }

    {
        System.out.println("E.<init>");
    }

    E() {
        System.out.println("E()");
    }

    class X {
        static {
            System.out.println("Bloque estatico de super clase interna");
        }

        {
            System.out.println("E.X.<init>");
        }

        X() {
            System.out.println(" Constructor E.X.<init>");
        }
    }
}

class F extends E.X {
    static {
        System.out.println("F.<clinit>");
    }

    {
        System.out.println("F<init>");
    }

    F() {
        new E().super();
        System.out.println("F()");
    }
}

public class Casoi4 {
    public static void main(String[] args) {
        new F();
        //E.X e = new F();Upcasting
        //F e1 = (F)e; Downcastig
    }
}
/**
 * El proceso de construccion inicia en la clase publica Casoi4
 * ingresa al metodo sttico main y ejecuta la instanciacion de la clase F
 * ya que esta hereda de la clase interna E.X sube y ejecuta el bloque statcio de la clase
 * interna baja y ekjecuta el bloque statico de F
 * sube y ejecuta el bloque statico de la clase externa su bloque de inicializacion
 * y si constructor , ingresa ala clase interna y ejecuta su bloque de instancia y constructor y
 * baja y ejecuta el bloque de instancia de F y su constructor
 */
