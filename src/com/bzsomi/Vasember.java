package com.bzsomi;

public class Vasember extends Bosszuallo implements Milliardos{
    public Vasember() {
        super(150,true);
    }

    @Override
    public boolean megmentiAVilagot() {
        return getSzuperero()>1000;
    }

    @Override
    public void kutyutKeszit() {
        setSzuperero(getSzuperero()+Math.random()*11);
    }

    @Override
    public String toString() {
        return "Vasember, "+super.toString();
    }
}
