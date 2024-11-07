class sample
{
    String name,college,city,edu;
    int age;
        sample(String name,int age,String college,String city,String edu)
        {
            this.name=name;
            this.age=age;
            this.college=college;
            this.city=city;
            this.edu=edu;
         }

        public void display()
        {
             System.out.println(name);
             System.out.println(age);
             System.out.println(college);
             System.out.println(city);
             System.out.println(edu);
         }


}

class this2
{
     public static void main(String args[])
     {
       sample obj= new sample("Eesa",20,"mahendra","salem","BE");
       obj.display();
       sample obj1=new sample("mohammed",19,"sona","chennai","MBA");     
       obj1.display();
        System.out.println(obj1.name);
     }

}
