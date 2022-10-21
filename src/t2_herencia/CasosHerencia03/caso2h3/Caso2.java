package t2_herencia.CasosHerencia03.caso2h3;


/**
 * Clase C5 que contiene una clase anidada C5.X que hereda de C5
 *
 * @author Justo León
 */
class C5 { //C5
    static {
        System.out.println("Static C5");
    }

    {
        System.out.println("Bloque de inicializacion de C5");
    }

    C5() {
        System.out.println("Constructor C5");
    }

    /**
     * Clase anidada statica C5.X que herda de C5
     */
    static class X extends C5 { //C5.X->C5
        static {
            System.out.println("Static C5.X");
        }

        {
            System.out.println("Bloque de inicializacion de C5.X");
        }

        X() {
            System.out.println("Constructor de C5.X");
        }
    }
}

/**
 * Clase Caso2 Publica, da inicio a el proceso de construccion y se ejecutan las instanciaciones requeridas por el ejercicio
 */
public class Caso2 {
    public static void main(String[] args) {
        new C5.X();
        //C5 up2 = new C5.X();//Upcasting
        //C5.X up22 = (C5.X)up2;//Downcasting
/**
 * El proceso de construccion inicia en la clase publica Caso2 ingresando a su metodo estatico main
 * y se ejecuta ejecuta la instanciacion de la clase anidada
 * sube a la clase C5.X y como hereda de C5 sube a C5 y ejecuta su bloque de instancia
 * baja a C5.X y se ejecuta su bloque de statico sube y ejecuta el bloque de instancia C5 y su constructor
 * al final ya creado por completo el objeto padre baja a C5.X y ejecuta si bloque de inicializacion y su constructor
 */


    }
}
