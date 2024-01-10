package comTest.code;

import com.code.Account;

public class AccountMain {

	public static void main(String[] args) {
		Account ac=new Account();
		System.out.println(ac);
		
		Account ac1=new Account(309,"harry potter",6789d);
		System.out.println(ac1);
		
		Account ac2=new Account();
		ac2.setAccNo(345);
		ac2.setBalance(78908d);
		ac2.setOwnerName("parwati ghulw");
		System.out.println(ac2);
		

	}

}
