package oop;
public class calendenr {
    public static void main(String[] args) {
         Calender tvm = new Calender(8,4,2023);
        System.out.println(tvm.get_day()+"/"+tvm.get_month()+"/"+tvm.get_year());
        tvm.forward_bydate();
        System.out.println(tvm.get_day()+"/"+tvm.get_month()+"/"+tvm.get_year());
        
        Calender tvm2 = new Calender();
        System.out.println(tvm2.get_day()+"/"+tvm2.get_month()+"/"+tvm2.get_year());
        for (int i = 1; i <= 35; i++) {
            tvm2.forward_bydate();
        }
        System.out.println(tvm2.get_day()+"/"+tvm2.get_month()+"/"+tvm2.get_year());
        tvm2.set_day(15);
        tvm2.set_year(2022);
        System.out.println(tvm2.get_day()+"/"+tvm2.get_month()+"/"+tvm2.get_year());
        
    }
    
}
