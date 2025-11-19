package collections;
import java.util.*;
import java.io.*;

public class PhoneToName {

	public static void main(String[] args) {
		HashMap<String, String> nameToPhone= new HashMap<>();
		HashMap<String, String> phoneToName= new HashMap<>();
		
		try {
			BufferedReader r = new BufferedReader(new FileReader("data.txt"));
			String line;
			while((line = r.readLine()) != null) {
				String[] parts = line.split("\t");
				if(parts.length==2) {
					String name = parts[0];
					String phone = parts[1];
					nameToPhone.put(name, phone);
					phoneToName.put(phone, name);
				}
			}
			
			r.close();
		}catch(Exception e){
			e.printStackTrace();
			return;
		}
		
		Scanner x = new Scanner(System.in);
		System.out.print("Enter name or phone number: ");
		String input = x.next();
		x.nextLine();
		if (nameToPhone.containsKey(input)) {
            System.out.println("Phone Number: " + nameToPhone.get(input));
        }
        else if (phoneToName.containsKey(input)) {
            System.out.println("Name: " + phoneToName.get(input));
        }
        else {
            System.out.println("No record found.");
        }

        x.close();
		

	}

}
