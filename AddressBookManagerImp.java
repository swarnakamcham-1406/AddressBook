package addresbook;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
public class AddressBookManagerImp implements AddressBookManagerInterface {

	AddressBookImp ab = new AddressBookImp();
	
	
	@Override
	public void newAddressBook() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the file name:");
		String name = sc.nextLine();
		FileOutputStream fos = new FileOutputStream(name,true);
		
		fos.close();
		System.out.println("file saved");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void openAddressBook() {
		
	}

	@Override
	public void saveAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAsAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAddressBook() {
		// TODO Auto-generated method stub
		
	}
	

}
