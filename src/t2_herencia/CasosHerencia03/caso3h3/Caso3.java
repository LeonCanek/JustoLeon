package t2_herencia.CasosHerencia03.caso3h3;

/**
 * Clase A5 que es heredada por D5
 *  @author Justo León
 */
class A5 {  //A5
    static {
        System.out.println("Static A5");
    }

    {
        System.out.println("Bloque de inicializacion de A5");
    }

    A5() {
        System.out.println("Constructor A5");
    }
}

/**
 * Clase D5 que hereda de A5 y contiene la clase anidada D5.X
 */
class D5 extends A5 { //D5->A5
    static {
        System.out.println("Static D5");
    }

    {
        System.out.println("Bloque de inicializacion de D5");
    }

    D5() {
        System.out.println("Cosntructor de D5");
    }

    static class X extends D5 { //D5.X -> D5
        static {
            System.out.println("Static D5.X");
        }

        {
            System.out.println("Bloque de inicializacion de X");
        }

        X() {
            System.out.println("Constructor D5.X");
        }
    }
}

public class Caso3 {
    public static void main(String[] args) {
        new D5.X();
        //D5 up3 = new D5.X();//Upscasting
        //D5.X up33 = (D5.X)up3;//Downcasting
        //Tipificacion: Caso3 , D5.X , D5 , A5 , Object
    }
}

/**
 * El proceso de construccion inicia en el public class Caso3 ingresa al metodo static main
 * ejecuta la clase anonima new D5.X(); y esta al heredar de D5 sube a D5 y de ahi al heredar de A5
 * sube a A5 y ejecuta su bloque statico baja a D5 y ejecuta su bloque statico , ingresa a la clase anidada
 * D5.X y ejecuta su bloque estatico, sube a la clase A5 y ejecuta su bloque de inicializacion
 * y su constructor , baja a D5 y ejecuta su bloque de instanciacion y su constructor
 * y por ultimo el bloque de instanciacion de D5.X y su constructor
 */