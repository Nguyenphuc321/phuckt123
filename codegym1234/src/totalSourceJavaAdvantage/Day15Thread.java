package totalSourceJavaAdvantage;

//public class Day15Thread {
//}
public class Day15Thread{

    public static void main(String[] args) {
        SubThreadTime subThreadTime = new SubThreadTime();
        Thread threadTime = new Thread() {
            @Override
            public void run() {
                subThreadTime.showTime(1);
            }
        };
        Thread threadData = new Thread() {
            @Override
            public void run() {
                subThreadTime.showDataAFile();
            }
        };
        threadTime.start();
        threadData.start();
    }
}
