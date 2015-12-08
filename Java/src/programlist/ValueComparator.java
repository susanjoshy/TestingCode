//This comparator is is used to sort the values in map by ascending order

package programlist;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator {
Map<Integer,String> map;
public ValueComparator(Map<Integer ,String> map) {
    this.map = map;
}


public int compare(Object name1,Object name2) {
	int compare = ((String) map.get(name1)) .compareTo((String) map.get(name2));
           
    if (compare == 0) {
        return -1;
    }
    return compare;
}


}

