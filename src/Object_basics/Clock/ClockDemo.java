package Object_basics.Clock;

public class ClockDemo {
    public static void main(String[] args) {
        TimeValidate hour = new TimeValidate(); /**конструктор с тремя значениями*/
        hour.setHour(78888);
        hour.setMinute(30);
        hour.setSecond(45);

        Clock obj1 = new Clock(hour);
        obj1.printTime();

        TimeValidate hour2 = new TimeValidate();
        hour2.setSecondsSinceMidnight(3661);
        /**
         TimeValidate midnight = new TimeValidate(); /**конструктор с секундами*/

        Clock obj2 = new Clock(hour2);
        obj2.printTime();
        obj2.tickDown();

        for (int i = 0; i < 10; i++) {
            obj2.tick();
        }

        Clock obj3 = obj2.addClock(obj1);
        obj3.tick();

        Clock hour1 = new Clock(); /** дефолтный конструктор*/
        hour1.printTime();

        Clock sub = new Clock();
        sub.subClock(obj2);



//        TimeValidate midnight = new TimeValidate(); /**конструктор с секундами*/
//        midnight.setSecondsSinceMidnight(6200);
//        Clock obj2 = new Clock(midnight);
//        obj2.setClock();
//        obj2.tick();
//        obj2.tickDown();
    }
}
