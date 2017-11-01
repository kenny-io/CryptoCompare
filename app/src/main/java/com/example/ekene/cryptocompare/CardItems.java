package com.example.ekene.cryptocompare;

/**
 * Created by EKENE on 10/22/2017.
 */

public class CardItems {

    private String currency;
    private double btc_value, eth_value;

    public CardItems(String currency, double btc_value, double eth_value) {
        this.currency = currency;
        this.btc_value = btc_value;
        this.eth_value = eth_value;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBtc_value() {
        return btc_value;
    }

    public double getEth_value() {
        return eth_value;
    }

}
