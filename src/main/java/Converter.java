import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Converter
{
    // converts to mph
   public double mph2kph(double mph)
   {
	   return mph*1.609;
   }
   

   public String mph2kph_printing(double mph)
   {
	   // the DecimalFormat is needed to configure the precision (number of decimals)
	   // of the double variable when converting to string
	   return Double.toString(mph) + " mph = " + 
			   new DecimalFormat("#.#", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(mph2kph(mph)) + " kph";
   }

   public boolean mph2kph_compare(double mph1, double mph2)
   {
	   return mph2kph(mph1) >= mph2kph(mph2);
   }
   
   public double[] convert_array(String type, double[] values)
   {
	   double[] out_values = new double[values.length];
	   if (type.equals("mph2kph")) {
		   for (int i = 0; i < values.length; i++) {
			   out_values[i] = mph2kph(values[i]);
		   }
	   } 
	   return out_values;
   }

}
