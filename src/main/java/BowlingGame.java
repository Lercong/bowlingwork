import java.util.Scanner;

public class BowlingGame {
	
	int count=1;
	Scanner sc=new Scanner(System.in);
	int fenshu;
	int fenshu2;
	int fujia,fujia2;
	int jieguo;
	int a=-1,b=-1;
	int flag=0,flags;
	static int chengji=0,chengji1,chengji2,chengji3,chengji4,chengji5,chengji6,chengji7,chengji8;
	public static void main(String[] args) {
		BowlingGame t =new BowlingGame();
		t.getBowling(); 
		
		System.out.println("��Ϸ�������ܳɼ�Ϊ"+(chengji-chengji2));
		
	}
   public int getBowlingScore(String bowlingCode) {
    	
        return 0;
    }
	private void getBowling() {
		// TODO Auto-generated method stub	
		
		while(count<12) {
		fenshu=sc.nextInt();
		
		if(fenshu<10&&fenshu>-1)
		{
		    System.out.println("��"+count+"�ֵ�1�λ���,����Ϊ:"+fenshu);
		    this.Second();
		    
		    if(count-a>1) {
		    	flag=0;
		    }else {
		    	flag-=10;
		    }
		   if(count==10&&fenshu2!=10) {
			   break;
		   }
		}
		else if(fenshu==10)
		{
			 System.out.println("��"+count+"�ֵ�1�λ���,����Ϊ:"+fenshu+"���������λ�����ᣬ���ֽ�����");
			  a=count;
			 flag+=10;
		}
		else
		{
			System.out.println("�������,��������");
			continue;
		}
	
		
		  if(count==a&&flag==30&&count!=1) {
			chengji4=30;
			System.out.println("��44"+(count-2)+"�ָ������λ������������ܷ���Ϊ"+chengji4);
			chengji=chengji+chengji4;
			
		}else if(count==a+1&&flag==20&&count!=1) {
			chengji5=20+fenshu;
			chengji6=10+fenshu+fenshu2;

			System.out.println("��66"+(count-2)+"�ָ������λ������������ܷ���Ϊ"+chengji5);
			chengji=chengji+chengji5;
			System.out.println("��77"+(count-1)+"�ָ������λ������������ܷ���Ϊ"+chengji6);
			chengji=chengji+chengji6;
			//flag=0;
		}else if(count==a+1) {
			this.jisuan1();
			
		}else if(count==a&&flag==40&&count!=1&&count!=2) {
			this.jisuan4();
		}
		  
		if(count==b+1)
		{
			
			this.jisuan3();
		}
		count++;
		
		System.out.println("-----------------------------��Ϸ�ɼ�Ϊ"+chengji);
	}
		
	return;
}

	private void jisuan4() {
		// TODO Auto-generated method stub
		System.out.println("��pp"+(count-2)+"�ָ������λ������������ܷ���Ϊ"+chengji1);
		chengji=chengji+chengji1;
		flag-=10;
	}

	private void jisuan3() {
		// TODO Auto-generated method stub
		chengji3=10+fenshu;
		System.out.println("��"+b+"�ָ���һ�λ������������ܷ���Ϊ"+chengji3);
		chengji=chengji+chengji3;
	}

	private void jisuan2() {
		// TODO Auto-generated method stub
		chengji2=fenshu+fenshu2;
		System.out.println("��"+count+"�ֻ���������ܷ���Ϊ"+chengji2);
		chengji=chengji+chengji2;
	}

	private void jisuan1() {
		// TODO Auto-generated method stub
		chengji1=10+fenshu+fenshu2;
		
		System.out.println("��"+a+"�ָ������λ������������ܷ���Ϊ"+chengji1);
		chengji=chengji+chengji1;
	}

	private void Second() {
		// TODO Auto-generated method stub
		fenshu2=sc.nextInt();
		if(fenshu2<10&&fenshu2>-1)
		{
		    System.out.println("��"+count+"�ֵ�2�λ���,����Ϊ:"+fenshu2);
		    this.jisuan2();
		}
		else if(fenshu2==10)
		{
			System.out.println("��"+count+"�ֵ�2�λ���,����Ϊ:"+fenshu2+"������һ�λ�����ᣬ���ֽ�����");
			b=count;
		}
		else
		{
			System.out.println("�������,��������");
		    this.Second();
		}
	}
}
