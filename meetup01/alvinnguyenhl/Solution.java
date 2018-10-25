package meetup01.alvinnguyenhl;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class Solution {
    
    
    private static void one() {
        try {
            Scanner scan = new Scanner(new File("chapter1/big.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("one.txt"));

            Stack<String> myStack = new Stack<>();

            while (scan.hasNextLine()) {
                myStack.push(scan.nextLine());
            }

            while (!myStack.isEmpty()) {
                writer.write(myStack.pop());
                writer.newLine();;
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    private static void two() {
        try {
            Scanner scan = new Scanner(new File("chapter1/big.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("two.txt"));
            Stack<String> myStack = new Stack<>();
            int lineCounter = 0;
            
            while(scan.hasNextLine()) {
                lineCounter++;
                myStack.push(scan.nextLine());
                
                if(lineCounter == 50) {
                    while(!myStack.isEmpty()) {
                        writer.write(myStack.pop());
                        writer.newLine();
                    }
                    lineCounter = 0;
                }
            }
            
            while(!myStack.isEmpty()) {
                writer.write(myStack.pop());
                writer.newLine();
            }
            
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private static void three() {
        try {
            Scanner scan = new Scanner(new File("chapter1/big.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("one.txt"));

            ArrayList<String> myStack = new ArrayList<String>();
            ArrayQueue<String> queue = new ArrayQueue<>(42);
            int counter = 0;
            while (scan.hasNextLine()) {
                String line = scan.next();
                if(line.length() == 0 && counter > 42) {
                    queue.remove();
                } else {
                    counter++;
                    queue.add(line);
                }
                    
            }

            while (!myStack.isEmpty()) {
                writer.write(myStack.pop());
                writer.newLine();;
            }
            
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("One Start:" + LocalDateTime.now());
        one();
        System.out.println("One End:" + LocalDateTime.now());

        System.out.println("Two Start:" + LocalDateTime.now());
        two();
        System.out.println("Two End:" + LocalDateTime.now());
        
        
    }
}
