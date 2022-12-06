package com.emurugova;

public class Cat extends Animal{

    public Cat(String nickname, String owner, String state ) {
        super(nickname, owner, state);
    }
    public void sayMeow () {
        System.out.println("Меня зовут "+ getNickname() + ". Мяу!" );
    }
}
