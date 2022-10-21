package t2_herencia.CasosHerencia03.caso1h3;

/**
 *  @author Justo León
 */
interface I5 {  // I5

}

class A5 {  //A5
    static {
        System.out.println("Static A5");
    }

    {
        System.out.println("Bloque de inicializacion de A5");
    }
    A5(){
        System.out.println("Constructor A5");
    }
}

class B5 { //B5
    static {
        System.out.println("Static B5");
    }

    {
        System.out.println("Bloque de inicializacion de b5");
    }
    B5(){
        System.out.println("Constructor B5");
    }

    static class X extends A5 implements I5 { //B5.X->A5->I5
        static {
            System.out.println("Static B5.X");
        }

        {
            System.out.println("Bloque de inicializacion de X");
        }
        X(){
            System.out.println("Cosntructor de ");
        }
    }
}

public class Caso1 {
    public static void main(String[] args) {
        new B5.X();
        //A5 up1 = new B5.X();//Upcasting
        //B5.X up11 = (B5.X) up1;//Downcasting
    }
}
/**
 * El proceso de construccion inicia en la clase publica Caso1
 * luego al metodo static main y
 * ejecuta la instanciacion de la clase anidada
 * ingresa a la clase padre A5 y se ejecuta el bloque statcio
 * baja ala clase hija y se ejecuta su bloque statico
 * sube y continua con el bloque de inicializacion del padre y su constructor
 * y baja a la clase hija ejecutando su bloque de inicializacion y su constructor
 */
