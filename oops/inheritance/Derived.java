public class Derived extends Base {
	public Derived(String UUID) {
		super(UUID);
	}
	public void getValue() {
		System.out.println(this.getUUID());
	}

	public static void main(String[] args) {
		Derived d = new Derived("I Phone 17 Pro");
		d.getValue();

	}

}
