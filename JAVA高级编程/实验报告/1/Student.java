package Work;
import java.util.Scanner;
public class Student {
	public static final int count = 3;
	public static void main(String[] args)
	{
		String names[] = new String[count];
		int maths[] = new int[count];
		int chs[] = new int[count];
		int ens[] = new int[count];		
		for(int i=0;i<count;i++)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入学生的姓名：");
			String name = scan.nextLine();
			System.out.println("请输入学生的数学成绩：");
			int math = scan.nextInt();
			System.out.println("请输入学生的语文成绩：");
			int ch = scan.nextInt();
			System.out.println("请输入学生的英语成绩：");
			int en = scan.nextInt();
			System.out.print("姓名：" + name + "\n" + "数学成绩 ：" + math + "\n" +
			"语文成绩：" + ch + "\n" + "英语成绩：" + en + "\n" + "个人平均成绩:：" + (math + ch + en)/3 + "\n");
			names[i] = name;
			maths[i] = math;
			chs[i] = ch;
			ens[i] = en;
		}
		int maths_num = 0;
		int chs_num = 0;
		int ens_num = 0;
		for(int i=0;i<count;i++)
		{
			maths_num += maths[i];
			chs_num += chs[i];
			ens_num += ens[i];
		}
		System.out.println("每课平均成绩如下：" + "\n" + "数学：" + maths_num/count +
				"\n" + "语文：" + chs_num/count +
				"\n" + "英语：" + ens_num/count);
	}
}

