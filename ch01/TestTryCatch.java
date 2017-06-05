package ch01;

public class TestTryCatch {

	public static void main(String[] args) {
		int i = 0;
		String[] strs = { "Hello1", "Hello2", "Hello3" };
		while (i < 4) {
			try {
				System.out.println(strs[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("1-已超出陣列的長度");
			} catch (Exception e) {
				System.out.println("2-發生Exception");
			}
			i++;
		}

	}

}
