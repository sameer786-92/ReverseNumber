Here's the step-by-step explanation of the logic:

The program starts by creating a Scanner object to read user input from the console.

It prompts the user to enter a number using System.out.print("Enter Number: ");.

The entered number is read using int n = sc.nextInt();.

Two integer variables are initialized: rev to store the reversed number, and r to temporarily store the remainder when dividing the original number by 10.

The program enters a while loop with the condition n > 0. This loop will continue executing as long as the value of n is greater than 0.

Inside the loop:

r = n % 10; calculates the remainder when the number n is divided by 10. This remainder is the last digit of the number.
rev = rev * 10 + r; updates the rev variable by multiplying its current value by 10 (shifting its digits to the left) and then adding the value of r. This effectively adds the current digit to the reversed number.
n /= 10; updates the value of n by performing integer division by 10. This removes the last digit from n as it shifts the digits to the right.
The loop continues to execute until the value of n becomes 0, effectively reversing all the digits of the original number.

After the loop completes, the program prints the reversed number using System.out.print("Reversed Number Is: " + rev);.
