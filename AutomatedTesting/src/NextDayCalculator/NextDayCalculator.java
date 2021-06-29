package NextDayCalculator;

public class NextDayCalculator {
     public static String showNextDay(int day, int month, int year){
         switch (month){
             case 1,3,5,7,8,10,12:
                 if(day==31){
                     if(month == 12){
                         day=1;
                         month=1;
                         year++;
                     }else {
                         day=1;
                         month++;
                     }
                 }else day++;

                 break;
             case 4,6,9,11:
                 if(day==30){
                     day=1;
                     month++;
                 }else day++;
                 break;
             case 2:
                  if(showYear(year)){
                      if(day==29){
                          day=1;
                          month++;
                      }else day++;
                  }else if(day==28){
                      day=1;
                      month++;
                  }else day++;
                  break;
             default:
                 System.out.println("hãy nhập lại tháng");

         }
         String strDay=day+"";
         String strMonth=month+"";
         String strYear=year+"";

         return strDay+"/"+strMonth+"/"+strYear;
     }
    public static boolean showYear(int year){
         if(year % 4 == 0){
             if(year % 100 == 0){
                 if(year % 400 == 0){
                     return true;
                 } else {
                     return false;
                 }
             } else {
                 return true;
             }
         } else {
             return false;
         }
     }

}
