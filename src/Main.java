

public class Main {
    public static void main(String[] args) {
        Primitive<Double> p = new Primitive<>();
        for(int i = 0; i < 100; i++) {
            p.add(Math.random() * 100);
        }
        p.sort();
        p.printArr();
        System.out.println("Maximum value is: " + p.max());
    }
}
