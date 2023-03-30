package client;

import java.util.HashMap;

public class Client {
    

    public static HashMap<String, Double> cardBalance = new HashMap<>();



    public String[] surname = {"Factorov", "Dotin", "Larin", "Kvasov", "Bebyakin", "Fedin", "Ermakov",
            "Leontev", "Rabov", "Muserskiy"};

    public String[] billNumber = {"56712309", "62098548", "03651057", "16027658", "14939463", "53091558", "62538164",
            "74863289", "95283654", "82543567"};

    public String[] cardNumber = {"2595487910523445", "3295408767784452", "2202599492924057", "2202924783622658",
            "2307658934120862", "2202893368729558", "2202367176351164", "5600537286912406", "2202500733038654",
            "2202072036905567"};

    public String[] code = {"5634", "0961", "4853", "8842", "7321", "0463", "9558", "1164", "7223", "8654", "5567"};


    public void connectCard() {

        cardBalance.put(cardNumber[0], (double) 10000);
        cardBalance.put(cardNumber[1], (double) 0);
        cardBalance.put(cardNumber[2], (double) 0);
        cardBalance.put(cardNumber[3], (double) 0);
        cardBalance.put(cardNumber[4], (double) 0);
        cardBalance.put(cardNumber[5], (double) 0);
        cardBalance.put(cardNumber[6], (double) 0);
        cardBalance.put(cardNumber[7], (double) 0);
        cardBalance.put(cardNumber[8], (double) 0);
        cardBalance.put(cardNumber[9], (double) 0);

        System.out.println(cardBalance);

    }
}