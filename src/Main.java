public class Main {
    public static void main(String[] args) {
        try {
            boolean isPriemnik = test.priemnik("testLogin", "testPassword1", "testPassword1");
            System.out.println("Проверка прошла успешно: " + isPriemnik);
        } catch (WrongLogin | WrongPassword e) {
            e.printStackTrace();
        }
    }
}
