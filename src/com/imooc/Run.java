package com.imooc;
import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars= {new PassengerCar("�µ�A4",500,4),new PassengerCar("���Դ�6",400,4),new PickUp("Ƥ��ѩ6",450,4,2),new PassengerCar("����",800,20),new ThingsCar("�ɻ���",400,4),new ThingsCar("��ά��",1000,20)};
		Scanner a=new Scanner(System.in);
		System.out.println("��ӭʹ�����⳵ϵͳ:\n���Ƿ�Ҫ�⳵��1.��       0.��");
		int b=a.nextInt();
		if(b==1) {
			System.out.println("�����⳵�����ͼ����Ŀ��");
			System.out.println("���	��������	���Ԫ/�죩	����");
			for(int i=1;i<=cars.length;i++) {
				System.out.print(i+"	"+cars[i-1].getName()+"	"+cars[i-1].getRent()+"	");
				cars[i-1].getVolume();
			}
			System.out.println("��������Ҫ�⳵��������");
			Scanner l=new Scanner(System.in);
			int c=l.nextInt();
			int [] d=new int[c];
			for(int i=0;i<c;i++) {
				System.out.println("�������"+(i+1)+"��������ţ�");
				int k=a.nextInt();
				d[i]=k;
			}
			System.out.println("�������⳵������");
			Scanner m=new Scanner(System.in);
			int x=m.nextInt();
			System.out.println("�����˵���");
			System.out.println("***�����˵ĳ��У�");
			int money=0;
			int count1=0;
			for(int i=0;i<d.length;i++) {
				if(1<=d[i]&&d[i]<=4) {
					System.out.print(cars[d[i]-1].getName()+"	");
					count1+=cars[d[i]-1].getPeopleVolume();
					money+=cars[d[i]-1].getRent();
				}
			}
			System.out.println("�����ˣ�"+count1+"��");
			System.out.println("***�ػ��ĳ��У�");
			int count2=0;
			for(int i=0;i<d.length;i++) {
				if((5<=d[i]&&d[i]<=6)||d[i]==3) {
					System.out.print(cars[d[i]-1].getName()+"	");
					count2+=cars[d[i]-1].getThingsVolume();
					money+=cars[d[i]-1].getRent();
				}
			}
			System.out.println("���ػ���"+count2+"��");
			System.out.println("***�⳵�ܼ۸�"+(money*x)+"Ԫ");
		}
		else
			System.out.println("ϵͳ���˳�");
	}

}
