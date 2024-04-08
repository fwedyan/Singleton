package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBLayer {
	private Connection con = null;
	public static final String database =
			"jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=c:\\database.mdb";
	public DBLayer() {
       //some code	
	}

	public boolean connect(){
		return true;
	}
	//other methods
}
