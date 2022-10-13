package java_3_internas.t1_fundamentos;

public class Parcel07Bis {
    public Parcel07Bis(){}
    public Contents contents(){return new MyContents(this);}
    public static void main(String[] args){
    Parcel07Bis p = new Parcel07Bis();
    Contents c = p.contents();
    }
    class MyContents implements Contents{
        private final int i = 11;
        MyContents(Parcel07Bis this$0){

        }
        public int value(){return 11;}
    }
}
