package DataAndTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTimeApps {

	public static void main(String[] args) throws InterruptedException {
		dataFormat();
		 timeForProgramRun();
		 timeForProgramRunUsingDate();
		 
		 GregorianCalendar gcalendar = new GregorianCalendar();
		System.out.println(gcalendar.get(Calendar.MONTH));
		System.out.println(gcalendar.get(Calendar.DAY_OF_MONTH));
		int year = gcalendar.get(Calendar.YEAR);
		if(gcalendar.isLeapYear(year)) {
			System.out.println(year + " LeapYear ");
		}else {
			System.out.println(year + " not a  LeapYear ");
		}
		 
		 
	}

	private static void timeForProgramRunUsingDate() {

           long StartTime = new Date().getTime();
           try {
			Thread.currentThread().sleep(202);
		} catch (InterruptedException e) {
			System.out.println(" thread exeption " + e.getMessage());
			e.printStackTrace();
		}
           long endTime = new Date().getTime();
           System.out.println("\n time for program run " + (endTime - StartTime) + " milliseconds");
	}

	private static void timeForProgramRun() throws InterruptedException {
		long currentTimeMillis = System.currentTimeMillis();
		long start = currentTimeMillis;
	        
	    Thread.currentThread().sleep(20);
	      for(int i = 1;i <= 10;i++) {
	          System.out.println("Случайное число №" + i + ": " + (int)(Math.random() *10));
	      }

	  
	      long timeWorkCode = System.currentTimeMillis() - start;  
	    
	      System.out.println("Скорость выполнения программы: " + timeWorkCode + " миллисекунд");
	}

	private static void dataFormat() throws InterruptedException {
		Date date = new Date();
		Thread.currentThread().sleep(5000);
		//System.out.println(date.toString());
		Date date1 = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd ' and a time ' hh:mm:ss a zzz");
		System.out.println(sdf.format(date));
		System.out.println(sdf.format(date1));
	}

}
