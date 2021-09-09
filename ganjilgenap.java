import java.math.BigDecimal;

public class ganjilgenap {
    public static void main(String[] args) {
       long[] bilangan={213,124,3,43,24,34,3,432,342,43,2,43,34343446,56,533,546,2343,3,4,5,2,3,3};
       System.out.print("Bilangan Genap :");
        for(int i=0; i<bilangan.length; i++){
            if(bilangan[i]% 2 ==0){
                System.out.print(bilangan[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan ganjil :");
        for(int i=0; i<bilangan.length; i++){
            if(bilangan[i] % 2!=0){
                System.out.print(bilangan[i] +" ");   
            }
        }
        System.out.println("");
    }
}