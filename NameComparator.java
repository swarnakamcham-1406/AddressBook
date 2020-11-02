package addresbook;

import java.util.Comparator;

public class NameComparator implements Comparator<PersonInfo> {

	public int compare(PersonInfo p1,PersonInfo p2) {
		
		return p1.firstName.compareTo(p2.firstName);
	}


	}


