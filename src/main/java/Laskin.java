public class Laskin {
    public int sum(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Laskin laskin = new Laskin();
        System.out.println("2 + 3 = " + laskin.sum(2, 3));
        System.out.println("2 - 3 = " + laskin.sub(2, 3));
        System.out.println("2 * 3 = " + laskin.mul(2, 3));
        System.out.println("2 / 3 = " + laskin.div(2, 3));
    }

}
