package t2_herencia.CasosHerencia01.casoi2;

/**
 * @author Justo
 */
//Caso 2
class C { //C
    static {
        System.out.println("Bloque statico de la clase C");
    }

    {
        System.out.println("Bloque de instancia C");
    }

    C() {
        System.out.println("Constructor C()");
    }

    class X extends C {// C.X -extiende de > C

        static {
            System.out.println("Bloque statico de la clase C.X");
        }

        {
            System.out.println("Bloque de instancia C.X");
        }

        X() {
            System.out.println("Constructor C.X()");
        }
    }
}

public class Caso2 {
    public static void main(String[] args) {
        new C().new X();
        /*
        Tipificación: C, C.X, Object

        C objc = new C().new X();
        C.X cx = ((C.X)objc);
         */
    }
}
/**
 * El proceso de construccion inicia en la clase public class Caso2
 * y ejecuta la clase anonima new C(). new X(); donde ingresa ala clase C
 * y ejecuta su bloque estatico
 * ingresa ala clase anidada y ejecuta su bloque statico sube al alpadre
 * y ejecuta el bloque de instancia y su constructor y al ser una clase interna y tener acceso
 * alos miembros de la clase y por la ejecucion de new C . ejecuta nuevamente el bloque de instancia
 * y su constrcutor para despues ejecutar el bloque de instanciacion de la clase interna y su
 * constructor
 */