package comTest.code;
import com.code.*;

public class Interfacedemo extends Employee implements Show,Display {
	
	

	public static void main(String[] args) {
		
		Interfacedemo obj=new Interfacedemo();
		obj.call();
		obj.hey();
		obj.read();
		Display.write();

	}

	@Override
	public void read() {
		System.out.println("read class");
		
	}

	@Override
	public void hey() {
		System.out.println("hey called..........");
		
	}

	@Override
	public void call() {
		System.out.println("callled...............");
		
	}

}
