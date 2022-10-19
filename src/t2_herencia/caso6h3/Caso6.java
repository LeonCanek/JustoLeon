package t2_herencia.caso6h3;

/**
 * Esta clase contiene una clase anidada statica
 *
 * @author Justo
 */
class J5 { // J5
    static{
        System.out.println("Hola soy el static J5");
        }
        {
            System.out.println("Soy el bloque de instancia J5");
        }
        static class X {  //J5 -> X
            static{
                System.out.println("Static DE LA CLASE ESTATICA J5.X");
            }
            {
                System.out.println("Bloque de inicializacion de J5.X");
            }
        }
    }

/**
 * Esta clase contiene una clase andidada estatica
 */
    class K5 extends J5 {  //K5 -> J5
        static{
            System.out.println("Static DE LA clase k5");
        }
        {
            System.out.println("Bloque de inicializacion de k5");
        }
        static class Y extends J5.X { //Y -> J5.X
            static{
                System.out.println("cLASE STATIC K5.Y");
            }
            {
                System.out.println("Bloque de inicializacion de Y");
            }
        }
    }

public class Caso6{
    public static void main(String[] args){
        new K5();
        System.out.println("******");
        J5 up6 = new K5();//Upcasting
        System.out.println("******");
        K5 up66 = (K5)up6;//Downcasting
        String paco = "Hola soy paco";

    }
}
/** Proceso de construccion
*   se inicia entrando por la clase Caso6 entra al main se inicializa una nueva clase K5
* SUBE k5 y sube ala clase padre J5 ejecutando su bloque statico baja a k5 y
* ejecuta su bloque statico y sube a la clase padre, como ya esta creada la clase J5
* se ejecuta su bloque de inicialixzacion de J5 y baja
* a la clase k5 y ejecuta el bloque de instancia
* en la linea 41 se crea una clase K5 y esta sew guarda la varibale up66 que es de tipo J5
* realizando con esto el Upcasting
*/