
class Phones {
    private String number;
    private String model;
    private double weight;
    public Phones() {
    }

    public Phones(String number, String model) {
        this();
        this.number = number;
        this.model = model;
    }

    public Phones(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.printf("Calling {%s}\n", name);
    }

    public void receiveCall(String name, String number) {
        System.out.printf("Calling {%s, %s}\n", name, number);
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}