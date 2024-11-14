

public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        String hours;
        String minutes;
        char h0,h1,m1,m2;
        int totalMinutes,totalHours;
        int newhour,newMinutes;
        //first i will find the original hours,minutes, and minutes to add
        if(time.charAt(0)=='0')
        {
            h1 =time.charAt(1);
            hours = String.valueOf(h1);
        }
        else
        {
            h0 = time.charAt(0);
            h1= time.charAt(1);
            hours = String.valueOf(h0)+String.valueOf(h1);
        }
        
        if(time.charAt(3)=='0')
        {
            m2 =time.charAt(4);
            minutes = String.valueOf(m2);
        }
        else
        {
            m1 = time.charAt(3);
            m2= time.charAt(4);
            minutes = String.valueOf(m1)+String.valueOf(m2);
        }
        totalMinutes = Integer.parseInt(minutes)+minutesToAdd+ Integer.parseInt(hours)*60;
        totalHours = totalMinutes/60;
        newhour = (totalHours)%24;
        newMinutes = totalMinutes-(totalHours*60);
        
        if((newhour<10)&&(newMinutes<10))
        {
            System.out.println("0"+newhour+":"+"0"+newMinutes);
            System. exit(0);
        }
        else {
            if((newhour<10)&&(newMinutes>10))
            {
                System.out.println("0"+newhour+":"+newMinutes);
                System. exit(0);
            }
            if((newhour>10)&&(newMinutes<10))
            {
            System.out.println(newhour+":"+"0"+newMinutes);
            System. exit(0) ;
            }
      System.out.println(newhour+":"+newMinutes);
    }
}
}