class sample
  {
    sample(int age,boolean id)
	{
	   if(age<18)
	     {
		 System.out.println("Not eligible to vote");
	     }
	   else
	     {
		System.out.println("Eligible to vote check the id");

		if(id==true)
		{
		   System.out.println("Eligible to vote");
		}
		else
		{
		   System.out.println("Submit proper id to vote");
		}

	     }

	}

 }


class demonested
 {
    public static void main(String asd[])
	{
	   new sample(22,false);
	}
 }