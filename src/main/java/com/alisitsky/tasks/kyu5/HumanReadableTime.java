package com.alisitsky.tasks.kyu5;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {

        int hh = seconds / 3600;
        int mm = (seconds - hh*3600) / 60;
        int ss = (seconds - hh*3600 - mm*60) % 60;

        String HH = String.valueOf(hh).length() > 1 ? String.valueOf(hh) : "0"+ hh;
        String MM = String.valueOf(mm).length() > 1 ? String.valueOf(mm) : "0"+ mm;
        String SS = String.valueOf(ss).length() > 1 ? String.valueOf(ss) : "0"+ ss;

        return HH + ":" + MM + ":" + SS;
    }

    public static String makeReadable2(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }
}
