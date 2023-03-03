package chapter21.q24_4_2;

import java.time.Duration;
import java.time.LocalTime;

public class Q3 {
    private static class Runner{
        private String name;
        private LocalTime start;
        private LocalTime goal;
        Runner(String name, LocalTime start, LocalTime goal) {
            this.name = name;
            this.start = start;
            this.goal = goal;
        }
        public String getName() {
            return name;
        }
        public LocalTime getStart() {
            return start;
        }
        public LocalTime getGoal() {
            return goal;
        }
        
    }
    public static void main(String[] args) {
        Runner r1 = new Runner("田中宏", 
                                LocalTime.of(9, 12, 30), 
                                LocalTime.of(14, 15, 10));
        printRunner(r1);
        Runner r2 = new Runner("鈴木二郎", 
                                LocalTime.of(9, 35, 20), 
                                LocalTime.of(15, 44, 20));
        printRunner(r2);
        printDiff(diff(r1, r2));
    }
    public static void printRunner(Runner runner) {
        Duration d = Duration.between(runner.getStart(), runner.getGoal());
        System.out.printf("%s %d時間 %d分 %d秒%n", 
                runner.getName(), 
                d.toHoursPart(), 
                d.toMillisPart(), 
                d.toSecondsPart());
    }
    public static Duration diff(Runner r1, Runner r2) {
        Duration d1 = Duration.between(r1.getStart(), r1.getGoal());
        Duration d2 = Duration.between(r2.getStart(), r2.getGoal());
        return d1.compareTo(d2) > 0 ? d1.minus(d2): d2.minus(d1);        
    }
    public static void printDiff(Duration d) {
        System.out.printf("時間差 %d時間 %d分 %d秒%n", 
                d.toHoursPart(), 
                d.toMillisPart(), 
                d.toSecondsPart());
    }
}
