package q01_basic.question03;

abstract class SystemMain03 {

	public static void main(String[] args) {
		//TODO ここから実装する

		Member mem = new Member();
		mem.showMember();

		mem = new Member("Miura Manabu", 28, 2);
		mem.showMember();

	}

}
