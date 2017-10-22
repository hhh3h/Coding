import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import org.junit.*;

// http://codingdojang.com/scode/408?answer_mode=hide
public class shortestDistance {
	Scanner scn = new Scanner(System.in);
	ArrayList<String> array = new ArrayList<String>(); // generic
	
	@Before
	public void setUp() {
		String input = "";
		do {
			System.out.print("���Ͻô� ���ڸ� ���ʴ�� �Է��� �ֽñ� �ٶ��ϴ�. �Է��� ��ġ�� ���ؼ��� q�� �Է��ϼ��� : ");
			input = scn.nextLine();
			if (input.equalsIgnoreCase("q")) {
				return;
			}
			array.add(input);
			System.out.println("�Է��Ͻ� ���� " + input + " �Դϴ�.");
		}while(!input.equalsIgnoreCase("q"));
	}
	
	@Test
	public void test() {
		//System.out.print(array);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=1; i<array.size(); i++) {
			int gap = Math.abs(Integer.parseInt(array.get(i)) - Integer.parseInt(array.get(i-1)));
			map.put(i, gap);
		}
		System.out.print(map);
		int result = Collections.min(map.values());
		System.out.printf("����� �ּ� �Ÿ����� %d �Դϴ�.", result);
	}

}
