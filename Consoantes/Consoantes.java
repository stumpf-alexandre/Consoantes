import java.util.Scanner;

/**
 * Created by als on 07/08/2017.
 */
public class Consoantes {
    Scanner tc=new Scanner(System.in);
    public String palavra;
    public int contar(){
        System.out.println("Digite uma palavra: ");
        palavra=tc.next();
        int qtdConsoantes = 0;
        int qtdVogais = 0;
        for (int i=1; i<palavra.length(); i++) {
            if (palavra==null||palavra.length()==0) {
                return -1;
            }
            else if (palavra.charAt(i)=='a'||palavra.charAt(i)=='A'||palavra.charAt(i)=='e'||palavra.charAt(i)=='E'||palavra.charAt(i)=='i'||palavra.charAt(i)=='I'||palavra.charAt(i)=='o'||palavra.charAt(i)=='O'||palavra.charAt(i)=='u'||palavra.charAt(i)=='U'){
                qtdVogais +=1;
            }
            qtdConsoantes=i-qtdVogais;
        }
        return qtdConsoantes;
    }

    public static void main(String[] args) {
        Consoantes c = new Consoantes();
        int qtd = c.contar();
        System.out.println(qtd);
    }
}
