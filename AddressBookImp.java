package addresbook;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class AddressBookImp implements AddressBookInterface {
	
	ArrayList<PersonInfo> persons;
	
	public AddressBookImp() {
		persons = new ArrayList<>();
	}
	
	public void addPerson() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter firstName");
		String firstname = input.nextLine();
		System.out.println("enter last name");
		String lastname = input.nextLine();
		System.out.println("enter phone number");
		String phoneno = input.nextLine();
		System.out.println("enter city");
		String City = input.nextLine();
		System.out.println("enter state");
		String State = input.nextLine();
		System.out.println("enter zipcode");
		String zip = input.nextLine();

		PersonInfo p = new PersonInfo(firstname, lastname, phoneno, City, State,zip); 
		
		persons.add(p);
		
	}
	
	public void editPerson() {
		
	
		
	}

	@Override
	public void deletePerson() {

	}

	@Override
	public void sortByName() {
		
			
		
	}

	@Override
	public void sortByZip() {
		
		
			
	}

	@Override
	public void searchPerson() {
		
			
			
		
	}

	@Override
	public void display() {
	
		
	
	}

		
