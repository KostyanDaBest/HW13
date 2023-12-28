public class SoZvezdoi {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("catch");
            System.exit(0);
        } finally {
            System.out.println("finally");
            System.exit(0);
        }
    }
}
