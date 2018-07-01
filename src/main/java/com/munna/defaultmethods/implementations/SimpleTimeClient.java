package com.munna.defaultmethods.implementations;

import com.munna.defaultmethods.interfaces.TimeClient;

import java.time.LocalDateTime;

public class SimpleTimeClient implements TimeClient {

    LocalDateTime localDateTime;

   public SimpleTimeClient()
    {
        //Getting Current time
        localDateTime = LocalDateTime.now();
    }

    @Override
    public void setTime(int hour, int minute, int second) {

    }

    @Override
    public void setDate(int day, int month, int year) {

    }

    @Override
    public void setDateAndTime(int hour, int minute, int second, int day, int month, int year) {

    }

    @Override
    public LocalDateTime getLocalDateTime() {
        return null;
    }

    public static void main(String[] args) {
       SimpleTimeClient simpleTimeClient = new SimpleTimeClient();
        System.out.println(simpleTimeClient.localDateTime.toString());
    }
}
