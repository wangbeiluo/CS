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
			System.out.println("������ѧ����������");
			String name = scan.nextLine();
			System.out.println("������ѧ������ѧ�ɼ���");
			int math = scan.nextInt();
			System.out.println("������ѧ�������ĳɼ���");
			int ch = scan.nextInt();
			System.out.println("������ѧ����Ӣ��ɼ���");
			int en = scan.nextInt();
			System.out.print("������" + name + "\n" + "��ѧ�ɼ� ��" + math + "\n" +
			"���ĳɼ���" + ch + "\n" + "Ӣ��ɼ���" + en + "\n" + "����ƽ���ɼ�:��" + (math + ch + en)/3 + "\n");
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
		System.out.println("ÿ��ƽ���ɼ����£�" + "\n" + "��ѧ��" + maths_num/count +
				"\n" + "���ģ�" + chs_num/count +
				"\n" + "Ӣ�" + ens_num/count);
	}
}

