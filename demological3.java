class demological3
{
   public static void main(String args[])
   {
     int percentage=70;
     int attendance=80;
     int assignment=30;
     int activitymark=20;

     if((percentage>=65 && attendance>=70)||(activitymark>=25 && assignment>=25)&&(attendance==80 || activitymark>=15))
     {
        System.out.println("you win the price");
     }
     else
     {
        System.out.println("you loose the price");
     }
   }

} 