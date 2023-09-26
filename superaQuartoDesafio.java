
import java.util.Scanner;

public class superaQuartoDesafio {
    
    public static String[] ajustaTexto(String[] txt){
         int tamanho=txt.length;
        
        String[] lista = new String[tamanho];
        String texto1;
        String texto2;
        String texto;
       
       
        for (int x=0;x<tamanho;x++){
             int meio = (int) (txt[x].length()/2);
             texto1="";
             texto2="";
             texto ="";
            for (int i=0;i<meio;i++){
                texto1=texto1+txt[x].substring((meio-i-1), (meio-i));
                texto2=txt[x].substring((meio+i), (meio+i+1))+texto2;
            }
            texto=texto1+texto2;
            lista[x]=texto;
        }
        return lista;
    }

    public static String leitura(){
        Scanner input= new Scanner(System.in);
        String txt = input.nextLine();
        return txt;
    }

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        Integer n = input.nextInt();
        String[] frase= new String[n];
        String entrada = "";
        for (int i=0;i<n;i++){
            entrada =leitura(); 
            frase[i]= entrada;
        }
        frase = ajustaTexto(frase);
        for (int i=0;i<n;i++){
            System.out.println(frase[i]);
        }
    }
}
