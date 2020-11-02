package addresbook;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		
		AddressBookManagerImp addressbook = new AddressBookManagerImp();
		int value=1;
		while(value==1) {
			
			System.out.println("1.new address book");
			System.out.println("2.open address book");
			System.out.println("3.save address book");
			System.out.println("4.saveas address book");
			System.out.println("5.close address book");
		    System.out.println("6.quit");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			switch(num) {
			
			case 1:
		addressbook.newAddressBook();
				break;
			case 2:
				addressbook.openAddressBook();
				   break;
			case 3:
				addressbook.saveAddressBook();
				       break;
			case 4:
				addressbook.saveAsAddressBook();
		            	break;
			case 5:	
				addressbook.closeAddressBook();
				        break;
			case 6:
				value=0;
				break;
				default:
					System.out.println("enter the valid number");
					break;
			}
		}
	}	

}
