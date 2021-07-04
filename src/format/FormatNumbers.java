package format;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumbers {

	public static void main(String[] args) {
		
		double num = 1145.4;
		NumberFormat nf1 = NumberFormat.getInstance();
		String s1 = nf1.format(num);
		System.out.println(s1);
		
		//LOCALE
		NumberFormat nf2 = NumberFormat.getInstance(new Locale("en", "US"));
		String s2 = nf1.format(num);
		System.out.println(s2);
		
		//MOEDAS		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		String s3 = nf3.format(num);
		System.out.println(s3);
		
		//MOEDAS POR REGIÃO
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		String s4 = nf4.format(num);
		System.out.println(s4);
		
		//DECIMAL FORMAT
		DecimalFormat df1 = new DecimalFormat("00,000.000");
		df1.setGroupingUsed(true);
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('-');
		df1.setDecimalFormatSymbols(dfs);
		String s5 = df1.format(num);
		System.out.println(s5);
		

	}

}
