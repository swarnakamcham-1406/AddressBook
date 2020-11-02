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
		 public void editPerson() {

                int value=1;
                Scanner edit = new Scanner(System.in);
                for(PersonInfo p : persons) {
                        System.out.println(p.toString());

                System.out.println("enter the first name to edit the details");
                String fname=edit.nextLine();
          if(fname.equals(p.firstName)) {

                  while(value==1) {
                          System.out.println("enter option to edit the details");
                          System.out.println("1.phone numer");
                          System.out.println("2.city");
                          System.out.println("3.state");
                          System.out.println("4.zipcode");
                          System.out.println("5.quit");

                          Scanner newvalue=new Scanner(System.in);
                          int choice=newvalue.nextInt();


                          switch(choice) {

                          case 1:
                                  System.out.println("enter the new phone number");
                                  String pnum=newvalue.nextLine();
                                  p.setPhoneNumber(pnum);
                                  System.out.println(p.toString());
                                  break;
                          case 2:
                                  System.out.println("enter the new city");
                                  String city=newvalue.nextLine();
                                  p.setPhoneNumber(city);
                                  System.out.println(p.toString());
                                  break;
                          case 3:
                                  System.out.println("enter the new state");
                                  String state=newvalue.nextLine();
                                  p.setPhoneNumber(state);
                                  System.out.println(p.toString());
                                  break;
                          case 4:
				 System.out.println("enter the new zipcode");
                                  String zcode=newvalue.nextLine();
                                  p.setPhoneNumber(zcode);
                                  System.out.println(p.toString());
                                  break;
                          case 5:
                                  value=0;
                                  break;

                                  default:
                                          System.out.println("you entered invalid option");
                                          break;
                          }
                  }
                }
                }
		
	
		
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

		
