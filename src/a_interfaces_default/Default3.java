package a_interfaces_default;
interface Face1{
    default void m(){
        System.out.println("Face1.m()");
    }
}
interface Face2{
    default void m(){
        System.out.println("Face2.m()");
    }
}
public class Default3 implements Face1, Face2{
    public static void main(String[] args) {
     new Default3().m();
    }
//COLISION :O

    @Override
    public void m() {
        //System.out.println("Ya ni modos");
        Face1.super.m();
    }
}
