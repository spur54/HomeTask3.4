package org.sourceit;


public class Voditel {
    int race;
    Avtomobil avtomobil;
    boolean status = true;

    public void setStatus(boolean status) {
        this.status = status;
    }

    boolean rabota(int race, Avtomobil avtomobil) {
        if (status == false) {
            System.out.println("Ya otsranen");
        return false;
        } else {
            for (; race != 0; --race) {
                avtomobil.durability = avtomobil.durability - (int) (Math.random() * 100 + 1);
                if (avtomobil.durability <= 0) {
                    System.out.println("Something went wrong");
                    return false;
                }

            }
            System.out.println("All fine");
            return true;
        }

    }
}