package simbirsoft.emurugova;

public class Animal {

    private static String city = "Москва";
    private final String nickname;
    private final String owner;
    private final String state;

    public Animal(String nickname, String owner, String state) {
        this.nickname = nickname;
        this.owner = owner;
        this.state = state;
    }

    public void sayOwner() {
        System.out.println("Мой хозяин " + getOwner() + ".");
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Animal.city = city;
    }

    public String getNickname() {
        return nickname;
    }

    public String getOwner() {
        return owner;
    }

    public String getState() {
        return state;
    }
}
