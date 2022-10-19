package t2_herencia;
class AA {
    public void m() {
        System.out.println("AA.m()");
    }
}
class BB{
        public void p(){
            System.out.println("BB.p()");
        }
        class CC extends AA {
            public void p(){ BB.this.p();}
            public void n(){BB.this.p();}
        }
}


public class Herencia04 {
    public static void main(String[] args){
        BB.CC cc = new BB().new CC();
        cc.m();
        cc.p();
        cc.n();
    }
}
