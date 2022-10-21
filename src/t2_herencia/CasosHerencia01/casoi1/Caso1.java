package t2_herencia.CasosHerencia01.casoi1;

/**
 * Interfaz que se implementa en la clase interna de B -> "X"
 * @author Justo
 */
interface I {//I
}

/**
 * Clase heredada a la clase interna de B -> "X"
 */
class A { //A
    static {
        System.out.println("Bloque static en Clase A");
    }

    {
        System.out.println("Bloque de instancia A");
    }

    A() {
        System.out.println("Constructor A()");
    }
}

class B { //B
    static {
        System.out.println("Bloque static de clase B");
    }

    {
        System.out.println("Bloque de instancia B");
    }

    class X extends A implements I { // B.X -> A
        static {
            System.out.println("Bloque static de clase B.X");
        }

        {
            System.out.println("Bloque de instancia B.X");
        }

        X() {
            System.out.println("Constructor de B.X");
        }
    }
}

/**
 * El proceso de construccion se incia en la clase public class Caso1
 * se ingresa a su metodo static void main se ´posiciona en la clase interna X
 * al esta heredar de la clase A sube a esta y se ejecuta su bloque statico
 * baja a a la clase B.X y ejecuta su bloque statico
 * y ya que tiene acceso a los miembros de la clase y ala propia clase externa
 * se ejecuta el metodo statico de B
 * ejecuta su bloque de instancia de B sube a su clase padre A y ejecuta su bloque de instancia
 * y su constructor de A
 * baja a B.X ejecuta su bloque de instancia y por ultimo su constructo
 */
public class Caso1 {

    public static void main(String[] args) {
        new B().new X(); // La manera de instanciar X ya que no es estatica es creando un objeto primero de la clase externa
        //A b = new B(). new X(); // Upcasting
        //B.X b2 = (B.X)b; // Downcasting
        //Tipificación: A, B.X, B, I, Object

    }
}