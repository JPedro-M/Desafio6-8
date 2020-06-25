package desafio6.pkg8;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class Desafio68 {
    public static void main(String[] args) {
        DecimalFormat formato= new DecimalFormat("0.00");
        int cont; 
        double x, serie;
        String resultado;
       
        resultado = "Série\n";
        serie=0;
        x = Double.parseDouble(JOptionPane.showInputDialog("Valor de X:"));
       
        for (cont = 1; cont<=20; cont++) {
            serie += 1/Math.pow(x,cont);
            resultado += " "+(1/Math.pow(x,cont))+"\n"; 
        }
       
        JOptionPane.showMessageDialog(null, resultado);
        JOptionPane.showMessageDialog(null, "O resultado é: "+formato.format(serie));        
    }   
}
