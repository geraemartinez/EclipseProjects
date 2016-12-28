package ctc.traccar.business.helpers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionUtilsHelper<T> {

	public   List<T> cast(Set<T> set){
		List<T> list = new ArrayList<T>(set);
		return list;
	}
	
	public Set<T> cast (List<T> list){
		Set<T> set = new HashSet<T>(list);
		return set;
	}
}
