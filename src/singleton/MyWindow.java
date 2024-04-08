package singleton;

public class MyWindow {

	private static MyWindow ref = new MyWindow();
	int width;
	int height;
	private MyWindow() { }
	public synchronized static MyWindow get() {
		if (ref == null)
			ref = new MyWindow();
		return ref;
	}
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("You can't!");       }
	
	public int getWidth() {  return width;  }
	public void setWidth(int width) {this.width = width; }
	public int getHeight() { return height; }
	public void setHeight(int height) { this.height = height; }

	public static void main(String[] args) {
		MyWindow w1 = MyWindow.get();
		try {
			MyWindow w2 = (MyWindow) w1.clone();
			MyWindow w3 = (MyWindow) w1.get();
			w3.height =20;
			System.out.println(w3.height);
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
			
		}

	}

}
