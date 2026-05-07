package q01_basic.question05;

public class NonMember extends Member {

	public NonMember(String name) {
		this.name = name;
	}

	@Override
	public void buyItem() {
		System.out.println("---BUY ITEM---");
		System.out.println(name + " purchased the item at a fixed price");
	}

	@Override
	public void showMember() {
		System.out.println("---SHOW ALL MEMBERS--- ");
		System.out.println("***MEMBER DATA*** ");
		System.out.println(name + "is a non-member");

	}
}
