
package aularepita;
import javax.swing.JOptionPane;
public class Aularepita {
    public static void main(String[] args) {
        // TODO code application logic here
        int n,soma=0,tot=0,totpar=0,totimp=0,maisdecem=0,media=0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Numeros: (Valor 0 interrompe o processo)"));
        soma += n;
        tot++;
        if(n%2==0){
            totpar++;
        }else{
            totimp++;
        }
        if(n>100){
            maisdecem++;
        }
        media = soma / tot;
        }while(n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado:<br><hr>" + "Total de valores: "+tot
        + "<br>Total de pares: "+totpar+"<br>Total de ímpares: "+totimp+"<br>Acima de 100: "+maisdecem+
        "<br>Soma dos valores: " + soma + "<br>Média dos valores: "+media);
    }
    
}
