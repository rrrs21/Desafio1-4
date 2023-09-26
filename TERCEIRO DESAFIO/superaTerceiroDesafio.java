import java.util.Scanner;

public class superaTerceiroDesafio {

    public static String [] separaTexto(String texto){
        String[] tx = texto.split(" ");
        return tx;
    }
    
    public static  int[] separaInteiros(String[] texto, Integer quantidade){
        int[] lista = new int[quantidade+1];
        for (int i=0;i<=quantidade;i++){
            lista[i] = Integer.parseInt(texto[i]);
        }
        return lista;
    }
    private static int calculaAlvo(int[] arr, int quantidade, int alvo) {
        int count=0;
        for (int i=0;i<=quantidade;i++){
            for (int j=0;j<=quantidade;j++){
                if (j!=i) {
                    if (arr[i]-arr[j]==alvo){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        String texto = input.nextLine();      
        int index =  texto.indexOf(" ");
        Integer n = Integer.parseInt(texto.substring(0, index));
        int k = Integer.parseInt(texto.substring(texto.indexOf(" ")+1));
        String arrTexto = input.nextLine();
        int[] arr = new int[n];
        arr = separaInteiros(separaTexto(arrTexto),n-1);
        int criterio = calculaAlvo(arr, n-1, k);
        System.out.println(criterio);
    }

    
}
