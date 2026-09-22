package currency;
import.java.utill.*;
import java.text,DecimalFormat;
Class CurrencyConvertor
{
      double rupee,dollar,euro,yen;
      Scanner sc = new Scanner(System.in);
      DecimalFormat f = new DecimalFormat("##.###");
      public converIntToEuro()
      {
          System.out.println("Enter amount in rupee");
          rupee = sc.nextFloat();
          euro = rupee/80;
          system.out.println("Euro:"=f.format(euro));
      }
      public convertEuroToInr()
      {
          System.our.println("Enter amount in Euro");
          euro = sc.nextFloat();
          rupee = euro*80;
          System.out.print("Rupee:"+f.Format(rupee));
      }
      public convertInrToDollar()
      {
          System.out.println("Enter amount in rupee");
          rupee = sc.nextFloat();
          dollar = rupee /66;
          System.out.println("Rupee:"+f.format(rupee))
      }
      public converDollarTolnr()
      {
          System.out.println("Enter amount in Dollar");
          dollar = sc.nextFloat();
          rupee = dollar*66;
          System.out.println("Rupee:"+f.format(rupee))
      }
      public convertInrToYen()
      {
         System.out.printlm("Enter amount in rupee");
         rupee = sc.nextFloat();
         yen = rupee/0.61;
         system.out.println("Yen;"+f.format(yen));
      }
      public convertYenToInr()
      {
         System.out.println("Enter amount in Yen");
         euro = sc.nextFloat();
         rupee = yen*0.61;
         System.out.println("Rupee:"+f.formt(rupee));
      }
}

package distance;
import java.utill.*;
import java.text.DecimalFormat;
Class DistanceConvertor
{
   double meter,km,miles;
   Scanner sc = new Scanner(System.in);
   DecimalFormat f = new DecimalFormat("##.###");
   public convertMeterToKm()
      {
         System.out.println("Enter the meter");
         meter = sc.nextFloat();
         km - meter*0.001;
         System.out.println("Kilometer:"+f.format(km));
      }
      public convertKmToMeter()
      {
         System.out.println("Enter the Kilometer");
         km = sc.nextFloat();
         meter = km/0.001;
         System.out.println("Meter:"+f.format(meter));
      }
      public convertMilesToKm()
      {
         System.out.println("Enter the miles");
         miles = sc.nextFloat();
         km = miles*1.6093;
         System.out.println("Kilometer:"+f.format(km));
      }
      public convertKmToMiles()
      {
         System.out.println("Enter the Kilometer");
         km = sc.nextFloat();
         miles = km/1.6093;
         System.out.println("Miles:"+f.format(miles));
       }
} 
         
       
   
         