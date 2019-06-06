package Questions;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "@#$%@@@@ ffjknlnWujvd,m097653 rt467@$*";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
