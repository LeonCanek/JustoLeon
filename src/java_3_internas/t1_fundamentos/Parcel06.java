package java_3_internas.t1_fundamentos;

import java.sql.SQLOutput;

public class Parcel06 {
    private void internalTracking(boolean b){
        if (b) {
            class TrackingSlip {
                private final String id;
                TrackingSlip(String s){ id= s;}
                String getSlip(){ return id;}
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
            System.out.println(ts);
        }
        //Can´t use it here! Out of scope:
        // ! TrackingSlip ts = new TrackingSlip("x");
    }
    public void track(){internalTracking(true);}
    public static void main(String[] args){
        Parcel06 p = new Parcel06();
        p.track();;
    }
}
