import java.util.Scanner;

public class A2E2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //definir variables
        int N;
        //pedir datos
        System.out.print("Introduce un Numero: ");
        N = sc.nextInt();
        
        //hacer una funcion que haga N veces la operacion 
        for (int i = 0; i < N; i++) {

            System.out.print("\n" + (N - i));
        }
        System.out.println("");
    }
}
