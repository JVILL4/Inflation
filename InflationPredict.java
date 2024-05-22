import java.util.Scanner;
    import java.text.NumberFormat;

    public class InflationPredict {

        public static void main(String[] args) {
     
           Scanner console = new Scanner(System.in);
   
           System.out.print("Enter price of the Item:");
           double cost = console.nextDouble();
    
           System.out.print("Enter number of years in which it will be purchased:");
           double years = console.nextDouble();
    
           System.out.print("Enter percent of inflation per year:");
           double inflationRate = console.nextDouble();       
     
           inflationRate = inflationRate / 100;
   
           for(int i = 1; i <= years; i++){
           cost += cost * inflationRate;
        }
   
      System.out.println(cost);
     }   
 }