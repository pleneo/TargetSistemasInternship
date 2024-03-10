public class Main {
    /*
    Para a primeira questão, é possível tentar analisar seus valores a cada iteração
    manualmente e encontra-lo.
    Por essa ser uma solução demorada e passível de erros de contagem pelo fator humano,
    é interessante a resolução via código:
     */

    public static void main(String[] args) {

        int indice = 13;
        int soma = 0;
        int k =0;


        while (k<indice){
            k=k+1;
            soma=soma+k;
        }

        System.out.println(soma); // o valor da soma é igual a 91


    }


}
