package t2_herencia.CasosHerencia03.caso4h3;


/**
 * Clase E5 contiene la clase anidada E5.X
 *  @author Justo León
 */
class E5 { //E5
    static {
        System.out.println("Static E5");
    }

    {
        System.out.println("Bloque de inicializacion de E5");
    }

    E5() {
        System.out.println("Constructor E5");
    }

    static class X {  //E5.X
        static {
            System.out.println("CLASE INTERNA Static E5.X");
        }

        {
            System.out.println("Bloque de inicializacion de E5.X");
        }

        X() {
            System.out.println("Constructor de E5.X");
        }
    }
}

/**
 * Clase F5 extiende de la clase anidada E5.X
 */
class F5 extends E5.X {  //F5->E5.X

    static {
        System.out.println("Static F5");
    }

    {
        System.out.println("Bloque de inicializacion de F5");
    }

    F5() {
        System.out.println("Constructor de F5");
    }
}

public class Caso4 {
    public static void main(String[] args) {
        new F5();
        //E5.X up4 = new F5();//Upcasting
        //E5.X up44 = (E5.X)up4;//Downcasting
    }
}
/**
 * El proceso de construccion inicia en la clase public class Caso4 e ingresa al metodo
 * statico main y ejecuta la clase anonima new F5(); e ingresa a la clase F5 y como esta herda de E5.X
 * sube ala clase anidada y ejecuta su static ya que las clases anidadas no tienen acceso a los mienbros
 * de la clase externa y al no contar con una herencia E5 no se considera y baja a F5
 * onde es ejecutado su bloque statico , sube y ejecuta su bloque de isntancia y sel constructor de E5.X
 * y por ultimo el bloque de inicializacion de F5 y su constructor
 */
