


public class DebugExample2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        if (x < y) { // Error: la condición debería ser x > y
            System.out.println("x es mayor que y");
        } else {
            System.out.println("x es menor o igual que y");
        }
    }
}