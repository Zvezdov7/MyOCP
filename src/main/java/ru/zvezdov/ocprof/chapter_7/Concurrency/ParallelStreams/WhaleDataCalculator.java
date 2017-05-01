package ru.zvezdov.ocprof.chapter_7.Concurrency.ParallelStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dmitry Zvezdov
 *         18.04.17.
 */
public class WhaleDataCalculator {
    public int processRecord(int input){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e){
            // Handle interruption
        }
        return input+1;
    }

    public void processAllData(List<Integer> data){
//        data.stream().map(this::processRecord).count();
        data.parallelStream().map(this::processRecord).count();
    }

    public static void main(String[] args) {
        WhaleDataCalculator calculator = new WhaleDataCalculator();
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < 4000; i++) {
            data.add(i);
        }

        long start = System.currentTimeMillis();
        calculator.processAllData(data);
        double time = (System.currentTimeMillis() - start)/1000.0;

        System.out.println("Task complited in: " + time + " seconds");


    }
}
