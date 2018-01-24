/*
* Given two integers, an hour and a minute, write a function to calculate the angle between the two hands
* on a clock representing that time
* */

public class Main {
    public static void main(String[] args) {

    }

    public static double getAngle(int hour, int min) {
        final double MINUTE_PER_HOUR = 60;
        final double HOUR_HANDS = 12;
        final double DEGREES_PER_MINUTE = 360 / MINUTE_PER_HOUR; // 6 degrees
        final double DEGREES_PER_HOUR = 360  / HOUR_HANDS; // 30 degrees

        double minuteAngle = min * DEGREES_PER_MINUTE;
        double hourAngle = hour * DEGREES_PER_HOUR + (min / MINUTE_PER_HOUR) * DEGREES_PER_HOUR;
        // always get positive
        double diff = Math.abs(minuteAngle - hourAngle);
        // always get smaller angle
        if(diff > 180)
            return 360 - diff;
        else
            return diff;
    }
}
