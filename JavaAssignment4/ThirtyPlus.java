package Assign4;

public class ThirtyPlus {
    public static final int arr[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String thirtyPlus(String signUp, String currDate, int year){
        String temp[] = signUp.split("-");
        String tempp[] = currDate.split("-");

        int date = Integer.parseInt(temp[0]);
        int mon = Integer.parseInt(temp[1]);

        int date1 = Integer.parseInt(tempp[0]);
        int mon1 = Integer.parseInt(tempp[1]);

        int nextMon = mon+1;
        int dd=0;
        int mm=0;
        int yy=year;

        if(mon==12){nextMon=1; yy+=1;}
        if(arr[mon]==30){ dd = date; mm = nextMon;}
        else if(arr[mon]==31){ dd = date-1; mm = nextMon;}
        else if(arr[mon]==28){ dd = date+2; mm = nextMon;}

        if((mon1<mon) || (mon1==mon && date1<=date)){dd = date1; mm = mon1;}

        String temp1 = Integer.toString(dd);
        if(temp1.length()==1){temp1='0'+Integer.toString(dd);}

        String temp2 = Integer.toString(mm);
        if(temp2.length()==1){temp2='0'+Integer.toString(mm);}
        String ans = temp1+"-"+temp2+"-"+Integer.toString(yy);
        return ans;
    }

}
