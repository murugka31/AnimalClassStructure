package simbirsoft.emurugova;

public class Cat extends Animal{

    public Cat(String nickname, String owner, String state ) {
        super(nickname, owner, state);
    }

    void sayMeow () {
        System.out.println("Меня зовут "+ getNickname() + ". Мяу!" );
    }
}
