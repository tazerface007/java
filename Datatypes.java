class Datatypes {
	public static void main(String[] args) {
		short vshort = 32767;
		int vint = 2147483647;
		long vlong = 1323234233;
		byte vbyte = 127;
		float vfloat = 2.2F;
		double vdouble = 2.2;
		boolean vbool = true;
		char vchar = 'A';
		int[] arr = {1,2,3,4,5,6,7,8,9,10};

		// Print Statements
		print("Short: " + vshort);
		print("Integer: " + vint);
		print("Long: " + vlong);
		print("Bytes: " + vbyte);
		print("Float: " + vfloat);
		print("Double: " + vdouble);
		print("Character: " + vchar);
		for(int val: arr) {
			System.out.println(val);
		}
	}
	
	public static void print(String val) {
		System.out.println(val);
	}
}
