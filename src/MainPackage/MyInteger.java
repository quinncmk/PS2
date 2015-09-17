package MainPackage;

public class MyInteger {
	private int value;

	MyInteger(int newValue) {
		value = newValue;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	int get() {
		return value;
	}

	boolean isEven() {
		if ((this.value % 2) == 0) {
			return true;
		}
		return false;
	}

	boolean isOdd() {
		if ((this.value % 2) != 0) {
			return true;
		}
		return false;
	}

	boolean isPrime() {
		for (int divisor = 2; divisor <= this.value / 2; divisor++) {
			if (this.value % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isEven(int value) {
		if ((value % 2) == 0) {
			return true;
		}
		return false;
	}

	static boolean isOdd(int value) {
		if ((value % 2) != 0) {
			return true;
		}
		return false;
	}

	static boolean isPrime(int value) {
		for (int divisor = 2; divisor <= value / 2; divisor++) {
			if (value % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isEven(MyInteger integer) {
		if ((integer.getValue() % 2) == 0) {
			return true;
		}
		return false;
	}

	static boolean isOdd(MyInteger integer) {
		if ((integer.getValue() % 2) != 0) {
			return true;
		}
		return false;
	}

	static boolean isPrime(MyInteger integer) {
		for (int divisor = 2; divisor <= integer.getValue() / 2; divisor++) {
			if (integer.getValue() % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	boolean equal(int specifiedValue) {
		if (this.value == specifiedValue) {
			return true;
		}
		return false;
	}

	boolean equal(MyInteger integer) {
		if (integer.getValue() == this.value) {
			return true;
		}
		return false;
	}

	static int parselnt(char[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result = result * 10 + (a[i] - '0');
		}
		return result;
	}

	static int parselnt(String s) {
		int i = 0;
		int number = 0;

		while (i < s.length()) {
			number *= 10;
			number += s.charAt(i++) - '0';
		}
		return number;
	}
}
