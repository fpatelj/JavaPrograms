package videoPractices;

import java.util.Comparator;

public class CompareByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getName().compareTo(o2.getName()) == 0) {
			return o1.getId().compareTo(o2.getId());

		} else {
			o1.getName().compareTo(o2.getName());
		}

		return o1.getName().compareTo(o2.getName());
	}

}
