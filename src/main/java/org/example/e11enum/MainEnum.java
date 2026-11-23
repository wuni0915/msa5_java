package org.example.e11enum;

public class MainEnum {
    public static void main(String[] args) {
    Weeks monday = Weeks.MONDAY;
        System.out.println(Weeks.MONDAY);
        System.out.println(Weeks.MONDAY.name());
        System.out.println(Weeks.MONDAY.getKrDay());
        System.out.println(Weeks.MONDAY.getDayNum());
    }
}
