package ClasesYObjetos;

public class Coche {
    //Atributos
    String color;
    String marca;
    int km;
    
    //Metodo
    public static void main(String [] args){
        Coche coche1 = new Coche();
        
        coche1.color = "Negro";
        coche1.marca = "Audi";
        coche1.km = 10;
        
        System.out.println("COCHE1");
        System.out.println("El color del coche1 es: "+coche1.color);
        System.out.println("La marca del coche1 es: "+coche1.marca);
        System.out.println("El kilometraje del coche1 es: "+coche1.km+"km");
        
        
        Coche coche2 = new Coche();
        
        coche2.color = "Blanco";
        coche2.marca = "Ferrari";
        coche2.km = 5;
        
        System.out.println("\nCOCHE2");
        System.out.println("El color del coche2 es: "+coche2.color);
        System.out.println("La marca del coche2 es: "+coche2.marca);
        System.out.println("El kilometraje del coche2 es: "+coche2.km+"km");
        
    }
}
