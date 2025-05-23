package test;


public class Bai_test {
	public static void Tinhcb2(int m) {
		double n = 0.0;
		n = Math.sqrt(m);
		System.out.println("Can bac hai cua "+m+" la " + n);
		
	}
	public static void main(String args[]) {
		Bai_test t = new Bai_test();
		t.Tinhcb2(9);
		t.Tinhcb2(16);
	}
}
