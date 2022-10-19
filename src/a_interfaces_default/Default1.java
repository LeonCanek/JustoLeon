package a_interfaces_default;
interface I1 {
    default void m() { // metodo de extension
        System.out.println("Hola Jeanny");
    }
}
interface I2{
    default void p() {//metodo extension papu
        System.out.println("Hola Francisco");
    }
}

public class Default1 implements I1, I2{
    public static void main(String[] args){
        Default1 d = new Default1();
        d.m();
        d.p();

        I1 i = d;// a perro upcasteaste la i con el valor de  d default1 lo casteas a I1 para accesar a m y lo downcasteaste jijos
        i.m();
        ((Default1)i).p(); // Downcasting bro xX
        I2 j = d;
        j.p();
    }
    // Awebo ultima de cricr
}
