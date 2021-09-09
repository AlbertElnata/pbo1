import java.util.Scanner;
public class berat {
    public static void main(String args[])
    {
        Scanner masuk = new Scanner(System.in);
        float berat, tinggi, bmi, meter;
     
        System.out.println("PROGRAM JAVA MENGHITUNG BERAT BADAN IDEAL");
        System.out.print ("Masukan Berat: ");
        berat = masuk.nextFloat();
        System.out.print ("Masukan Tinggi: ");
        tinggi = masuk.nextFloat();
        meter=tinggi/100;
   
        bmi=(berat/(meter*meter));
  
        System.out.println("---------------------------------");
        System.out.print("BMI : "+bmi+" ");
        
        if (bmi<18.5){
            System.out.println("(underweight)");
        }else if (bmi<=24.9){
            System.out.println("(normal weight)");
        }else if (bmi<29.9){
            System.out.println("(overweight)");
        }else if (bmi<34.9){
            System.out.println("(obesity class 1)");
        }else if (bmi<39.9){
            System.out.println("(obesity class 2)");
        }else if (bmi>40){
            System.out.println("(obesity class 3)"); 
        }else {
            System.out.println("(Obesitas)"); 
        }
   }
}