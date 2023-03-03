import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com valor da base em milimetros e número positivo:");
        Double base = scanner.nextDouble();
        while (base < 0) {
            System.out.println("Número negativo não aceito, tente novamente:");
            base = scanner.nextDouble();
        }

        System.out.println("Entre com valor da altura em milimetros e número positivo:");
        Double altura = scanner.nextDouble();
        while (altura < 0) {
            System.out.println("Número negativo não aceito, tente novamente:");
            altura = scanner.nextDouble();
        }

        Double areaRetangulo = Calcular.calculaArea(base, altura);

        System.out.println("A area total é: " + areaRetangulo);
    }

}
