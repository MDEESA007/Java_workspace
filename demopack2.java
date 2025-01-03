import pack.client1;

class student extends client1
{
       student(String name,String clg,int regnum,int Sub1,int Sub2,int Sub3,int Sub4,int Sub5,int Sub6)
     {
         super(name,clg,regnum,Sub1,Sub2,Sub3,Sub4,Sub5,Sub6);
     }
}

class demopack2
{
     public static void main(String args[])
     {
         student obj=new student("Mohammed Eesa","MEC",222071062,40,50,60,70,80,90);
         obj.display();
     }
}