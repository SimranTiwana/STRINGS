public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}
