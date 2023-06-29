public class DonutStore {
   public DonutStore() {

   }

    static private long timeInterval = 1000; // 1 second
    static private long ONE_HOUR = timeInterval;
    static private long ONE_DAY = ONE_HOUR * 24;
    static private long ONE_WEEK = ONE_DAY * 7;
   static public void main(String [] args) {
    Runnable runnable = new Runnable() {
        public void run() {
            long hoursPassed = 0;
            String currentTime = whatTimeIsIt(hoursPassed);
            String currentDay = "Sunday";
            
            do {
                System.out.format("The time is %s, and all is well.\n", currentTime);

                try {
                    Thread.sleep(timeInterval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                currentTime = whatTimeIsIt(++hoursPassed);
            } while (!currentTime.equals("3am"));
        }
    };
    
    Thread thread = new Thread(runnable);
    thread.start(); 
   }

   static private String whatTimeIsIt(final long hoursPassed) {
    String time = "12am";
    if (0 == hoursPassed) time = "12 am";
    else if (1 == hoursPassed % ONE_DAY) time = "1am";
    else if (2 == hoursPassed % ONE_DAY) time = "2am";
    else if (3 == hoursPassed % ONE_DAY) time = "3am";
    // todo: continue...

    return time;
   }

   static private boolean isStoreOpen(final String currentTime) {
    final String openWhen = "9am";
    boolean isOpen = false;

    // todo: solution?
    return isOpen;
   }

   static private boolean isStoreClosed(final String currentTime) {
    final String closeWhen = "5pm";
    boolean isClosed = false;

    // todo: solution?
    return isClosed;
   }

   static private String whatDayIsIt(final long hoursPassed, final String currentDay) {
    String updatedDay = currentDay;
   
    // todo: solution to advance the day if and only another 24 hours has passed.
    return updatedDay;
   }
}
