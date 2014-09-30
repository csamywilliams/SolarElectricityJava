import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class generatetest {
	static String date;
	static int pvcgenerated, pvcexported, usedfrmpvc, importedfromgrid, workingpvchrs, totalelectricity;
	
	public static void main(String[] args) throws IOException{	

        Scanner in = new Scanner(System.in);
      
        System.out.print("Enter the year: ");
        int yearentered = in.nextInt();
        
        System.out.println("You entered year: " +yearentered);
        
        monthjan(yearentered);
    	
    }
	
	private static void monthjan( int yearentered) throws IOException {
	 	
	 	int days = 32;
	 	int minhoursworking = 5;		//minimum hours the pvc would work
	 	int maxhoursworking = 7;		//maximum hours the pvc would work
	 	int minpvcgenerate = 1;			//mininum hours the pvc generated electricity
	 	int maxpvcgenerate = 4;			//maximum hours the pvc generated electricity
	 	int importmax = 40;
	 	int year = yearentered;
	 	
		FileWriter fw = new FileWriter("C:\\Users\\amy\\Documents\\Data\\pvdata.csv");
		PrintWriter pw = new PrintWriter(fw);
				 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		pvcgenerated = new Random().nextInt(maxpvcgenerate-minpvcgenerate)+minpvcgenerate;  //random number for hours
			int maxvalue = pvcgenerated;
		
	 		pvcexported = new Random().nextInt(maxvalue);
			
			usedfrmpvc = pvcgenerated-pvcexported;
			
			importedfromgrid = new Random().nextInt(importmax-minpvcgenerate)+minpvcgenerate;
			
			//workingpvchrs = new Random().nextInt(maxhoursworking-minhoursworking)+minhoursworking;
			
			totalelectricity = usedfrmpvc + importedfromgrid;
			
			date = (i + "/01/" + year);
			
		    pw.print(" "+","+" "+","+date + "," + pvcgenerated+","+pvcexported+","+ usedfrmpvc + "," + importedfromgrid + "," + totalelectricity +"\n");
	    
		    if (i == 31){
		    	monthfeb(year,fw,pw);
		    }
	 	}
	 	
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthfeb( int yearentered, FileWriter fw, PrintWriter pw) throws IOException {
	 			
	 	int days = 30;
	 	int minhoursworking = 7;		//minimum hours the pvc would work
	 	int maxhoursworking = 10;		//maximum hours the pvc would work
	 	int minpvcgenerate = 2;			//mininum hours the pvc generated electricity
	 	int maxpvcgenerate = 7;			//maximum hours the pvc generated electricity
	 	int importmax = 35;
	 	int year = yearentered;
	 					 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		pvcgenerated = new Random().nextInt(maxpvcgenerate-minpvcgenerate)+minpvcgenerate;  //random number for hours
			int maxvalue = pvcgenerated;
		
	 		pvcexported = new Random().nextInt(maxvalue);
			
			usedfrmpvc = pvcgenerated-pvcexported;
			
			importedfromgrid = new Random().nextInt(importmax-minpvcgenerate)+minpvcgenerate;
			
	//		workingpvchrs = new Random().nextInt(maxhoursworking-minhoursworking)+minhoursworking;
			
			totalelectricity = usedfrmpvc + importedfromgrid;
			
			date = (i + "/02/" + year);
			
			  pw.print(" "+","+" "+","+date + "," + pvcgenerated+","+pvcexported+","+ usedfrmpvc + "," + importedfromgrid + "," + totalelectricity +"\n");
	    
		    if (i == 29){
		    	monthmar(year,fw,pw);
		    }
	 	} 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthmar( int yearentered, FileWriter fw, PrintWriter pw) throws IOException {
	 		
	 	int days = 32;
	 	int minhoursworking = 10;		//minimum hours the pvc would work
	 	int maxhoursworking = 12;		//maximum hours the pvc would work
	 	int minpvcgenerate = 3;			//mininum hours the pvc generated electricity
	 	int maxpvcgenerate = 12;			//maximum hours the pvc generated electricity
	 	int importmax = 30;
	 	int year = yearentered;
	 					 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		pvcgenerated = new Random().nextInt(maxpvcgenerate-minpvcgenerate)+minpvcgenerate;  //random number for hours
			int maxvalue = pvcgenerated;
		
	 		pvcexported = new Random().nextInt(maxvalue);
			
			usedfrmpvc = pvcgenerated-pvcexported;
			
			importedfromgrid = new Random().nextInt(importmax-minpvcgenerate)+minpvcgenerate;
			
	//		workingpvchrs = new Random().nextInt(maxhoursworking-minhoursworking)+minhoursworking;
			
			totalelectricity = usedfrmpvc + importedfromgrid;
			
			date = (i + "/03/" + year);
			
			  pw.print(" "+","+" "+","+date + "," + pvcgenerated+","+pvcexported+","+ usedfrmpvc + "," + importedfromgrid + "," + totalelectricity +"\n");
	    
		    if (i == 31){
		    	monthapr(year,fw,pw);
		    }
	 	}
	 
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthapr( int yearentered, FileWriter fw, PrintWriter pw) throws IOException {
	 			
	 	int days = 31;
	 	int minhoursworking = 10;		//minimum hours the pvc would work
	 	int maxhoursworking = 14;		//maximum hours the pvc would work
	 	int minpvcgenerate = 5;			//mininum hours the pvc generated electricity
	 	int maxpvcgenerate = 17;			//maximum hours the pvc generated electricity
	 	int importmax = 25;
	 	int year = yearentered;
	 					 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		pvcgenerated = new Random().nextInt(maxpvcgenerate-minpvcgenerate)+minpvcgenerate;  //random number for hours
			int maxvalue = pvcgenerated;
		
	 		pvcexported = new Random().nextInt(maxvalue);
			
			usedfrmpvc = pvcgenerated-pvcexported;
			
			importedfromgrid = new Random().nextInt(importmax-minpvcgenerate)+minpvcgenerate;
			
		//	workingpvchrs = new Random().nextInt(maxhoursworking-minhoursworking)+minhoursworking;
			
			totalelectricity = usedfrmpvc + importedfromgrid;
			
			date = (i + "/04/" + year);
			
			  pw.print(" "+","+" "+","+date + "," + pvcgenerated+","+pvcexported+","+ usedfrmpvc + "," + importedfromgrid + "," + totalelectricity +"\n");
		    if (i == 30){
		    	monthmay(year,fw,pw);
		    }
	 	}
	 		
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}

	private static void monthmay( int yearentered, FileWriter fw, PrintWriter pw) throws IOException {
	 			
	 	int days = 32;
	 	int minhoursworking = 12;		//minimum hours the pvc would work
	 	int maxhoursworking = 16;		//maximum hours the pvc would work
	 	int minpvcgenerate = 8;			//mininum hours the pvc generated electricity
	 	int maxpvcgenerate = 20;			//maximum hours the pvc generated electricity
	 	int importmax = 20;
	 	int year = yearentered;
	 					 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		pvcgenerated = new Random().nextInt(maxpvcgenerate-minpvcgenerate)+minpvcgenerate;  //random number for hours
			int maxvalue = pvcgenerated;
		
	 		pvcexported = new Random().nextInt(maxvalue);
			
			usedfrmpvc = pvcgenerated-pvcexported;
			
			importedfromgrid = new Random().nextInt(importmax-minpvcgenerate)+minpvcgenerate;
			
		//	workingpvchrs = new Random().nextInt(maxhoursworking-minhoursworking)+minhoursworking;
			
			totalelectricity = usedfrmpvc + importedfromgrid;
			
			date = (i + "/05/" + year);
			
			  pw.print(" "+","+" "+","+date + "," + pvcgenerated+","+pvcexported+","+ usedfrmpvc + "," + importedfromgrid + "," + totalelectricity +"\n");
	    
		    if (i == 30){
		    	monthjun(year,fw,pw);
		    }
	 	}
	 	
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthjun( int yearentered, FileWriter fw, PrintWriter pw) throws IOException {
	 			
	 	int days = 31;
	 	int minhoursworking = 13;		//minimum hours the pvc would work
	 	int maxhoursworking = 16;		//maximum hours the pvc would work
	 	int minpvcgenerate = 6;			//mininum hours the pvc generated electricity
	 	int maxpvcgenerate = 22;			//maximum hours the pvc generated electricity
	 	int importmax = 15;
	 	int year = yearentered;
	 					 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		pvcgenerated = new Random().nextInt(maxpvcgenerate-minpvcgenerate)+minpvcgenerate;  //random number for hours
			int maxvalue = pvcgenerated;
		
	 		pvcexported = new Random().nextInt(maxvalue);
			
			usedfrmpvc = pvcgenerated-pvcexported;
			
			importedfromgrid = new Random().nextInt(importmax-minpvcgenerate)+minpvcgenerate;
			
		//	workingpvchrs = new Random().nextInt(maxhoursworking-minhoursworking)+minhoursworking;
			
			totalelectricity = usedfrmpvc + importedfromgrid;
			
			date = (i + "/06/" + year);
			
			  pw.print(" "+","+" "+","+date + "," + pvcgenerated+","+pvcexported+","+ usedfrmpvc + "," + importedfromgrid + "," + totalelectricity +"\n");
		    if (i == 30){
		    	monthjul(year,fw,pw);
		    }
	 	}
	 	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthjul( int yearentered, FileWriter fw, PrintWriter pw) throws IOException {
	 		
	 	int days = 32;
	 	int minhoursworking = 15;		//minimum hours the pvc would work
	 	int maxhoursworking = 17;		//maximum hours the pvc would work
	 	int minpvcgenerate = 8;			//mininum hours the pvc generated electricity
	 	int maxpvcgenerate = 25;		//maximum hours the pvc generated electricity
	 	int importmax = 15;
	 	int year = yearentered;
	 					 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		pvcgenerated = new Random().nextInt(maxpvcgenerate-minpvcgenerate)+minpvcgenerate;  //random number for hours
			int maxvalue = pvcgenerated;
		
	 		pvcexported = new Random().nextInt(maxvalue);
			
			usedfrmpvc = pvcgenerated-pvcexported;
			
			importedfromgrid = new Random().nextInt(importmax-minpvcgenerate)+minpvcgenerate;
						
			totalelectricity = usedfrmpvc + importedfromgrid;
			
			date = (i + "/07/" + year);
			
			  pw.print(" "+","+" "+","+date + "," + pvcgenerated+","+pvcexported+","+ usedfrmpvc + "," + importedfromgrid + "," + totalelectricity +"\n");
	    
		    if (i == 31){
		    	monthaug(year,fw,pw);
		    }
	 	}
	 	
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthaug( int yearentered, FileWriter fw, PrintWriter pw) throws IOException {
	 			
	 	int days = 32;
	 	int minhoursworking = 13;		//minimum hours the pvc would work
	 	int maxhoursworking = 15;		//maximum hours the pvc would work
	 	int minpvcgenerate = 6;			//mininum hours the pvc generated electricity
	 	int maxpvcgenerate = 18;			//maximum hours the pvc generated electricity
	 	int importmax = 20;
	 	int year = yearentered;
	 					 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		pvcgenerated = new Random().nextInt(maxpvcgenerate-minpvcgenerate)+minpvcgenerate;  //random number for hours
			int maxvalue = pvcgenerated;
		
	 		pvcexported = new Random().nextInt(maxvalue);
			
			usedfrmpvc = pvcgenerated-pvcexported;
			
			importedfromgrid = new Random().nextInt(importmax-minpvcgenerate)+minpvcgenerate;
						
			totalelectricity = usedfrmpvc + importedfromgrid;
			
			date = (i + "/08/" + year);
			
			  pw.print(" "+","+" "+","+date + "," + pvcgenerated+","+pvcexported+","+ usedfrmpvc + "," + importedfromgrid + "," + totalelectricity +"\n");
	    
		    if (i == 31){
		    	monthsep(year,fw,pw);
		    }
	 	}
	 		 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthsep( int yearentered, FileWriter fw, PrintWriter pw) throws IOException {
	 			
	 	int days = 31;
	 	int minhoursworking = 10;		//minimum hours the pvc would work
	 	int maxhoursworking = 14;		//maximum hours the pvc would work
	 	int minpvcgenerate = 5;			//mininum hours the pvc generated electricity
	 	int maxpvcgenerate = 15;			//maximum hours the pvc generated electricity
	 	int importmax = 25;
	 	int year = yearentered;
	 					 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		pvcgenerated = new Random().nextInt(maxpvcgenerate-minpvcgenerate)+minpvcgenerate;  //random number for hours
			int maxvalue = pvcgenerated;
		
	 		pvcexported = new Random().nextInt(maxvalue);
			
			usedfrmpvc = pvcgenerated-pvcexported;
			
			importedfromgrid = new Random().nextInt(importmax-minpvcgenerate)+minpvcgenerate;
			
			workingpvchrs = new Random().nextInt(maxhoursworking-minhoursworking)+minhoursworking;			
			totalelectricity = usedfrmpvc + importedfromgrid;
			
			date = (i + "/09/" + year);
			
			  pw.print(" "+","+" "+","+date + "," + pvcgenerated+","+pvcexported+","+ usedfrmpvc + "," + importedfromgrid + "," + totalelectricity +"\n");
	    
		    if (i == 30){
		    	monthoct(year,fw,pw);
		    }
	 	}
	 	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthoct( int yearentered, FileWriter fw, PrintWriter pw) throws IOException {
	 		
	 	int days = 32;
	 	int minhoursworking = 6;		//minimum hours the pvc would work
	 	int maxhoursworking = 10;		//maximum hours the pvc would work
	 	int minpvcgenerate = 3;			//mininum hours the pvc generated electricity
	 	int maxpvcgenerate = 13;			//maximum hours the pvc generated electricity
	 	int importmax = 30;
	 	int year = yearentered;
	 					 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		pvcgenerated = new Random().nextInt(maxpvcgenerate-minpvcgenerate)+minpvcgenerate;  //random number for hours
			int maxvalue = pvcgenerated;
		
	 		pvcexported = new Random().nextInt(maxvalue);
			
			usedfrmpvc = pvcgenerated-pvcexported;
			
			importedfromgrid = new Random().nextInt(importmax-minpvcgenerate)+minpvcgenerate;
			
			totalelectricity = usedfrmpvc + importedfromgrid;
			
			date = (i + "/10/" + year);
			
			  pw.print(" "+","+" "+","+date + "," + pvcgenerated+","+pvcexported+","+ usedfrmpvc + "," + importedfromgrid + "," + totalelectricity +"\n");
		 		
	    
		    if (i == 31){
		    	monthnov(year,fw,pw);
		    }
	 	}
 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthnov( int yearentered, FileWriter fw, PrintWriter pw) throws IOException {
	 			
	 	int days = 31;
	 	int minhoursworking = 4;		//minimum hours the pvc would work
	 	int maxhoursworking = 7;		//maximum hours the pvc would work
	 	int minpvcgenerate = 2;			//mininum hours the pvc generated electricity
	 	int maxpvcgenerate = 8;			//maximum hours the pvc generated electricity
	 	int importmax = 35;
	 	int year = yearentered;
	 					 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		pvcgenerated = new Random().nextInt(maxpvcgenerate-minpvcgenerate)+minpvcgenerate;  //random number for hours
			int maxvalue = pvcgenerated;
		
	 		pvcexported = new Random().nextInt(maxvalue);
			
			usedfrmpvc = pvcgenerated-pvcexported;
			
			importedfromgrid = new Random().nextInt(importmax-minpvcgenerate)+minpvcgenerate;
						
			totalelectricity = usedfrmpvc + importedfromgrid;
			
			date = (i + "/11/" + year);
			
			  pw.print(" "+","+" "+","+date + "," + pvcgenerated+","+pvcexported+","+ usedfrmpvc + "," + importedfromgrid + "," + totalelectricity +"\n");
	    
		    if (i == 30){
		    	monthdec(year,fw,pw);
		    }
	 	} 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	
	private static void monthdec( int yearentered, FileWriter fw, PrintWriter pw) throws IOException {
	 		
	 	int days = 32;
	 	int minhoursworking = 3;		//minimum hours the pvc would work
	 	int maxhoursworking = 6;		//maximum hours the pvc would work
	 	int minpvcgenerate = 1;			//mininum hours the pvc generated electricity
	 	int maxpvcgenerate = 4;			//maximum hours the pvc generated electricity
	 	int importmax = 40;
	 	int year = yearentered;
	 					 	 	 
	 	for (int i = 1; i < days; i++){
	 		
	 		pvcgenerated = new Random().nextInt(maxpvcgenerate-minpvcgenerate)+minpvcgenerate;  //random number for hours
			int maxvalue = pvcgenerated;
		
	 		pvcexported = new Random().nextInt(maxvalue);
			
			usedfrmpvc = pvcgenerated-pvcexported;
			
			importedfromgrid = new Random().nextInt(importmax-minpvcgenerate)+minpvcgenerate;
			
			workingpvchrs = new Random().nextInt(maxhoursworking-minhoursworking)+minhoursworking;
			
			totalelectricity = usedfrmpvc + importedfromgrid;
			
			date = (i + "/12/" + year);
			
		    pw.print("" + "," + "" + "," +date + "," + pvcgenerated+","+pvcexported+","+ importedfromgrid + "," + usedfrmpvc + "," +
		    		workingpvchrs+ ","+totalelectricity +"\n");
	 		}
	 	
			pw.flush();
		      
		      //Close the Print Writer
		    pw.close();
		      
		      //Close the File Writer
		    fw.close();  
	}
	}
