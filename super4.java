class sample
{
         sample( String name,String clg,String dept,int age,int num,int regnum)
	 {
	     System.out.println(name);
	     System.out.println(clg);
             System.out.println(dept);
	     System.out.println(age);
             System.out.println(num);
	     System.out.println(regnum);
            this.display("salem",636302,86);
            System.out.println("            ");
          }
          public void display(String loca,int pincode,int percentage)
          {
              System.out.println(loca);
              System.out.println(pincode);
              System.out.println(percentage);
          }

}

class sample1 extends sample
{    
      sample1( String name,String clg,String dept,int age,int num,int regnum)
       {
           super("Mohammed eesa","Mahendra","B.tech-IT",20,874984451,222071062);
	    System.out.println(name);
	    System.out.println(clg);
            System.out.println(dept);
	    System.out.println(age);
            System.out.println(num);
           System.out.println(regnum);
          System.out.println("            ");
        }
}


class sample2 extends sample1
{    
      sample2( String name,String clg,String dept,int age,int num,int regnum)
       {
        super("salman","knowledge","B.tech-IT",20,874984451,222071063);
	    System.out.println(name);
	    System.out.println(clg);
            System.out.println(dept);
	    System.out.println(age);
            System.out.println(num);
            System.out.println(regnum);
            System.out.println("            ");
        }
}


class super4
{
      public static void main(String args[])
      {
	  sample2 obj=new sample2("Vignesh","Mahendra","MCA",21,878887786,228401064); 
      }
}