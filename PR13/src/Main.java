public class Main {
    private static void change(String string) {
        System.out.println(string.charAt(string.length() - 1));
        System.out.println(string.endsWith("!!!"));
        System.out.println(string.startsWith("I like"));
        System.out.println(string.contains("Java"));
        System.out.println(string.indexOf("Java"));
        System.out.println(string.replace('a', 'o'));
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.substring(7, 11));
    }

    public static void main(String[] args) {
        String str = "I like Java!!!";
        change(str);
    }
}
