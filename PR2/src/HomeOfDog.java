public class HomeOfDog {
    public static void main(String[] args) {
        Dog Hunter = new Dog("Hunter", 4);
        System.out.println(Hunter.toString());
        System.out.println("Converted to Human age: " + Hunter.getHumanAge());
    }
}
