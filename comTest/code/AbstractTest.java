package comTest.code;
import com.code.*;

public class AbstractTest {

	public static void main(String[] args) {
		
		AbstractBase obj=new AbstractChild();
		obj.accept();
		obj.demo();
		AbstractBase.Static();
		
		
	}

}
