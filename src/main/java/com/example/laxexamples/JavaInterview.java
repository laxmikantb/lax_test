package javaInterviewQuestions;

import java.util.ArrayList;

class A {
	public void act() {
		System.out.println("concreate A ");
	}
}

class B extends A {

	@Override
	public void act() {
		System.out.println("concreate B ");
	}
}

class Demo {

}

public class JavaInterview {

	static {
		System.out.println("JHa ah ");

		// System.exit(0);

		// // Array Demo
		// int[] arrInt = new int[] { 1, 4,5,6,6,6,6,67,8,8};
		// Object[] objArr = new Object[10];
		// objArr[0] = new Student();
		// objArr[1] = new Demo();
		// Student[] sArr = new Student[3];
		// sArr[0] = new Student();
		// //sArr[1]= new Demo();

		Integer x = 30;
		Integer y = 25;

		swap(x, y);
		System.out.println("X" + x + " Y " + y);
	}

	public static int[] bsearch(int[] arr, int left, int right, int target) {
		int[] result = new int[2];
		if (left == right && arr[left] != target) {

			result[0] = -1;
			result[1] = -1;
			return result;
		}
		if (arr[left] == target) {
			result[0] = left;
			result[1] = left;
			int t1 = left;

			while (t1 > left && arr[t1] == arr[t1 - 1]) {
				t1--;
				result[0] = t1;
			}
			int t2 = left;
			while (t2 < right && arr[t2] == arr[t2 + 1]) {
				t2++;
				result[1] = t2;
			}
			return result;
		}

		int mid = left + (right - left) / 2;
		if (arr[mid] < target) {
			return bsearch(arr, mid + 1, right, target);
		} else {
			return bsearch(arr, left, mid, target);
		}
	}

	public static void exec(A obj) {
		System.out.println("refer type A");
		obj.act();
	}

	public static void exec(B obj) {
		System.out.println("refer type B");
		obj.act();
	}

	public static void main(String[] args) {
		int[] arr = new int[26];
		System.out.println("arr 23 " + arr[22]);
		String s = "abc";
		StringBuffer sb = new StringBuffer("abc");

		if (sb.equals(s)) {
			System.out.println("SB equals");
		} else {
			if (s.equals(sb)) {
				System.out.println("S Equals ");
			}
		}

		System.out.println("Main Method");
		A a = new A();
		B b = new B();
		A ab = new B();

		a.act();
		b.act();
		ab.act();

		exec(a);
		exec(b);
		exec(ab);

		ArrayList iArray = new ArrayList();
		iArray.add(1);
		JavaInterview jv = new JavaInterview();
		jv.StringCompare();

		int ar[] = new int[] { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		int n = ar.length;
		System.out.println(jv.getOddOccurrence(ar, n));

		int ar1[] = new int[] { 2, 3, 5, 7, 7, 8, 9, 10, 11 };
		System.out.println("BSEARCH  " + bsearch(ar1, 0, ar1.length, 7)[0]);

	}

	static void swap(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
	}

	{
		System.out.println("Init block1");

	}

	int getOddOccurrence(int ar[], int ar_size) {
		int i;
		int res = 0;
		for (i = 0; i < ar_size; i++) {
			res = res ^ ar[i];
		}
		return res;
	}

	public void StringCompare() {
		classA a = null;
		if (a instanceof classA) {
			System.out.println("instance of classA");
		} else {
			System.out.println("not instance of classA");
		}
		classA b = a;
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		System.out.println(s1 == s2); // reference compare
		System.out.println(s1.equals(s2)); // content compare
	}
}

class Student {

}
