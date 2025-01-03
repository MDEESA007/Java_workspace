package pack;

public class client1
{
     String name,clg;
     int regnum,sub1,sub2,sub3,sub4,sub5,sub6;
     
     public client1( String name,String clg,int regnum,int Sub1,int Sub2,int Sub3,int Sub4,int Sub5,int Sub6)
     {
        this.name=name;
        this.clg=clg;
        this.regnum=regnum;
        this.sub1=Sub1;
        this.sub2=Sub2;
        this.sub3=Sub3;
	this.sub4=Sub4;
	this.sub5=Sub5;
	this.sub6=Sub6;
      }
     public void display()
      {
       int total=sub1+sub2+sub3+sub4+sub5+sub6;
        System.out.println("Name:"+name);
        System.out.println("College:"+clg);
        System.out.println("Reg num:"+regnum);
        System.out.println("mark1:"+sub1);
       	System.out.println("mark2:"+sub2);
	System.out.println("mark3:"+sub3);
	System.out.println("mark4:"+sub4);
	System.out.println("mark5:"+sub5);
	System.out.println("mark6:"+sub6);     
        System.out.println("Total marks:"+total);
      }
}