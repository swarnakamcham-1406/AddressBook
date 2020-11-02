package addresbook;

import java.util.Comparator;

public class ZipComparator implements Comparator<PersonInfo> {

	@Override
	public int compare(PersonInfo p1, PersonInfo p2) {
		return p1.zipCode.compareTo(p2.zipCode);
		
	}

}
