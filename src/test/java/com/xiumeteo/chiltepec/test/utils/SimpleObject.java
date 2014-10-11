package com.xiumeteo.chiltepec.test.utils;

/**
 * This class is intended to assist in the test of fill primitives;
 * Created by xiumeteo on 10/10/14.
 */
public class SimpleObject {

    private int anInteger;

    private long aLong;

    private double aDouble;

    private float aFloat;

    private short aShort;

    private byte aByte;

    private boolean aBoolean;

    private char aChar;

    private String string;

    public int getAnInteger() {
        return anInteger;
    }

    public void setAnInteger(int anInteger) {
        this.anInteger = anInteger;
    }

    public long getaLong() {
        return aLong;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public short getaShort() {
        return aShort;
    }

    public void setaShort(short aShort) {
        this.aShort = aShort;
    }

    public byte getaByte() {
        return aByte;
    }

    public void setaByte(byte aByte) {
        this.aByte = aByte;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleObject)) return false;

        SimpleObject object = (SimpleObject) o;

        if (aBoolean != object.aBoolean) return false;
        if (aByte != object.aByte) return false;
        if (aChar != object.aChar) return false;
        if (Double.compare(object.aDouble, aDouble) != 0) return false;
        if (Float.compare(object.aFloat, aFloat) != 0) return false;
        if (aLong != object.aLong) return false;
        if (aShort != object.aShort) return false;
        if (anInteger != object.anInteger) return false;
        if (!string.equals(object.string)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = anInteger;
        result = 31 * result + (int) (aLong ^ (aLong >>> 32));
        temp = Double.doubleToLongBits(aDouble);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (aFloat != +0.0f ? Float.floatToIntBits(aFloat) : 0);
        result = 31 * result + (int) aShort;
        result = 31 * result + (int) aByte;
        result = 31 * result + (aBoolean ? 1 : 0);
        result = 31 * result + (int) aChar;
        result = 31 * result + string.hashCode();
        return result;
    }
}
