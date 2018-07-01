package com.munna.defaultmethods.interfaces;

import java.time.LocalDateTime;

public interface TimeClient {
    void setTime(int hour,int minute,int second);
    void setDate(int day,int month,int year);
    void setDateAndTime(int hour,int minute,int second,int day,int month,int year);
    LocalDateTime getLocalDateTime();
    default void getZonedTimeAndDate(){

    }
}
