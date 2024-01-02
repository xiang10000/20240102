package npu.main;
import java.util.ArrayList;

import npu.classroom.*;
import npu.course.*;
import npu.person.*;
public class Runme {

	public static void main(String[] args) {
	
		//PcRoom E607=new PcRoom(57,"Windows 11");
		//System.out.printf("Pc Room is %s%n",E607.toString());
		/*
		Std[] MyStd=new Std[50];
		MyStd[0].set_StdNo("1109412345");
		MyStd[1].set_StdNo("1109412344");
		*/
		ArrayList<Std> ReturnData =new ArrayList<>();
		Teacher Xteacher=new Teacher("James Johnson");	
		DepCourse OOP=new DepCourse("物件導向程式設計",3,Xteacher);
		
		//設定修課學生,初始化
		Std std01=new Std("1109412345","王小明"," 男");
		Std std02=new Std("1109412344","王小美"," 女");
		Std std03=new Std("1109412343","陳小飛"," 男");
		
		//與課程關聯,放入課程
		OOP.setMyStd(std01);
		OOP.setMyStd(std02);
		OOP.setMyStd(std03);
		
		//印出課程基本資料,不含學生
		System.out.printf("%s%n", OOP.toString());
		
		//取出修課學生
		ReturnData=OOP.getMyStd();
		
		for (var Std:ReturnData) {
			System.out.printf("學生資料%s%n",Std.toString());
		   					
		}
		
	
	}

}
