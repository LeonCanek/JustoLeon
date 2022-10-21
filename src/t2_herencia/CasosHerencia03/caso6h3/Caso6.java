package t2_herencia.CasosHerencia03.caso6h3;


/**
 * Esta clase contiene una clase anidada statica
 *
 * @author Justo
 */

class J5 { // J5
    static {
        System.out.println("Hola soy el static J5");
    }

    {
        System.out.println("Soy el bloque de instancia J5");
    }
    J5(){

    }

    static class X {  //J5 -> X
        static {
            System.out.println("Static DE LA CLASE ESTATICA J5.X");
        }

        {
            System.out.println("Bloque de inicializacion de J5.X");
        }
        X(){
            System.out.println("Constructor J5.X");
        }
    }
}

/**
 * Esta clase contiene una clase andidada estatica
 */

class K5 extends J5 {  //K5 -> J5
    static {
        System.out.println("Static DE LA clase k5");
    }

    {
        System.out.println("Bloque de inicializacion de k5");
    }
    K5(){
        System.out.println("Constructor K5");
    }

    static class Y extends J5.X { //Y -> J5.X
        static {
            System.out.println("cLASE STATIC K5.Y");
        }

        {
            System.out.println("Bloque de inicializacion de Y");
        }
        Y(){
            System.out.println("Constructor Y");
        }
    }
}

public class Caso6 {

    public static void main(String[] args) {
        new K5.Y();
        //J5 up6 = new K5();//Upcasting
        //K5 up66 = (K5) up6;//Downcasting
    }
}
/**
 * Proceso de construccion
 * Inicia por la clase publica Caso5 -> metodo statico main y se ejecuta la clase anonima interna H5.Y
 * ya que esta hereda de la clase anidada J5.X sube a la super clase J5.X y ejecuta su bloque statico
 * baja a J5.X y ejecuta su bloque statico y regresa al padre donde ejecuta su bloquye de instancia y su constructor
 * y baja a k5.Y y ejecuta su bloque de instancia y constructor
 *
 */