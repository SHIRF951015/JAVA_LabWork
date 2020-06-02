package com.company;
import java.util.*;

public class Lab6_2_10 {
    static final int LENGHT = new Random().nextInt(100) + 109;
    static final int AUTOS_QUANTITY = 4;
    public static void main(String[] args) {
        System.out.println("Road lenght = " + LENGHT);
        ArrayList<Auto> autos = new ArrayList<Auto>();
        for (int i = 0; i < AUTOS_QUANTITY; i++) {
            autos.add(new Auto("Auto " + String.valueOf(i)));
        }
        autos.sort(new CompareAuto());
        int i = 0;
        for (Auto auto : autos) {
            auto.beMoreFirst = i;
            i++;
        }
        boolean endOfRace = false;
        while (!endOfRace) {
            endOfRace = true;
            for (Auto auto : autos) {
                if (auto.currentPosition + auto.speed <= LENGHT) {
                    auto.currentPosition = auto.currentPosition + auto.speed;
                    endOfRace = false;
                } else
                    auto.currentPosition = LENGHT;
            }
            autos.sort(new CompareAuto());
        }
        int count = 0;
        i = 0;
        for (Auto auto : autos) {
            if (i > auto.beMoreFirst) {
                count = count + (i - auto.beMoreFirst);
            }
            i++;
        }
        System.out.println("Result = " + count);
    }
}

class Auto {
    String name;
    int firstPosition;
    int speed;
    int currentPosition;
    int beMoreFirst;

    Auto(String name) {
        super();
        this.name = name;
        this.firstPosition = new Random().nextInt(11);
        this.speed = new Random().nextInt(7) + 1;
        this.currentPosition = this.firstPosition;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return name + " (sp. " + speed + ") pos. " + currentPosition;
    }
}

class CompareAuto implements Comparator<Auto> {

    @Override
    public int compare(Auto o1, Auto o2) {
        return Integer.compare(o1.currentPosition, o2.currentPosition);
    }
}
