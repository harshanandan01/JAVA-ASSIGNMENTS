package Assign4;

public class ThirtyMinus {
    public static final int arr[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String thirtyMin(String signUp, int year){
        String temp[] = signUp.split("-");
        int date = Integer.parseInt(temp[0]);
        int mon = Integer.parseInt(temp[1]);

        int prevMon = mon-1;
        int dd=0;
        int mm=0;
        int yy=year;
        if(mon==1){prevMon=12; yy-=1;}
        if(arr[prevMon]==30){ dd = date; mm = prevMon;}
        else if(arr[prevMon]==31){ dd = date+1; mm = prevMon;}
        else if(arr[prevMon]==28){ dd = date-2; mm = prevMon;}
        String temp1 = Integer.toString(dd);
        if(temp1.length()==1){temp1='0'+Integer.toString(dd);}

        String temp2 = Integer.toString(mm);
        if(temp2.length()==1){temp2='0'+Integer.toString(mm);}
        String ans = temp1+"-"+temp2+"-"+Integer.toString(yy);
        return ans;
    }
}
