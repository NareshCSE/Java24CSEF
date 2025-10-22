package javaprog;
import java.util.Scanner;
public class Eight_exp {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.next();

boolean[] used = new boolean[10];
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
if (ch >= '0' && ch <= '9') {
used[ch - '0'] = true; // mark digit as used
}
}

int[] digits = new int[10];
int count = 0;
for (int i = 0; i < 10; i++) {
if (used[i]) {
digits[count++] = i; // collect unique digits
}
}

if (count == 0) {
System.out.println(-1);
return;
}

// Sort digits in descending order
for (int i = 0; i < count - 1; i++) {
for (int j = i + 1; j < count; j++) {
if (digits[i] < digits[j]) {
int temp = digits[i];
digits[i] = digits[j];
digits[j] = temp;
}
}
}

// Find the smallest even digit to place at the end
int evenIndex = -1;
for (int i = count - 1; i >= 0; i--) {
if (digits[i] % 2 == 0) {
evenIndex = i;
break;
}
}

if (evenIndex == -1) {
System.out.println(-1); // no even digit found
return;
}

// Build largest even number
StringBuilder sb = new StringBuilder();
for (int i = 0; i < count; i++) {
if (i != evenIndex) sb.append(digits[i]);
}
sb.append(digits[evenIndex]); // append even digit at the end

System.out.println(sb.toString());
sc.close();
}
}
