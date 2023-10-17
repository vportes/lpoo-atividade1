import java.util.Scanner;

public class lpoo {

    static double[] triangulox = new double[3];
    static double[] trianguloy = new double[3];
    static double areax = 0;
    static double areay = 0;

    static Scanner teclado = new Scanner(System.in);

    public static void calcularx(){
        double sp = 0;
        for (int i = 0; i < triangulox.length; i++){
            System.out.print("Digite o valor do lado "+(i+1)+": ");
            triangulox[i] = teclado.nextDouble();
            sp = sp + triangulox[i];
        }
        sp = sp/2;
        System.out.println(sp);
        areax = Math.sqrt(sp * (sp - triangulox[0]) * (sp - triangulox[1]) * (sp - triangulox[2]));
    }

    public static void calculary(){
        double sp = 0;
        for (int i = 0; i < trianguloy.length; i++){
            System.out.print("Digite o valor do lado "+(i+1)+": ");
            trianguloy[i] = teclado.nextDouble();
            sp = sp + trianguloy[i];
        }
        sp = sp/2;
        System.out.println(sp);
        areay = Math.sqrt(sp*(sp-trianguloy[0])*(sp-trianguloy[1])*(sp-trianguloy[2]));
    }

    public static void comparar(){
        if (areax < areay){
            System.out.println("O triangulo Y é maior que o triangulo X");
        } else if (areax > areay){
            System.out.println("O triangulo X é maior que o triangulo Y");
        } else {
            System.out.println("Os triangulos são iguais");
        }
    }

    public static void main(String[] args) {
        calcularx();
        calculary();
        comparar();
    }
}
