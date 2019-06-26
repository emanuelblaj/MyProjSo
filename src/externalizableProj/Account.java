package externalizableProj;

import java.util.*;
import java.lang.ClassNotFoundException;
import java.io.*;

public class Account {
	private String username;
	private String password;
	
	public Account(String username, String password) {
		System.out.println("Constructor Account( String, String)");
		this.username = username;
		this.password = password;
		
	}
	
	public Account() {
		System.out.println("Default Constructor Account");
	}
	
	public void readExternal(ObjectInput in ) throws ClassNotFoundException {
		System.out.println("Method readExternal, class Account")
		;
		try {
			username  = (String) in.readObject();
			password = (String) in.readObject();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	public void writeExternal (ObjectOutput out) throws IOException {
		System.out.println("Method writeExternal, class Acount");
		out.writeObject(username);
	}
	
	public String toString() {
		return username+password;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Creating an object");
		Account a = new Account("MyNane", " MyPassword");
		try{
			System.out.println("Saving the object");
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Account.txt")
);
out.writeObject( a );
out.close();

System.out.println("Restoring the object");
ObjectInputStream in = new ObjectInputStream(new FileInputStream("Account.txt"));
Account b = (Account) in.readObject();
System.out.println( b );

} 
		catch(Exception e )
		{
	System.out.println(e) ;
	}
	}
	
}
