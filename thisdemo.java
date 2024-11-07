class sample
{
  String nam;
  int ages;
  
    sample(String name,int age)
    {
       this.nam=name;
       this.ages=age;
        System.out.println(this.nam);
        System.out.println(this.ages);
     }
}


class demothis    
{
    public static void main(String args[])
    {
      sample obj=new sample("eesa",20);
      
    }
}