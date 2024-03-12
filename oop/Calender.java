package oop;
public class Calender {
    private int day, month, year;
    
    void set_day(int day) {
        this.day = day;
    }
    
    int get_day() {
        return this.day;
    }
    
    void set_month(int month) {
        this.month = month;
    }
    
    int get_month() {
        return this.month;
    }
    
    void set_year(int year) {
        this.year = year;
    } 
    
    int get_year() {
        return this.year;
    }
    
    Calender() {
        day = 1; month = 1; year = 2000;
    }
    
    Calender(int day, int month, int year) {
        //day = d; month = m; year = y;
        this.day = day; this.month = month; this.year = year;
    }
    
    void forward_bydate(){
        day++;
        if(day == 31) {
            month++;
            day = 1;
            if(month == 13) {
                year++;
                month = 1;
            }
        }
    }
    
}
