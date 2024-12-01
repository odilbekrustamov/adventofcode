package year2024.d01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day1Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> valuesList = new ArrayList<>();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                break;
            }
            String[] parts = line.split("\\s+");
            valuesList.add(Integer.parseInt(parts[0]));
            Integer key = Integer.parseInt(parts[1]);
            frequencyMap.put(key, frequencyMap.getOrDefault(key, 0) + 1);
        }

        int totalProductSum = 0;

        for (int i = 0; i < valuesList.size(); i++) {
            int currentValue = valuesList.get(i);
            int frequency = frequencyMap.getOrDefault(currentValue, 0);
            totalProductSum += currentValue * frequency;
        }

        System.out.println(totalProductSum);
    }
}
