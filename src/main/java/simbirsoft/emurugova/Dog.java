package simbirsoft.emurugova;

public class Dog extends Animal{

    public Dog(String nickname, String owner, String state) {
        super(nickname, owner, state);
    }
    public void sayWoof () {
        System.out.println("Меня зовут " + getNickname() + ". Гав!" );
    }
}
