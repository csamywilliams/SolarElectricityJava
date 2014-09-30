import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class testing {
	static double costofelectricity = 0.135;
	static double genunit = 0.16;
	static double expunit = 0.045;
	static double impunit = 0.14;
	static int mhours = 1;
	static int mxhours = 12;
	static DecimalFormat df = new DecimalFormat("##.###");
	static DecimalFormat bf = new DecimalFormat("##.##");
	static double generated;
	
	public static void main(String[] args) throws IOException{	


        int reading;
   
        Scanner in = new Scanner(System.in);
       
  
        System.out.print("Enter the year: ");
        int yearentered = in.nextInt();
        
        System.out.print("Enter the first electricity reading since pv installed: ");
        reading = in.nextInt();
        

        System.out.println("You entered year: " +yearentered);
        
        monthjan(reading,yearentered);
    	
    }
	
	private static void monthjan(int reading, int yearentered) throws IOException {
		 int homereading=0,imported, exported, homeunit, pvunit, pvreading;	
	 	 
	 	 int minexported = 0;
	  double total=0, exportedtariff, importedtariff, generated; 
	 	String date;
	 	
		 int days = 32;
	 	 int minhours = 0;
	 	 int maxhours = 7;
	 	 int year = yearentered;
	 	 int generate = 3652;
 
		FileWriter fw = new FileWriter("C:\\Users\\Amy\\Documents\\3rdYrProject\\TestData\\New1Data.csv");
		PrintWriter pw = new PrintWriter(fw);
		pw.print("Systemid, Date, HomeUnit, HomeReading , PVUnit, PVReading, Imported, Exported, " +
				"GenerationTariff, ImportedTariff, ExportedTariff, Total \n");
		
		DecimalFormat df = new DecimalFormat("##.###");
		DecimalFormat bf = new DecimalFormat("##.##");
		 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		homeunit = new Random().nextInt(mxhours-mhours)+mhours;  //random number for hours
			homereading = homeunit + reading;
			reading = homereading;
			
			pvunit = new Random().nextInt(maxhours - minhours)+minhours;
			pvreading = pvunit + generate;
			generate = pvreading;

			exported = new Random().nextInt(generate-minexported)+minexported;  
						
			if (exported < reading){
				int maxused = generate - exported;
				imported = reading - maxused;
				
			}else{
				imported = 0;
			}
			if (imported == 0){
			importedtariff = 0;
			}else{
				importedtariff = imported * impunit/1000;
			}
			
			generated =(double)(pvunit * genunit);
			exportedtariff = exported * expunit/1000;
			date = (i + "/1/" + year);
			
			total = generated+exportedtariff+importedtariff;
			homereading = 0;
		
		    pw.print("" +date + "," + homeunit+","+reading+","+ pvunit + "," + pvreading + "," +
		    		(df.format(imported))+ ","+(df.format(exported)) +","+ (df.format(generated)) +","+
		    		(bf.format(importedtariff))+"," + (bf.format(exportedtariff))+"," + (bf.format(total)) + "\n");
		    
		    if (i == 31){
		    	monthfeb(year,homeunit,reading,pvunit,pvreading, generate,fw,pw);
		    }
	 	}
	 	
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthfeb(int year, int homeunit, int reading, int pvunit, 
			int generate, int pvreading,FileWriter fw, PrintWriter pw) throws IOException {
		int homereading=0,imported, exported;	
	 	 
	 	 int minexported = 0;
	  double total=0, exportedtariff, importedtariff; 
	 	String date;
		int days = 30;
	 	 int minhours = 0;
	 	 int maxhours = 9;
	 	 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		homeunit = new Random().nextInt(mxhours-mhours)+mhours;  //random number for hours
			homereading = homeunit + reading;
			reading = homereading;
			
			pvunit = new Random().nextInt(maxhours - minhours)+minhours;
			pvreading = pvunit + generate;
			generate = pvreading;

			exported = new Random().nextInt(generate-minexported)+minexported;  
						
			if (exported < reading){
				int maxused = generate - exported;
				imported = reading - maxused;
				
			}else{
				imported = 0;
			}
		
			if (imported == 0){
			importedtariff = 0;
			}else{
				importedtariff = imported * impunit/1000;
			}
			
			generated =(double)(pvunit * genunit);
			exportedtariff = exported * expunit/1000;
			date = (i + "/2/" + year);
			
			total = generated+exportedtariff+importedtariff;
			homereading = 0;
		
		    pw.print(date + "," + homeunit+","+reading+","+ pvunit + "," + pvreading + "," +
		    		(df.format(imported))+ ","+(df.format(exported)) +","+ (df.format(generated)) +","+
		    		(bf.format(importedtariff))+"," + (bf.format(exportedtariff))+"," + (bf.format(total)) + "\n");
		    
		    if (i == 29){
		    	monthmar(year,homeunit,reading,pvunit,pvreading, generate,fw,pw);
		    }
	 	}
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthmar(int year, int homeunit, int reading, int pvunit, 
			int generate, int pvreading,FileWriter fw, PrintWriter pw) throws IOException {
		 int days = 32;
	 	 int minhours = 0;
	 	 int maxhours = 13;
	 	int homereading=0,imported, exported;	
	 	 int minexported = 0;
	  double total=0, exportedtariff, importedtariff; 
	 	String date;
		 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		homeunit = new Random().nextInt(mxhours-mhours)+mhours;  //random number for hours
			homereading = homeunit + reading;
			reading = homereading;
			
			pvunit = new Random().nextInt(maxhours - minhours)+minhours;
			pvreading = pvunit + generate;
			generate = pvreading;

			exported = new Random().nextInt(generate-minexported)+minexported;  
						
			if (exported < reading){
				int maxused = generate - exported;
				imported = reading - maxused;	
			}else{
				imported = 0;
			}
			
			if (imported == 0){
				importedtariff = 0;
			}else{
				importedtariff = imported * impunit/1000;
			}
			
			generated =(double)(pvunit * genunit);
			exportedtariff = exported * expunit/1000;
			date = (i + "/3/" + year);
			
			total = generated+exportedtariff+importedtariff;
			homereading = 0;
		
		    pw.print(date + "," + homeunit+","+reading+","+ pvunit + "," + pvreading + "," +
		    		(df.format(imported))+ ","+(df.format(exported)) +","+ (df.format(generated)) +","+
		    		(bf.format(importedtariff))+"," + (bf.format(exportedtariff))+"," + (bf.format(total)) + "\n");
		    if (i == 31){
		    	monthapr(year,homeunit,reading,pvunit,pvreading, generate,fw,pw);
		    }
	 	}
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthapr(int year, int homeunit, int reading, int pvunit, 
			int generate, int pvreading,FileWriter fw, PrintWriter pw) throws IOException {
		 int days = 31;
	 	 int minhours = 0;
	 	 int maxhours = 17;
	 	int homereading=0,imported, exported;	
	 	 int minexported = 0;
	  double total=0, exportedtariff, importedtariff; 
	 	String date;
		 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		homeunit = new Random().nextInt(mxhours-mhours)+mhours;  //random number for hours
			homereading = homeunit + reading;
			reading = homereading;
			
			pvunit = new Random().nextInt(maxhours - minhours)+minhours;
			pvreading = pvunit + generate;
			generate = pvreading;

			exported = new Random().nextInt(generate-minexported)+minexported;  
						
			if (exported < reading){
				int maxused = generate - exported;
				imported = reading - maxused;	
			}else{
				imported = 0;
			}
			
			if (imported == 0){
				importedtariff = 0;
			}else{
				importedtariff = imported * impunit/1000;
			}
			
			generated =(double)(pvunit * genunit);
			exportedtariff = exported * expunit/1000;
			date = (i + "/4/" + year);
			
			total = generated+exportedtariff+importedtariff;
			homereading = 0;
		
		    pw.print(date + "," + homeunit+","+reading+","+ pvunit + "," + pvreading + "," +
		    		(df.format(imported))+ ","+(df.format(exported)) +","+ (df.format(generated)) +","+
		    		(bf.format(importedtariff))+"," + (bf.format(exportedtariff))+"," + (bf.format(total)) + "\n");
		    if (i == 30){
		    	monthmay(year,homeunit,reading,pvunit,pvreading, generate,fw,pw);
		    }
		    
	 	}
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthmay(int year, int homeunit, int reading, int pvunit, 
		int generate, int pvreading,FileWriter fw, PrintWriter pw) throws IOException {
		int homereading=0,imported, exported;	
	 	 int minexported = 0;
	  double total=0, exportedtariff, importedtariff; 
	 	String date;
		 int days = 32;
	 	 int minhours = 0;
	 	 int maxhours = 18;
		 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		homeunit = new Random().nextInt(mxhours-mhours)+mhours;  //random number for hours
			homereading = homeunit + reading;
			reading = homereading;
			
			pvunit = new Random().nextInt(maxhours - minhours)+minhours;
			pvreading = pvunit + generate;
			generate = pvreading;

			exported = new Random().nextInt(generate-minexported)+minexported;  
						
			if (exported < reading){
				int maxused = generate - exported;
				imported = reading - maxused;	
			}else{
				imported = 0;
			}
			
			if (imported == 0){
				importedtariff = 0;
			}else{
				importedtariff = imported * impunit/1000;
			}
			
			generated =(double)(pvunit * genunit);
			exportedtariff = exported * expunit/1000;
			date = (i + "/5/" + year);
			
			total = generated+exportedtariff+importedtariff;
			homereading = 0;
		
		    pw.print(date + "," + homeunit+","+reading+","+ pvunit + "," + pvreading + "," +
		    		(df.format(imported))+ ","+(df.format(exported)) +","+ (df.format(generated)) +","+
		    		(bf.format(importedtariff))+"," + (bf.format(exportedtariff))+"," + (bf.format(total)) + "\n");
		    
		    if (i == 31){
		    	monthjun(year,homeunit,reading,pvunit,pvreading, generate,fw,pw);
		    }
	 	}
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthjun(int year, int homeunit, int reading, int pvunit, 
			int generate, int pvreading,FileWriter fw, PrintWriter pw) throws IOException {
		int homereading=0,imported, exported;
	 	 int minexported = 0;
	  double total=0, exportedtariff, importedtariff; 
	 	String date;
		 int days = 31;
	 	 int minhours = 0;
	 	 int maxhours = 17;
		 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		homeunit = new Random().nextInt(mxhours-mhours)+mhours;  //random number for hours
			homereading = homeunit + reading;
			reading = homereading;
			
			pvunit = new Random().nextInt(maxhours - minhours)+minhours;
			pvreading = pvunit + generate;
			generate = pvreading;

			exported = new Random().nextInt(generate-minexported)+minexported;  
						
			if (exported < reading){
				int maxused = generate - exported;
				imported = reading - maxused;	
			}else{
				imported = 0;
			}
			
			if (imported == 0){
				importedtariff = 0;
			}else{
				importedtariff = imported * impunit/1000;
			}
			
			generated =(double)(pvunit * genunit);
			exportedtariff = exported * expunit/1000;
			date = (i + "/6/" + year);
			
			total = generated+exportedtariff+importedtariff;
			homereading = 0;
		
		    pw.print(date + "," + homeunit+","+reading+","+ pvunit + "," + pvreading + "," +
		    		(df.format(imported))+ ","+(df.format(exported)) +","+ (df.format(generated)) +","+
		    		(bf.format(importedtariff))+"," + (bf.format(exportedtariff))+"," + (bf.format(total)) + "\n");
		    
		    if (i == 30){
		    	monthjul(year,homeunit,reading,pvunit,pvreading, generate,fw,pw);
		    }
	 	}
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthjul(int year, int homeunit, int reading, int pvunit, 
			int generate, int pvreading,FileWriter fw, PrintWriter pw) throws IOException {
		int homereading=0,imported, exported;	
	 	
	 	 int minexported = 0;
	  double total=0, exportedtariff, importedtariff; 
	 	String date;
		 int days = 32;
	 	 int minhours = 0;
	 	 int maxhours = 20;
		 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		homeunit = new Random().nextInt(mxhours-mhours)+mhours;  //random number for hours
			homereading = homeunit + reading;
			reading = homereading;
			
			pvunit = new Random().nextInt(maxhours - minhours)+minhours;
			pvreading = pvunit + generate;
			generate = pvreading;

			exported = new Random().nextInt(generate-minexported)+minexported;  
						
			if (exported < reading){
				int maxused = generate - exported;
				imported = reading - maxused;	
			}else{
				imported = 0;
			}
			
			if (imported == 0){
				importedtariff = 0;
			}else{
				importedtariff = imported * impunit/1000;
			}
			
			generated =(double)(pvunit * genunit);
			exportedtariff = exported * expunit/1000;
			date = (i + "/7/" + year);
			
			total = generated+exportedtariff+importedtariff;
			homereading = 0;
		
		    pw.print(date + "," + homeunit+","+reading+","+ pvunit + "," + pvreading + "," +
		    		(df.format(imported))+ ","+(df.format(exported)) +","+ (df.format(generated)) +","+
		    		(bf.format(importedtariff))+"," + (bf.format(exportedtariff))+"," + (bf.format(total)) + "\n");
		    
		    if (i == 31){
		    	monthaug(year,homeunit,reading,pvunit,pvreading, generate,fw,pw);
		    }
	 	}
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthaug(int year, int homeunit, int reading, int pvunit, 
			int generate, int pvreading,FileWriter fw, PrintWriter pw) throws IOException {
		int homereading=0,imported, exported;	
	 		 int minexported = 0;
	  double total=0, exportedtariff, importedtariff; 
	 	String date;
		int days = 32;
	 	 int minhours = 0;
	 	 int maxhours = 17;
		 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		homeunit = new Random().nextInt(mxhours-mhours)+mhours;  //random number for hours
			homereading = homeunit + reading;
			reading = homereading;
			
			pvunit = new Random().nextInt(maxhours - minhours)+minhours;
			pvreading = pvunit + generate;
			generate = pvreading;

			exported = new Random().nextInt(generate-minexported)+minexported;  
						
			if (exported < reading){
				int maxused = generate - exported;
				imported = reading - maxused;	
			}else{
				imported = 0;
			}
			
			if (imported == 0){
				importedtariff = 0;
			}else{
				importedtariff = imported * impunit/1000;
			}
			
			generated =(double)(pvunit * genunit);
			exportedtariff = exported * expunit/1000;
			date = (i + "/8/" + year);
			
			total = generated+exportedtariff+importedtariff;
			homereading = 0;
		
		    pw.print(date + "," + homeunit+","+reading+","+ pvunit + "," + pvreading + "," +
		    		(df.format(imported))+ ","+(df.format(exported)) +","+ (df.format(generated)) +","+
		    		(bf.format(importedtariff))+"," + (bf.format(exportedtariff))+"," + (bf.format(total)) + "\n");
		    
		    if (i == 31){
		    	monthsep(year,homeunit,reading,pvunit,pvreading, generate,fw,pw);
		    }
	 	}
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthsep(int year, int homeunit, int reading, int pvunit, 
			int generate, int pvreading,FileWriter fw, PrintWriter pw) throws IOException {
		int homereading=0,imported, exported;	
 
	 	 int minexported = 0;
	  double total=0, exportedtariff, importedtariff; 
	 	String date;
		 int days = 31;
	 	 int minhours = 0;
	 	 int maxhours = 12;
		 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		homeunit = new Random().nextInt(mxhours-mhours)+mhours;  //random number for hours
			homereading = homeunit + reading;
			reading = homereading;
			
			pvunit = new Random().nextInt(maxhours - minhours)+minhours;
			pvreading = pvunit + generate;
			generate = pvreading;

			exported = new Random().nextInt(generate-minexported)+minexported;  
						
			if (exported < reading){
				int maxused = generate - exported;
				imported = reading - maxused;	
			}else{
				imported = 0;
			}
			
			if (imported == 0){
				importedtariff = 0;
			}else{
				importedtariff = imported * impunit/1000;
			}
			
			generated =(double)(pvunit * genunit);
			exportedtariff = exported * expunit/1000;
			date = (i + "/9/" + year);
			
			total = generated+exportedtariff+importedtariff;
			homereading = 0;
		
		    pw.print(date + "," + homeunit+","+reading+","+ pvunit + "," + pvreading + "," +
		    		(df.format(imported))+ ","+(df.format(exported)) +","+ (df.format(generated)) +","+
		    		(bf.format(importedtariff))+"," + (bf.format(exportedtariff))+"," + (bf.format(total)) + "\n");
		    
		    if (i == 30){
		    	monthoct(year,homeunit,reading,pvunit,pvreading, generate,fw,pw);
		    }
	 	}
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	private static void monthoct(int year, int homeunit, int reading, int pvunit, 
			int generate, int pvreading,FileWriter fw, PrintWriter pw) throws IOException {
		int homereading=0,imported, exported;	
	 	 int minexported = 0;
	  double total=0, exportedtariff, importedtariff; 
	 	String date;
		 int days = 32;
	 	 int minhours = 0;
	 	 int maxhours = 10;
		 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		homeunit = new Random().nextInt(mxhours-mhours)+mhours;  //random number for hours
			homereading = homeunit + reading;
			reading = homereading;
			
			pvunit = new Random().nextInt(maxhours - minhours)+minhours;
			pvreading = pvunit + generate;
			generate = pvreading;

			exported = new Random().nextInt(generate-minexported)+minexported;  
						
			if (exported < reading){
				int maxused = generate - exported;
				imported = reading - maxused;	
			}else{
				imported = 0;
			}
			
			if (imported == 0){
				importedtariff = 0;
			}else{
				importedtariff = imported * impunit/1000;
			}
			
			generated =(double)(pvunit * genunit);
			exportedtariff = exported * expunit/1000;
			date = (i + "/10/" + year);
			
			total = generated+exportedtariff+importedtariff;
			homereading = 0;
		
		    pw.print(date + "," + homeunit+","+reading+","+ pvunit + "," + pvreading + "," +
		    		(df.format(imported))+ ","+(df.format(exported)) +","+ (df.format(generated)) +","+
		    		(bf.format(importedtariff))+"," + (bf.format(exportedtariff))+"," + (bf.format(total)) + "\n");
		    
		    if (i == 31){
		    	monthnov(year,homeunit,reading,pvunit,pvreading, generate,fw,pw);
		    }
	 	}
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthnov(int year, int homeunit, int reading, int pvunit, 
			int generate, int pvreading,FileWriter fw, PrintWriter pw) throws IOException {
		int homereading=0,imported, exported;	
	 	 int minexported = 0;
	  double total=0, exportedtariff, importedtariff; 
	 	String date;
		int days = 31;
	 	 int minhours = 0;
	 	 int maxhours = 7;
		 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		homeunit = new Random().nextInt(mxhours-mhours)+mhours;  //random number for hours
			homereading = homeunit + reading;
			reading = homereading;
			
			pvunit = new Random().nextInt(maxhours - minhours)+minhours;
			pvreading = pvunit + generate;
			generate = pvreading;

			exported = new Random().nextInt(generate-minexported)+minexported;  
						
			if (exported < reading){
				int maxused = generate - exported;
				imported = reading - maxused;	
			}else{
				imported = 0;
			}
			
			if (imported == 0){
				importedtariff = 0;
			}else{
				importedtariff = imported * impunit/1000;
			}
			
			generated =(double)(pvunit * genunit);
			exportedtariff = exported * expunit/1000;
			date = (i + "/11/" + year);
			
			total = generated+exportedtariff+importedtariff;
			homereading = 0;
		
		    pw.print(date + "," + homeunit+","+reading+","+ pvunit + "," + pvreading + "," +
		    		(df.format(imported))+ ","+(df.format(exported)) +","+ (df.format(generated)) +","+
		    		(bf.format(importedtariff))+"," + (bf.format(exportedtariff))+"," + (bf.format(total)) + "\n");
		    
		    if (i == 30){
		    	monthdec(year,homeunit,reading,pvunit,pvreading, generate,fw,pw);
		    }
	 	}
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthdec(int year, int homeunit, int reading, int pvunit, 
			int generate, int pvreading,FileWriter fw, PrintWriter pw) throws IOException {
		int homereading=0,imported, exported;	
	 	 int minexported = 0;
	  double total=0, exportedtariff, importedtariff; 
	 	String date;
		 int days = 32;
	 	 int minhours = 0;
	 	 int maxhours = 5;
		 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		homeunit = new Random().nextInt(mxhours-mhours)+mhours;  //random number for hours
			homereading = homeunit + reading;
			reading = homereading;
			
			pvunit = new Random().nextInt(maxhours - minhours)+minhours;
			pvreading = pvunit + generate;
			generate = pvreading;

			exported = new Random().nextInt(generate-minexported)+minexported;  
						
			if (exported < reading){
				int maxused = generate - exported;
				imported = reading - maxused;	
			}else{
				imported = 0;
			}
			
			if (imported == 0){
				importedtariff = 0;
			}else{
				importedtariff = imported * impunit/1000;
			}
			
			generated =(double)(pvunit * genunit);
			exportedtariff = exported * expunit/1000;
			date = (i + "/12/" + year);
			
			total = generated+exportedtariff+importedtariff;
			homereading = 0;
		
		    pw.print(date + "," + homeunit+","+reading+","+ pvunit + "," + pvreading + "," +
		    		(df.format(imported))+ ","+(df.format(exported)) +","+ (df.format(generated)) +","+
		    		(bf.format(importedtariff))+"," + (bf.format(exportedtariff))+"," + (bf.format(total)) + "\n");
		 
	 	}
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	
	
		
	}
