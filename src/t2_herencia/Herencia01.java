package t2_herencia;

import java.sql.SQLOutput;

//Caso 1
interface I {//I
    }
class A { //A
    static{
        System.out.println("Bloque static en Clase A");
    }
    {
        System.out.println("Bloque de instancia A");
    }
}
class B { //B
    static{
        System.out.println("Bloque static de clase B");
    }
    {
        System.out.println("Bloque de instancia B");
    }
    class X extends A implements I { // B.X -> A
        static{
            System.out.println("Bloque static de clase B.X");
        }
        {
            System.out.println("Bloque de instancia B.X");
        }
    }
}
//Caso 2
class C {
    static{
        System.out.println("Bloque statico de la clase C");
    }
    {
        System.out.println("Bloque de instancia C");
    }
    class X extends  C {// C.X -extiende de > C
        static{
            System.out.println("Bloque statico de la clase C.X");
        }
        {
            System.out.println("Bloque de instancia C.X");
        }
    }
}
//Caso 3
class D extends A {
    static{
        System.out.println("Bloque statico de la clase D");
    }
    {
        System.out.println("Bloque de instancia D");
    }
    class X extends D { //D.X -> D
        static{
            System.out.println("Bloque statico de la clase D.X");
        }
        {
            System.out.println("Bloque de instancia D.X");
        }
    }
}
//Caso 4
class E {
    static{
        System.out.println("Bloque statico de la clase E");
    }
    {
        System.out.println("Bloque de instancia E");
    }
    class X {//E.X
        static{
            System.out.println("Bloqye statico de la clase E.X");
        }
        {
            System.out.println("Bloque de instancia E.X");
        }

    }
}
public class Herencia01 {
}
