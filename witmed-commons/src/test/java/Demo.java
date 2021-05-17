import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Demo {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader(
						new File("C:\\Users\\Arthur\\Desktop\\1.txt")));
		String str;
		while ((str = br.readLine()) != null) {
			String code = str.substring(0, 6);
			String text = str.substring(6, str.length()).trim();
			if (code.substring(2, code.length()).equals("0000")) {
				String sql = "insert into sys_division(text, code) values('" + text + "', '" + code + "');";
				System.out.println(sql);
			} else if (code.substring(4, 6).equals("00") || code.substring(0, 2).equals("11")
					|| code.substring(0, 2).equals("12") || code.substring(0, 2).equals("31")
					|| code.substring(0, 2).equals("50")) {
				String parent = code.substring(0, 2) + "0000";
				String sql = "insert into sys_division(parent, text, code) values('" + parent + "', '" + text + "', '" + code + "');";
				System.out.println(sql);
			} else {
				String parent = code.substring(0, 4) + "00";
				String sql = "insert into sys_division(parent, text, code) values('" + parent + "', '" + text + "', '" + code + "');";
				System.out.println(sql);
			}
		}
	}
}
