import java.util.Scanner;

public class Main {
    /* Para a resolução do exercício 2, podemos inicialmente escolher o número a ser encontrado na sequência e, a partir
    disso, ir encontrando novos números da sequência de fibonacci e comparando-os com o número escolhido.
     A sequência só irá parar de ser iterada caso o valor escolhido seja encontrado ou se o próximo valor da sequência seja
     maior que o escolhido e o número escolhido não esteja na sequência.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número que você deseja conferir se está na Sequência de Fibonacci: ");
        int x = sc.nextInt();
        int v1 = 0;
        int v2 = 1;
        int v = 0;
        System.out.print("SEQUÊNCIA DE FIBONACCI: "+ v1 + " " + v2);
        for(int i=0; ;i++){
            v = v2;
            v2 += v1;
            v1 = v;
            System.out.print(" "+ v2);

            if(x==v2){
                System.out.println("\nO valor " + x + " está dentro da sequência de fibonacci.");
                break;
            }
            if(v2>x){
                System.out.println("\nO valor " + x + " não está dentro da sequência de fibonacci.");
                break;
            }

        }
    }

}
