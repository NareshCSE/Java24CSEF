package assignment_problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class TextFilePhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> nameToPhone = new HashMap<>();
        HashMap<String, String> phoneToName = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("contacts.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\t");
                if (parts.length >= 2) {
                    String name = parts[0];
                    String phone = parts[1];
                    nameToPhone.put(name, phone);
                    phoneToName.put(phone, name);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name or phone number:");
        String input = scanner.nextLine();

        if (nameToPhone.containsKey(input)) {
            System.out.println("Phone number: " + nameToPhone.get(input));
        } else if (phoneToName.containsKey(input)) {
            System.out.println("Name: " + phoneToName.get(input));
        } else {
            System.out.println("No matching record found.");
        }
        scanner.close();
    }
}