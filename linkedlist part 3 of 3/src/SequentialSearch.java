
public class SequentialSearch {
public static boolean contains(int[] c, int d) {
	for (int i : c) {
		if (i == d) {
			return true;
		}
	}
	return false;
}
}
