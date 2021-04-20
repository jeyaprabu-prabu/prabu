package Performance_tes;

public class test_speed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long StartTime=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("java");
		for(int i=1; i<=1000000; i++)
		{
			sb.append("programming");
		}
		long EndTime = System.currentTimeMillis();
		System.out.println((EndTime - StartTime )+"ms");

	}

}
