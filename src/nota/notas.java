
package nota;

import javax.swing.JOptionPane;

public class notas {
    public static void main (String [] args){
        int nota;
        
        nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nota"));
        
        switch (nota){
            case 0:
            case 1: 
            case 2:
            case 3: JOptionPane.showMessageDialog(null, +nota +" Es una nota insuficiente");
                    break;
            case 4:  
            case 5: JOptionPane.showMessageDialog(null, +nota+" Es Suficiente");
                    break;
            case 6:
            case 7: JOptionPane.showMessageDialog(null, +nota+" Esta Bien");
                    break;                
            case 8:
            case 9: JOptionPane.showMessageDialog(null, +nota+" Notable");
                    break;
            case 10: JOptionPane.showMessageDialog(null, +nota+" Sobresaliente");
                    break;
             default: JOptionPane.showMessageDialog(null, "La calificación no es valida."
                + "\nTiene que ser una calificación de 0 a 10.");    
        
        }
    }
}
