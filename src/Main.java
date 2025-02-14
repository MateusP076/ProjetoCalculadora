import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Numeros nm=new Numeros();
        Scanner contador=new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        nm.setNum1(contador.nextInt());
        System.out.println("Digite sua segunda nota: ");
        nm.setNum2(contador.nextInt());
        nm.Calcmedia(); 
        nm.Exibemedia();
    }
}