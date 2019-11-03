package com.kurs3;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Investors {

    public ArrayList<Investor> list2;

    public Investors() {
        this.list2 = new ArrayList<>();
    }

    public Investors(int length) {
        this.list2 = new ArrayList<>(length);
    }

    public void addToList(Investor investor)
    {
        list2.add(investor);
    }
    public Investors getWithGraterDeposit(double deposit) {
        Investors sublist = new Investors();
        for (Investor investor : this.list2) {
            if (investor.deposit > deposit)
                sublist.addToList(investor);
        }
        return sublist;
    }

    public Investors getWithGraterTempDeposit(double temp) {
        Investors sublist = new Investors();
        for (Investor investor : this.list2) {
            if (investor.contractTerm > temp)
                sublist.addToList(investor);
        }
        return sublist;
    }

    public Investors getWithFIO(String FIO) {
        Investors sublist = new Investors();
        for (Investor investor : this.list2) {
            if (investor.FIO.equals(FIO))
                sublist.addToList(investor);
        }
        return sublist;
    }
    public ArrayList<Investor> deleteWithFIO(String FIO) {
        this.list2.remove(FIO);
        return this.list2;
    }

    @Override
    public String toString() {
        return "Investors{" +
                "list2=" + list2 +
                '}';
    }
}
