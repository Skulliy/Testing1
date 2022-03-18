package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Test;

public class testPhysics {
    @Test
    public void test1() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("C:\\Users\\moheh\\IdeaProjects\\TEsting\\src\\Test\\input1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int [][] tall = new int [100][3];
        int i = 0;
        int n = scanner.nextInt();
        while(scanner.hasNextInt())
        {
            tall[i][0] = scanner.nextInt();
            tall[i][1] = scanner.nextInt();
            tall[i][2] = scanner.nextInt();
            i++;
        }
        assertTrue (Physics.physics(n,tall) == "NO");
    }
    @Test
    public void test2() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("C:\\Users\\moheh\\IdeaProjects\\TEsting\\src\\Test\\input2.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int [][] tall = new int [100][3];
        int i = 0;
        int n = scanner.nextInt();
        while(scanner.hasNextInt())
        {
            tall[i][0] = scanner.nextInt();
            tall[i][1] = scanner.nextInt();
            tall[i][2] = scanner.nextInt();
            i++;
        }
        assertTrue (Physics.physics(n,tall) == "YES");
    }
}
