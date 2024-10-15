package com.nwcc.money;

public class Tax {

    float rate = 1.0f;
    String state;
    static String country = "USA";

    public double calculateTax(double amount) {

        double taxValue = (amount * rate) / 100;
        return taxValue;

    }

    // create our constructor method
    public Tax(String inState, float inRate) {
        // this.state = state;
        state = inState;
        rate = inRate;
    }

    public Tax(String inState) {
        state = inState;
    }

    public Tax() {

    }

    // setter and getter methods
    public String getState() {
        return state;
    }

    public float getRate() {
        return rate;
    }

    public void setState(String st) {
        if (state == null) {
            state = st;
        }
    }

    public void setRate(float r) {
        if (r < 1.0f || r > 50.0f) {
        } else {
            rate = r;
        }
    }

    public static String getCountry() {
        return country;
    }
}
