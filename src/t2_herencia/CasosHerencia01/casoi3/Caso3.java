package t2_herencia.CasosHerencia01.casoi3;

/**
 * @author Justo
 */
class A {
    static {
        System.out.println("A.<clinit>");
    }

    {
        System.out.println("A.<init>");
    }

    A() {
        System.out.println("A()");
    }
}

class D extends A { // D-> A
    static {
        System.out.println("Bloque statico de la clase D");
    }

    {
        System.out.println("Bloque de instancia D");
    }

    D() {
        System.out.println("D()");
    }

    class X extends D { // D.X -> D
        static {
            System.out.println("Bloque statico de la clase D.X");
        }

        {
            System.out.println("Bloque de instancia D.X");
        }

        X() {
            System.out.println("D.X()");
        }
    }
}

public class Caso3 {
    public static void main(String[] args) {
        new D().new X();
        // A a= new D();
        // D.X dx = new D().new X();
    }
}
/**
 * El proceso de construccion inicia en la clase publica Caso3 ingresa al metodo statico main
 * ejecuta la instanciacion de la clase anidada con new D().new X()
 * ya que esta hereda de D sube a D y esta su vez hereda de la clase A por lo cual
 * sube a la clase A y ejecuta su bloque statico baja a D y ejecuta su bloque statico
 * baja ala clase anidada y ejecuta su bloque statico
 * sube a la clase A e imprime el bloque de instancia y su contrcutor
 * baja a D y ejecuta su bloque de instancia y su construcro
 * al crear la instancia de la clase externa vuelve a subir ala clase A
 * ejecuta nuevamente el bloque de instancia y coinstructor
 * baja a D ejecuta nuevamente el bloque de instancia y coinstructor y por ultimo
 * inmgresa ala clase interna y ejecuta su bloque de instancia y su constructor
 */