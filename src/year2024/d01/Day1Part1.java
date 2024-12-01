package year2024.d01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day1Part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                break;
            }
            String[] parts = line.split("\\s+");
            leftList.add(Integer.parseInt(parts[0]));
            rightList.add(Integer.parseInt(parts[1]));
        }

        leftList.sort(Collections.reverseOrder());
        rightList.sort(Collections.reverseOrder());

        int totalDistance = 0;
        for (int i = 0; i < leftList.size(); i++) {
            totalDistance += Math.abs(leftList.get(i) - rightList.get(i));
        }
        System.out.println(totalDistance);
    }
}
