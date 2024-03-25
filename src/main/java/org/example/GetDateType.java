package org.example;

    public class GetDateType {
        public static String getDateType(DaysOfWeek day) {
            switch (day) {
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY:
                    return "Weekday";
                default:
                    return "Weekend";
            }
        }
    }

