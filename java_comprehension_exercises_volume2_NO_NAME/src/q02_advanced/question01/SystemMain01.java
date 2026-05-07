package q02_advanced.question01;

public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会員情報を表示します===");
		//TODO ここから実装する

		Member member1 = new Member(1, "pass1", "田中太郎", 20, 1);

		Member member2 = new Member(2, "pass2", "佐藤花子", 25, 2);

		member1.showMember();

		member2.showMember();

	}

}
