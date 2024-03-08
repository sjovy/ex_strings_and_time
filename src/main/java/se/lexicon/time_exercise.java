package se.lexicon;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class time_exercise {

    public static void main( String[] args ) {
        LocalDate date;
        date = LocalDate.now();
        System.out.println(date+ "\n");

        String today = date.format(DateTimeFormatter.ofPattern("eeee dd MMM"));
        System.out.println(today+ "\n");

        LocalDate startDate = LocalDate.of(2024, 2, 26);
        LocalDate nextDate;
        DayOfWeek weekDay;
        for (int i = 0; i < 7; i++){
            nextDate = startDate.plus(Period.ofDays(i));
            weekDay = nextDate.getDayOfWeek();
            System.out.println(weekDay);
        }
        System.out.println("\n");

        date = LocalDate.parse("2020-09-11");
        System.out.println(date+ "\n");

        LocalDate birthDate;
        birthDate = LocalDate.parse("1963-04-28");
        weekDay = birthDate.getDayOfWeek();
        System.out.println(weekDay+ "\n");

        startDate = LocalDate.now();
        LocalDate futureDate;
        Month month;
        futureDate = startDate.plus(Period.ofYears(10));
        futureDate = futureDate.minus(Period.ofMonths(10));
        month = futureDate.getMonth();
        System.out.println(month+ "\n");

        Period period = Period.between(birthDate, futureDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println(years + " years , " + months + " months , " + days + " days" + "\n");

        period = Period.of(4, 7, 29);
        startDate = LocalDate.now();
        futureDate = startDate.plus(period.ofYears(period.getYears()));
        futureDate = futureDate.plus(period.ofMonths(period.getMonths()));
        futureDate = futureDate.plus(period.ofDays(period.getDays()));
        System.out.println(futureDate + "\n");

        LocalTime time;
        time = LocalTime.now();
        System.out.println(time+ "\n");

        int nanoSec;
        nanoSec = time.getNano();
        System.out.println(nanoSec+ "\n");

        time = LocalTime.parse("13:35:26");
        System.out.println(time+ "\n");

        time = LocalTime.now();
        String isoTime;
        isoTime = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(isoTime+ "\n");

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime+ "\n");
        String isoDate;
        isoDate = dateTime.format(DateTimeFormatter.ISO_DATE);
        isoTime = dateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("date: " + isoDate + ", time: " + isoTime+ "\n");

        String isoDateTime;
        isoDateTime = dateTime.format(DateTimeFormatter.ofPattern("eeee dd MMM HH:mm"));
        System.out.println(isoDateTime+ "\n");

        date = LocalDate.now();
        time = LocalTime.now();
        dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime+ "\n");

        date = dateTime.toLocalDate();
        time = dateTime.toLocalTime();
        System.out.println(date);
        System.out.println(time+ "\n");




    }


}
