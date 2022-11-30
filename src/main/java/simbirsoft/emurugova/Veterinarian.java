package simbirsoft.emurugova;

public class Veterinarian {

    public void sayHello(Animal animal){
        System.out.println("Привет " + animal.getNickname() + ".");
    }

    public void checkState(Animal animal) {
      if(animal.getState().equals("Болен")) {
          System.out.println("Ты болен. Мы тебя полечим.");
      } else if (animal.getState().equals("Не болен")) {
          System.out.println("Ты не болен. Можешь идти домой.");
      } else {
          System.out.println("Я пока не знаю, что с тобой. Надо сдать анализы.");
      }
   }
}
