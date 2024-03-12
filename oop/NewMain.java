package oop;
public class NewMain {
    public static void main(String[] args) {
        digitalsaat ds = new digitalsaat(14,59,59);
        System.out.println(ds.hour+":"+ds.minutes+":"+ds.seconds);
        ds.ilerlet();
        System.out.println(ds.hour+":"+ds.minutes+":"+ds.seconds);
        
        for (int i = 0; i < 10; i++) {
            ds.ilerlet();
        }
        System.out.println(ds.hour+":"+ds.minutes+":"+ds.seconds);
    }
}
 
