//Author: Saeed Aghajani
package com.company;

public class Feeding<NAME, FAMILY, DATE, FOOD, PRICE, IDCART, WEEKDAY> {

    public NAME name;
    public FAMILY family;
    public DATE date;
    public FOOD food;
    public PRICE price;
    public IDCART idcart;
    public WEEKDAY weekday;

    public NAME getName() {
        return name;
    }

    public void setName(NAME name) {
        this.name = name;
    }

    public FAMILY getFamily() {
        return family;
    }

    public void setFamily(FAMILY family) {
        this.family = family;
    }

    public DATE getDate() {
        return date;
    }

    public void setDate(DATE date) {
        this.date = date;
    }

    public FOOD getFood() {
        return food;
    }

    public void setFood(FOOD food) {
        this.food = food;
    }

    public PRICE getPrice() {
        return price;
    }

    public void setPrice(PRICE price) {
        this.price = price;
    }

    public IDCART getIdcart() {
        return idcart;
    }

    public void setIdcart(IDCART idcart) {
        this.idcart = idcart;
    }

    public WEEKDAY getWeekday() {
        return weekday;
    }

    public void setWeekday(WEEKDAY weekday) {
        this.weekday = weekday;
    }

    public void changeFood(String oredered, String changed) {
        FOOD temp = (FOOD) oredered.replace(oredered, changed);
        this.food = temp;
        System.out.println("changed food is:" + temp);
    }

    public void changeCredit(String instance, String changed) {
        IDCART temp = (IDCART) instance.replace(instance, changed);
        this.idcart = temp;
        System.out.println("Changed credit is:" + temp);
    }
}
