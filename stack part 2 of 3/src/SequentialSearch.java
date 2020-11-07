
public class SequentialSearch {
	public static boolean contains(int[] e, int f) {
		for (int i : e) {
			if (i == f) {
				return true;
			}
		}
		return false;
	}
}
