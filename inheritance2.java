class sample
 {
     String name,bank,branch,city,qual,clg;
     int age,accno,num,bal;
          sample()
          {
               accno=1219120000;  
               bank="canara bank";
               branch="suramangalam";
               name="Mohammed Eesa";
               age=20; 
               num=876056667;
               city="salem";
               qual="B.Tech-IT";
               clg="Mahendra"; 
         
               System.out.println("MOHAMMED EESA DETAILS::");                            
               System.out.println("                                ");
               System.out.println("Account number:"+accno);  
               System.out.println("bank name:"+bank); 
               System.out.println("branch:"+branch);
               System.out.println("Name:"+name);  
               System.out.println("Age:"+age); 
               System.out.println("Number:"+num);
               System.out.println("city:"+city);  
               System.out.println("qualification:"+qual); 
               System.out.println("college:"+clg);
               System.out.println("                                 ");
           }

            public void display(int accno,String bank,String branch,String name,int age,int num,String city,String qual,String clg)
            {
                System.out.println("VIGNESH DETAILS::");                              
                 System.out.println("                                ");
                 System.out.println("Account number:"+accno);  
                 System.out.println("bank name:"+bank); 
                 System.out.println("branch:"+branch);
                 System.out.println("Name:"+name);  
                 System.out.println("Age:"+age); 
                 System.out.println("Number:"+num);
                 System.out.println("city:"+city);  
                 System.out.println("qualification:"+qual); 
                 System.out.println("college:"+clg);
                 System.out.println("                                 ");
           }
}

class sample1 extends sample
{
            sample1()
            {
               accno=173686775;
               bank="indian bank";
               branch="gandhipuram";

               System.out.println("ANOTHER DETAILS::");                              
               System.out.println("                                ");
               System.out.println("Account number:"+accno);  
               System.out.println("bank name:"+bank); 
               System.out.println("branch:"+branch);
               System.out.println("Name:"+name);  
               System.out.println("Age:"+age); 
               System.out.println("Number:"+num);
               System.out.println("city:"+city);  
               System.out.println("qualification:"+qual); 
               System.out.println("college:"+clg);
               System.out.println("                                 ");

            }
        
            public void display1(int accno,String bank,String branch,String name,int age,int num,String city,String qual,String clg)
            {
               System.out.println("MOHAMMED  SALMAN DETAILS::");                              
               System.out.println("                            ");
               System.out.println("Account number:"+accno);  
               System.out.println("bank name:"+bank); 
               System.out.println("branch:"+branch);
               System.out.println("Name:"+name);  
               System.out.println("Age:"+age); 
               System.out.println("Number:"+num);
               System.out.println("city:"+city);  
               System.out.println("qualification:"+qual);
               System.out.println("college:"+clg);
               System.out.println("                                 ");
            }
  }

class inheritance2
{
       public static void main(String args[])
       {
             sample1 obj=new sample1();
             obj.display(1454844841,"state bank of india","rasipuram","vignesh",21,689655537,"namakkal","MCA","knowledge");
             obj.display1(178655775,"bank of baroda","attur","mohammed salman",19,748965679,"salem","B.Tech-IT","sona");
       }
}
         
