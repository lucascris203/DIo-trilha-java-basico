import javax.print.DocFlavor.STRING;

public class operadores {
    public static void main(String[] args){
        boolean condicao1=true;

        boolean condicao2= false;

        if (condicao1 && (1 > 0)) {

            System.out.println("As duas condiçoes são verdadeira");
            
        }
        if (condicao2 || condicao1) {
          System.out.println("Uma das condições são verdadeiras");    
        }

        System.out.println("fim");

    }
}
