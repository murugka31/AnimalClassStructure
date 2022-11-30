package simbirsoft.emurugova;

public class visitToVeterinarian {

static Veterinarian veterinarian = new Veterinarian();
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", "Иван", "Болен");
        Cat cat = new Cat("Барсик", "Анна", "Не болен");
        dog.sayWoof();
        dog.sayOwner();
        cat.sayMeow();
        cat.sayOwner();
        System.out.println("Мы жили в городе "+ Animal.getCity() + ".");
        Animal.setCity("Санкт Петербург");
        System.out.println("Теперь мы живем в городе " + Animal.getCity() + ".");
        System.out.println();
        System.out.println("Сегодня " + dog.getNickname() + " и " + cat.getNickname() + " ходили к ветеринару. " + "Ветеринар сказал: ");
        veterinarian.sayHello(dog);
        veterinarian.checkState(dog);
        System.out.println();
        veterinarian.sayHello(cat);
        veterinarian.checkState(cat);
    }
}
