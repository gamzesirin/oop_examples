package oop;
public class digitalsaat {
    int hour, minutes, seconds;
    digitalsaat(){ // saati baştan başlatmak için tanımladık
        hour = 0; minutes = 0; seconds = 0;
    }
    digitalsaat(int h, int m, int s) { // saate kendimizi ayarlamak için tanımladık
        hour = h; minutes = m; seconds = s;
    }
    void ilerlet() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hour++;
                if (hour == 24) {
                    hour=0;
                }
            }
        }
    }
}
