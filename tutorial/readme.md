# Tutorial 5 Arrays

1.  Write statements for each of the following
    a.  Declare an array that used to store 12 floating point numbers.
    ```java
    float [] arr = new float [12]
    ``` 
    b.  Initialize an array that used to store the value of A to E.
    ```java
    char [] letters = {'A', 'B', 'C', 'D', 'E'}
    ```
    c.  Declare an array that used to store 100 students name.
    ```java
    String [] names = new String [100]
    ```
    d.  Declare an array for a table with 6 rows 2 columns that used to store integer value.
    ```java
    int [][] table = new int[6][2]
    ```
    e.  Initialize an array with the following value:  
	```math
	\begin{pmatrix}
	6 & 9 \\
	2 & 5 \\
	4 & 6
	\end{pmatrix}
	```
 	```java
	int [][] array = {{6,9},{2,5},{4,6}}
	```
    f.  After initialize the array, modify the value of the above array to 
	```math
	\begin{pmatrix}
	6 & 9 \\
	2 & 4 \\
	3 & 7
	\end{pmatrix}
	```
 	```java
  	array [1][1] = 4;
  	array [2][0] = 3;
  	array [2][1] = 7;
	```
    g.  Display all the values of an array name contact in separate lines.
	```java
 	for (int i = 0; i < contact.length; i++) {
 	System.out.println(contact[i]);
	```
	---
    

2.  Correct the error for the following statements.   
	a.
	```java
	//String[] code = {'AAA', 'AAB', 'AAC', 'AAD'};
 	String[] code = {"AAA", "AAB", "AAC", "AAD"};
	```
	   
	  b.
	```java
	//int[] num = new num[10]; 
	//for(int k=0; k<=num.length(); k++) 
	//sum+=num;
 	int[] num = new int[10];
 	int sum = 0;
	for(int k=0; k<num.length; k++){
	sum+=num[k];}
	```
	c.
	```java
	//int [][]t = new int[3][]; 
	//t[1][2] = 5;
 	int [][]t = new int[3][3]; 
	t[1][2] = 5;
	```
	d.
	```java
	//int i = 4;
	//int []score = new int[5];
	//score[1] = 78;
	//score[++i] = 100;
 	int i = 4;
	int []score = new int[5];
	score[1] = 78;
	score[i++] = 100;
	```
 ---

3.  Determine the values of each element of array marks. Assume the array was declared as:  
    ```java
    int[] marks = new int[5];
    int i = 0, j = 1;
    marks[i] = 12;
    marks[j] = marks[i] + 19;
    marks[j-1] = marks[j] * marks[j];
    marks[j*3] = marks[i+1];
    marks[++j] = marks[i] % 5;
    marks[2*j] = marks[j-1];
    ```
    ```java
    marks[0] = 961
    marks[1] = 31
    marks[2] = 1
    marks[3] = 31
    marks[4] = 31
    ```

---

4.  Write the statements that display the number of occurrence of the word "the" (case sensitive) in a string array name sentence.  
```java
int theCount = 0;
String[] sentence = userInput.split(" "); 
for (String word : sentence) {
if (word.equals("the")) {
theCount++;}
System.out.println("The number of occurrences of the word 'the' (case sensitive) is: " + theCount);
```
---

5.  Write the statements that display the string array name sentence in reverse order. Each string element must be displayed in reverse order as well.  
```java
String[] sentence = userInput.split(" "); 
for (int i = sentence.length - 1; i >= 0; i--) {
char[] charArray = sentence[i].toCharArray();
for (int left = 0, right = charArray.length - 1; left < right; left++, right--) {
char temp = charArray[left];
charArray[left] = charArray[right];
charArray[right] = temp;}
System.out.print(new String(charArray)+" ");
```
---

6.  Write the statements that generate 1 random integer within 0-255. Convert the number to binary and store the bit into an 8-bit array. Then, display the binary number.  
```java
Random num = new Random();
int randomNumber = num.nextInt(256); 
int[] binaryArray = new int[8];

int temp = randomNumber;
for (int i = 7; i >= 0; i--) {
    binaryArray[i] = temp % 2;
    temp = temp / 2;}

System.out.println("Decimal value: " + randomNumber);
System.out.print("Binary value: ");
for (int i = 0; i < binaryArray.length; i++) {
    System.out.print(binaryArray[i]);
```
