package Day15;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import javax.management.Query;

import runningApplication.ApplicationRunningInterface;

public class MainDay15 implements ApplicationRunningInterface{

    public static void main(String[] args) {
        MainDay15 mainDay15 = new MainDay15();
        mainDay15.run();
    }

    public static void runningRequestDay15() {
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



    @Override
    public void run() {
        runningRequestDay15();

    }

}
