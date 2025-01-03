abstract class sample
{
      abstract public void method1(String name,String clg,int regnum,String city,String qual,int num);
      abstract public void method2(String name,String clg,int regnum,String city,String qual,int num);
      abstract public void method3(String name,String clg,int regnum,String city,String qual,int num);
}

class display extends sample
{
       public void method1(String name,String clg,int regnum,String city,String qual,int num)
       {
          System.out.println(name);
          System.out.println(clg);
          System.out.println(regnum);
          System.out.println(city);
          System.out.println(qual);
          System.out.println(num);
          System.out.println("        ");
       }
       public void method2(String name,String clg,int regnum,String city,String qual,int num)
       {
          System.out.println(name);
          System.out.println(clg);
          System.out.println(regnum);
          System.out.println(city);
          System.out.println(qual);
          System.out.println(num);
          System.out.println("        ");
       }
       public void method3(String name,String clg,int regnum,String city,String qual,int num)  
       {
          System.out.println(name);
          System.out.println(clg);
          System.out.println(regnum);
          System.out.println(city);
          System.out.println(qual);
          System.out.println(num);
       }
}

class abstract2
{
     public static void main(String args[])
      {
           display obj=new display();
           obj.method1("Mohammed Eesa","Mahendra Engineering College",222071062,"Salem","B.Tech-IT",876056678);
           obj.method2("Antony","Knowledge Institute of Technology",122759008,"Salem","B.Tech-AI&DS",753448900);
           obj.method3("Mohammed Aslam","SRM university",222071061,"Chennai","B.Tech-IT",948952773);
     }
}
