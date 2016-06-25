
public class Test {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("20160812");
		sb.insert(4, "-").insert(7, "-");
		System.out.println(sb.toString());

	}

}
