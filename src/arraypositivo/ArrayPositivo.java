package arraypositivo;
    import java.util.Scanner;
public class ArrayPositivo {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a=0;
        
        System.out.println(" cuantos");
        a=in.nextInt();
        int arreglo[] = new int [a];
        for(int i=0; i<a; i++){
            System.out.print("x ["+i+"] = ");
            arreglo[i]=in.nextInt();
        }
        for(int i=0; i<a; i++){
            if (arreglo[i]>0){
                System.out.println(" El arreglo ["+i+"] es positivo");
            }
            else{
                System.out.println(" arreglo ["+i+"] es negativo");
            }
        }
    }
    
}
