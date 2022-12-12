public class StartPhones {
    public static void main(String[] args) {
        Phones Phone1 = new Phones("+7653243063", "Samsung", 430);
        Phones Phone2 = new Phones("+79269463520", "Honor", 350);
        Phones Phone3 = new Phones("+79562254512", "Huawei", 390);
        System.out.printf("%s\n%s\n%s\n", Phone1, Phone2, Phone3);
        Phone1.receiveCall("Jurgen");
        System.out.println(Phone2.getNumber());
        Phone3.receiveCall("Jurgen", "+7653243063");
        Phone1.sendMessage("+79269463520", "+79562254512");
    }
}

