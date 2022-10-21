package t2_herencia.CasosHerencia03.caso5h3;

/**
 * Clase G5 con clase anidada G5.X
 *
 * @author Justo León
 */
class G5 { //G5
    static {
        System.out.println("Static G5");
    }

    {
        System.out.println("Bloque de inicializacion de G5");
    }

    G5() {
        System.out.println("Constructor G5");
    }

    static class X { //G5.X
        static {
            System.out.println("Static G5.X");
        }

        {
            System.out.println("Bloque de inicializacion de G5.X");
        }

        X() {
            System.out.println("Constructor de G5.X");
        }
    }
}

class H5 extends G5 { //H5->G5
    static {
        System.out.println("Bloque statico H5");
    }

    {
        System.out.println("Bloque de instancia H5");
    }

    H5() {
        System.out.println("Constructor de H5");
    }

    class Y extends X { //H5.Y -> G5.X
        static {
            System.out.println("Static H5.Y");
        }

        {
            System.out.println("Bloque de inicializacion de H5.Y");
        }

        Y() {
            System.out.println("Constructor de H5.Y");
        }
    }
}

public class Caso5 {
    public static void main(String[] args) {
        new H5().new Y();
        //G5 up5 = new H5();//Upcasting
        //H5 up55 = (H5)up5;//Downcasting
    }
}
/**
 * Proceso de construccion
 * Ingresa por la clase Caso5 entra al metodo statico main se ejecuta la clase anonima
 * new H5.Y(); ya que esta extiende de la clase anidada G5.X sube a G5.X y ejecuta su bloque statico
 * y sube a su padre y ejecuta el bloque statico baja ala clase padre de H5 y ejecuta su metodo statico
 * baja y ejecuta el bloque estatico de la clase H5.Y y baja a la clase interna H5.Y y se ejecuta el bloque statico
 * sube a la clase  G5  ejecuta su bloque de instancia y su constructor baja y ejecuta el bloque y cosntructor de H5,
 * sube ala clase anidada G5.X y ejecuta su bloque de inicializacion y su constructor y por ultimo el bloque de
 * instancia y el contrxcutor de la clase interna H5.Y()
 */