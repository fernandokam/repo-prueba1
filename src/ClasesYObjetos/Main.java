package ClasesYObjetos;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
        
        Operacion op = new Operacion();
        
        System.out.println("La suma da: "+op.sumar(n1,n2));
        System.out.println("La suma da: "+op.restar(n1, n2));
        System.out.println("La suma da: "+op.multiplicar(n1, n2));
        System.out.println("La suma da: "+op.dividir(n1, n2));
    }
}
