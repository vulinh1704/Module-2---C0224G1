public class Main {
    public static void main(String[] args) {
//        MovablePoint movablePoint = new MovablePoint(1.5f, 2.4f);
//        System.out.println(movablePoint.move());

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 100000000; i++) {
            if(i % 2 == 0) {
                System.out.println("Hello");
            }
        }
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}