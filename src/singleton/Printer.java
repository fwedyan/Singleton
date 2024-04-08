package singleton;

import java.util.HashMap;
public class Printer {
	private static HashMap<String, Printer> printers = 
			new HashMap<String, Printer>(3);
	static {  printers.put("p1", new Printer());
			  printers.put("p2", new Printer());
			  printers.put("p3", new Printer());    
			}
	public static Printer getPrinter(String PrinterID) throws Exception {
		Printer printer = printers.get(PrinterID);
		if (printer ==null)
			throw new Exception("You requested an Incorrect printer ...");
		return printer;   }
	private Printer(){ //whatever a printer needs to be initialized   }
		//rest of printer code   
	}	
}
