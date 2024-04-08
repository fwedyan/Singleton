package singleton;

public class Compiler implements ICompiler {
	JDKCompiler r = new JDKCompiler();
	private static Compiler obj = new Compiler();
	public void compile(String filename) {
	  r.compileJava(filename);
	}
	public void build(String filename) {
		r.BuildJava(filename);		
	}
	public static synchronized  Compiler V(JDKCompiler r){
		if (obj ==null)
			obj = new Compiler( r);
		return obj;
	}	
    
	private Compiler(JDKCompiler r){
		//....
	}
	private Compiler(){
		//....
	}
}
