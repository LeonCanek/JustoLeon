package t2_herencia.CasosHerencia01.casoi5;

/**
 * @author Justo León
 */
class G {
    static {
        System.out.println("Bloque statico de la clase G");
    }

    {
        System.out.println("Bloque de instancia G");
    }

    G() {
        System.out.println("G()");
    }

    class X {
        static {
            System.out.println("Bloque statico de la clase G.X");
        }

        {
            System.out.println("Bloque de instancia G.X");
        }

        X() {
            System.out.println("X()");
        }

    }
}

class H extends G {
    static {
        System.out.println("Bloque statico de la clase H");
    }

    {
        System.out.println("Bloque de instancia de la clase H");
    }

    H() {
        System.out.println("H()");
    }

    class Y extends G.X {
        static {
            System.out.println("Bloque statico de la clase  H.Y");
        }

        {
            System.out.println("Bloque de instancia H.Y");
        }

        Y() {
            System.out.println("Y()");
        }
    }

}

public class Caso5 {
    public static void main(String[] args) {

        new H().new Y();
        //G.X h = new H(). new Y(); // Upcasting
        //H.Y h1 = (H.Y)h; // Downcasting
    }
}
/**
 * El proceso de construccion inicia en la clase publica Caso05
 * ingresa al metodo statico main ejecuta la inicialiczacion de la clase interna H.Y
 * y como esta hereda de la clase interna G.X y tiene acceso a los miembros de la clase
 * ejecunta su bloque statico de G baja a H y ejecuta su bloque statico sube ala clase G y
 * ejecuta su bloque de instancia y su constructor baja ala clase H
 * y ejecuta su bloque de instancia y constructor e ingresa ala iunterna padre G.X
 * donde ejecuta el bloque de instancia y constrcutor para finalmente
 * ejecutar el bloque de instancia de H.Y y su constrcutor
 */