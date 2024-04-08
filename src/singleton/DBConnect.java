package singleton;

public class DBConnect implements IDBConnect {
	String address="127.0.0.1";
    private static DBConnect s; 
	private DBConnect() { }    
    private DBConnect(String address) {this.address=address; }    
	public static synchronized  DBConnect get(){
		if (s==null) s = new DBConnect();
		return s;
	}
	public static synchronized  DBConnect get(String address){
		if (s==null) s = new DBConnect(address);
		return s;
	}	
    public Object clone() throws CloneNotSupportedException {
         throw new CloneNotSupportedException();   
    }
	public void WebService1() {
	    System.out.println("Webservice 1");	
	}
	public void WebService2() {
		System.out.println("Webservice 2");
	}
	
	public static void main(String[] args) {
		DBConnect obj = DBConnect.get();
		obj.WebService1();

	}


}
