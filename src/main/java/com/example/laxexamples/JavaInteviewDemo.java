
public class JavaInteviewDemo {

	interface a {
		void show();
	}

	static class A implements a {

		@Override
		public void show() {
			// TODO Auto-generated method stub

		}

	}

	static class B extends A implements Observable {

		@Override
		public void opserver() {
			// TODO Auto-generated method stub

		}

	}

	interface Observable {
		void opserver();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int j1 = 0;
		// j1++++;
		System.out.println("J1 ++++++" + j1)
		Object o = new A();
		// A a = (A) o;

		// B b = (Observable) 0;

		StringBuffer str = new StringBuffer("     position 1 no       @ Durga is This      "); // reverse
																								// string
		// result shlould be "This is Durga @ no 1 position";
		int i = 0, j = 0, w = 0;
		// w represnt start index of a particular work
		// j reprensent last index of a particular word
		while (i < str.length()) {
			if (i == 0) {
				w = 0;
			}
			if (str.charAt(i) == ' ' || i == str.length() - 1) {
				j = i;
				if (i == str.length() - 1) {
					j = i;
				} else {
					j--;
				}
				swap(str, w, j);
				w = i + 1;
			}
			i++;
		}
		swap(str, 0, str.length() - 1);
		System.out.println("Reversed String:" + str + ":");
	}

	static void swap(StringBuffer s, int i, int j) {
		while (i < j) {
			char c = s.charAt(i);
			s.setCharAt(i, s.charAt(j));
			s.setCharAt(j, c);
			i++;
			j--;
		}
	}

	String s = "abcd";

	public void display(int n) {
		String tmp;
		if (n > 0) {
			tmp = "abc";
		} else {
			tmp = " non ";
		}

		System.out.println(s + tmp);
	}

}
