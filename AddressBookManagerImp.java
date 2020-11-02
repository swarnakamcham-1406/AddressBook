package addresbook;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
public class AddressBookManagerImp implements AddressBookManagerInterface {

	AddressBookImp ab = new AddressBookImp();
	
	
	@Override
	public void newAddressBook() {
		System.out.println("create new address book");
		
		Scanner sc = new Scanner(System.in);
		String newaddressbook=sc.nextLine();
		try {
			FileWriter fw = new FileWriter("D:\\CSV.csv",true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			pw.println("Name of the address book: "+newaddressbook );
			pw.flush();
			pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}		
	}

	@Override
	public void openAddressBook() {
		AddressBookImp ab = new AddressBookImp();
		Scanner s1=new Scanner(System.in);
		int value=1;
		while(value==1) {
			System.out.println("Enter one of the following option to perform oeration on Address: ");
			System.out.println("1.Add person");
			System.out.println("2.edit person");
			System.out.println("3.delete person");
			System.out.println("4.Sort By name");
			System.out.println("5.Sort By Zip");
			System.out.println("6.Search person");
			System.out.println("7.Display");
			System.out.println("8.Quit");
			
			s1 = new Scanner(System.in);
			int num =s1.nextInt();
			
		switch(num) {
	case 1:
			ab.addPerson();
			break;
			
	case 2:
			ab.editPerson();
			break;
	case 3:
			ab.deletePerson();
			break;

	case 4:
			ab.sortByName();
			break;

	case 5:
		ab.sortByZip();
			break;

	case 6:
			ab.searchPerson();
			break;	
	case 7:
			ab.display();
			break;
	case 8:
			value=0;

   default :
			System.out.println("Entered Wrong option");

		}
		}
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
