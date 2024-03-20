public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,4,3);

        System.out.println("Antes del redimensionar:\n" + rectangle1);

        int resize=3;

        rectangle1.resizeX(resize);

        System.out.println("\n-- Redimensionando por factor de "+resize+" --");

        System.out.println("\nDespues del redimensionar:\n" + rectangle1);
    }
}
