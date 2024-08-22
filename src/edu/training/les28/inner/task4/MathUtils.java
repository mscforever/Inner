package edu.training.les28.inner.task4;

public class MathUtils {
	static class Factorial {

		long calculate(int x) {

			long res = 1;
			for (int i = 1; i <= x; i++) {
				res =res*i;
			}

			return res;
		}
	}

}