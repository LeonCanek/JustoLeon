package t2_herencia;
class SuperExterna {
    class Interna {
        void m(){
            System.out.println("Super");
        }
    }
}
class SubExterna extends  SuperExterna{
    class Interna{
        void m(){
            System.out.println("Sub");
        }
        void a(){
            System.out.println("Augusto");
        }
    }
}
public class Herencia02 {
    public static void main(String[] args){
        SuperExterna.Interna sei = new SuperExterna().new Interna();
        sei.m();

        SubExterna.Interna sei2 = new SubExterna().new Interna();
        sei2.m();
        sei2.a();/*
        SuperExterna.Interna sei3 = new SubExterna().new Interna();
        sei3.m();*/
    }
}
