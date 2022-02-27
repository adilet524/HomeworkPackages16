package com.company;

/*      Circle деген класс тузунуз, анын PI деген свойствасы, area
        жана circumference деген статик методдору болсун.
        areaны табуу учун: PI * (radius * radius)
        circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат*/

public class Main {

    public static void main(String[] args) {
        System.out.println(Circle.area());
        System.out.println(Circle.circumference());
    }
}
