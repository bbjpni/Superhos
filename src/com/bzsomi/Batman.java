package com.bzsomi;

public class Batman implements Milliardos, Szuperhos {
    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public boolean legyoziE(Szuperhos hos) {
        return hos.mekkoraAzEreje()<this.lelemenyesseg;
    }

    @Override
    public double mekkoraAzEreje() {
        return 2*this.lelemenyesseg;
    }
}
