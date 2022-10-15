import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//stringExample();
		arrayListExample();

	}

	private static void arrayListExample() {
		// TODO Auto-generated method stub
		Integer[] ar = new Integer[10];
		System.out.println("The length of array is "+ar.length);
		
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("The size of the array list is "+al.size());
		
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println("The size of the array list is "+al.size());
		for (int i:al) {
			System.out.print(i+",");
		}
		System.out.println();
		
		al.set(1, 100);
		for (int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+",");
		}
		System.out.println();
		
		al.add(0,200);
		for (int i:al) {
			System.out.print(i+",");
		}
		System.out.println();
		
		
		
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		for (int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+",");
		}
		System.out.println();
		
		
		al.remove(1);
		for (int i:al) {
			System.out.print(i+",");
		}
		System.out.println();
		System.out.println("The size of the array list is "+al.size());
		
		ArrayList al2 = new ArrayList();
		al2.add(1);
		al2.add("second");
		al2.add(true);
		al2.add(12.3);
		
		for (Object ele:al2) {
			System.out.print(ele+",");
		}
		System.out.println();
		
		al2.remove(12.3);
		for (Object ele:al2) {
			System.out.print(ele+",");
		}
		System.out.println();
		
		al2.remove(1);
		for (Object ele:al2) {
			System.out.print(ele+",");
		}
	}

	private static void stringExample() {
		// TODO Auto-generated method stub
		String s;
		String s1 = "abc";
		String s2 = "def";
		s = s1 + s2;
		System.out.println(s);
		
		s = "a;fja;sfja;sfjsafsakfsa'afsfsakhsaff;sahfsalfsafh";
		String[] sa = s.split("sa");
		System.out.println("split string \""+s+"\" by \"sa\": ");
		for (String substr:sa) {
			System.out.print(substr+" ");
		}
		System.out.println();
		
		int pos = s.indexOf("sa");
		System.out.println(pos);
		
		while (pos>=0) {
			pos = s.indexOf("sa", pos+2);
			System.out.println(pos);
		}
		
		int lastpos = s.lastIndexOf("sa");
		System.out.println(lastpos);
		
		
		String substr = s.substring(5, 10);
		System.out.println(substr);
		
		int a = Integer.parseInt("123");
		System.out.println(a);
		
		double d = Double.parseDouble("123");
		System.out.println(d);
		
		boolean b = Boolean.parseBoolean("adfaf");
		System.out.println(b);
	}

}
