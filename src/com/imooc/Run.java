package com.imooc;
import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars= {new PassengerCar("奥迪A4",500,4),new PassengerCar("马自达6",400,4),new PickUp("皮卡雪6",450,4,2),new PassengerCar("金龙",800,20),new ThingsCar("松花江",400,4),new ThingsCar("依维柯",1000,20)};
		Scanner a=new Scanner(System.in);
		System.out.println("欢迎使用嗒嗒租车系统:\n您是否要租车：1.是       0.否");
		int b=a.nextInt();
		if(b==1) {
			System.out.println("您可租车的类型及其价目表：");
			System.out.println("序号	汽车名称	租金（元/天）	容量");
			for(int i=1;i<=cars.length;i++) {
				System.out.print(i+"	"+cars[i-1].getName()+"	"+cars[i-1].getRent()+"	");
				cars[i-1].getVolume();
			}
			System.out.println("请输入您要租车的数量：");
			Scanner l=new Scanner(System.in);
			int c=l.nextInt();
			int [] d=new int[c];
			for(int i=0;i<c;i++) {
				System.out.println("请输入第"+(i+1)+"辆车的序号：");
				int k=a.nextInt();
				d[i]=k;
			}
			System.out.println("请输入租车天数：");
			Scanner m=new Scanner(System.in);
			int x=m.nextInt();
			System.out.println("您的账单：");
			System.out.println("***可载人的车有：");
			int money=0;
			int count1=0;
			for(int i=0;i<d.length;i++) {
				if(1<=d[i]&&d[i]<=4) {
					System.out.print(cars[d[i]-1].getName()+"	");
					count1+=cars[d[i]-1].getPeopleVolume();
					money+=cars[d[i]-1].getRent();
				}
			}
			System.out.println("共载人："+count1+"人");
			System.out.println("***载货的车有：");
			int count2=0;
			for(int i=0;i<d.length;i++) {
				if((5<=d[i]&&d[i]<=6)||d[i]==3) {
					System.out.print(cars[d[i]-1].getName()+"	");
					count2+=cars[d[i]-1].getThingsVolume();
					money+=cars[d[i]-1].getRent();
				}
			}
			System.out.println("共载货："+count2+"吨");
			System.out.println("***租车总价格："+(money*x)+"元");
		}
		else
			System.out.println("系统已退出");
	}

}
