public class TestBall {
    public static void main(String[] args) {
        Ball B1 = new Ball(0,0);
        System.out.println(B1.toString());
        B1.move(5, 13);
        System.out.println(B1.toString());
    }
}
