package CodeAskedIniterviews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomArraylist<Integer> extends ArrayList<Integer> {

	public List<Integer> list = new LinkedList<>();

	@Override
	public boolean add(Integer e) {
		list.add(e);
		long count = 0;
		count = list.stream().filter(a -> a == e).collect(Collectors.counting());
		if (count == 1) {
			return super.add(e);
		}
		return false;
	}
}
