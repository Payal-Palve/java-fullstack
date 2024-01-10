package comTest.code;

import com.code.MobilePhone;
import com.code.*;

public class MobileTestAbstract {

	public static void main(String[] args) {
		
		MobilePhone mob=new SimplePhone();
		mob.makeCall();
		mob.price();
		
		MobilePhone mob1=new SmartPhone();
		mob1.makeCall();
		mob1.price();
	}

}
