package singleton;

import java.sql.Connection;

public class DBLayerSingleton {
	private Connection con = null;
	public static final String database =
			"jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=c:\\database.mdb";
	
	private static DBLayerSingleton obj;
	public static synchronized  DBLayerSingleton getDBLayer(){
		if (obj==null)
			obj = new DBLayerSingleton();
		return obj;
	}
    public Object clone() throws CloneNotSupportedException {
         throw new CloneNotSupportedException();   
    }
	private DBLayerSingleton(){
		//....
	}
	public boolean connect(){
		return true;
	}
	//other methods

	// inner class
	public class ExtendedDBLayer extends DBLayerSingleton {
		
		public boolean connect(){
			return true;
		}  	
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBLayerSingleton dbObj = DBLayerSingleton.getDBLayer();
		ExtendedDBLayer ExtendDBref = dbObj.new ExtendedDBLayer();
		System.out.println(ExtendDBref.connect());
		
	}

}
