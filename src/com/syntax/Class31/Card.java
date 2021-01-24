package com.syntax.Class31;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public abstract class Card {
    /*Create a Card class that will have implemented  and
    unimplemented methods and a constructor that will initializes
    credit card type.  Create 3 subclasses of a Card card.
    Create 3 objects of different card and store them into
    LinkedList. Using for loop/advanced for loop/ iterator
    access all methods of the class.*/
    String cardName;
    Card(String name){
        this.cardName=name;
    }
    void whatIsIt(){
        System.out.println("This is card");
    }
    abstract void whereToUse();
    abstract void availableColors();
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        cards.add(new MasterCard("MasterCard"));
        cards.add(new Visa("VISA"));
        cards.add(new Mir("Mir"));
        for (Card eachCard:cards){
            eachCard.whatIsIt();
            eachCard.whereToUse();
            eachCard.availableColors();
        }
    }
}
class MasterCard extends Card{
    MasterCard(String name) {
        super(name);
    }
    @Override
    void whereToUse() {
        System.out.println(cardName+" can be used worldwide but some parts of russia");
    }
    @Override
    void availableColors() {
        System.out.println("All colors available");
    }
}
class Visa extends Card{
    Visa(String name) {
        super(name);
    }
    @Override
    void whereToUse() {
        System.out.println(cardName+" can be used  worldwide");
    }
    @Override
    void availableColors() {
        System.out.println("Only cold and silver colors are available now");
    }
}
class Mir extends Card {
    Mir(String name) {
        super(name);
    }

    @Override
    void whereToUse() {
        System.out.println(cardName + " can be used only in Russia");
    }

    @Override
    void availableColors() {
        System.out.println("You are not able to choose your color");
    }

    /*Create a Set collection in which you need to add names of
    the countries. In this set we want all objects to be sorted
    in alphabetical order. Using 2 different ways retrieve all
    elements from set.*/
    public static void main(String[] args) {
        Set<String> sett = new TreeSet<>();
        sett.add("Russia");
        sett.add("USA");
        sett.add("Argentina");
        System.out.println(sett); //1st way to retrieve elements
        for (String country : sett) { //2nd way to retrieve elements
            System.out.println(country);
        }
    }
}