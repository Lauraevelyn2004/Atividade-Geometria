package geometria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENU GEOMETRIA ===");
        System.out.println("1 - Retângulo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Círculo");
        System.out.println("4 - Triângulo");
        System.out.print("Escolha a forma: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite a altura do retângulo: ");
                int height = scanner.nextInt();
                System.out.print("Digite a base do retângulo: ");
                int width = scanner.nextInt();

                Rectangle rect = new Rectangle(width, height);
                System.out.println("\nÁrea do retângulo: " + rect.calculateArea());
                System.out.println("Desenho do retângulo:");
                rect.printRectangle();
                break;

            case 2:
                System.out.print("Digite o lado do quadrado: ");
                int side = scanner.nextInt();

                Square square = new Square(side);
                System.out.println("\nÁrea do quadrado: " + square.calcArea());
                System.out.println("Desenho do quadrado:");
                square.printSquare();
                break;

            case 3:
                System.out.print("Digite o raio do círculo: ");
                int radius = scanner.nextInt();

                Circle circle = new Circle(radius);
                System.out.printf("\nÁrea do círculo: %.2f\n", circle.calculateArea());
                System.out.println("Desenho do círculo:");
                circle.printCircle();
                break;

            case 4:
                System.out.print("Digite a altura do triângulo: ");
                int triHeight = scanner.nextInt();
                System.out.print("Digite a base do triângulo: ");
                int triBase = scanner.nextInt();

                Triangle triangle = new Triangle(triBase, triHeight);
                System.out.printf("\nÁrea do triângulo: %.2f\n", triangle.calculateArea());
                System.out.println("Desenho do triângulo:");
                triangle.printTriangle();
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}

