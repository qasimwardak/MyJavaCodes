package com.syntax.ReviewClass13;


public abstract class SoundAnimal {
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Sleeping zzzZZzzz");
    }
}
class Horse extends SoundAnimal{

    @Override
    public void animalSound() {
        System.out.println("neigh neigh  iiiihhhh igo go");
    }
}
