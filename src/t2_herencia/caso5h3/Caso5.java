package t2_herencia.caso5h3;


class G5 { //G5
        static{
            System.out.println("Static G5");
        }
        {
            System.out.println("Bloque de inicializacion de G5");
        }
        static class X { //G5.X
            static{
                System.out.println("Static X");
            }
            {
                System.out.println("Bloque de inicializacion de X");
            }
        }
    }

    class H5 extends G5 { //H5->G5
        static{
            System.out.println("Bloque statico H5");
        }
        {
            System.out.println("Bloque de instancia H5");
        }
        class Y extends X { //H5.Y -> G5.X
            static{
                System.out.println("Static Y");
            }
            {
                System.out.println("Bloque de inicializacion de Y");
            }
        }
    }
public class Caso5{
    public static void main(String[] args){
        new H5();
        //G5 up5 = new H5();//Upcasting
        //H5 up55 = (H5)up5;//Downcasting
    }
}
// Proceso de construccion
// se inicia entrando por la clase Caso5 entra al main se inicializa una nueva clase H5
// SUBE h5 y sube ala clase padre G5 ejecutando su bloque statico baja a G5 y
// ejecuta su bloque statico y sube a la clase padre, como ya esta creada la clase G5
// se ejecuta su bloque de inicialixzacion de g5 y baja
// a la clase H5 y ejecuta el bloque de instancia
//
