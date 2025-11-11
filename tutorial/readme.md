# Tutorial 5 Arrays

1.  Write statements for each of the following
    a.  Declare an array that used to store 12 floating point numbers.
    b.  Initialize an array that used to store the value of A to E.
    c.  Declare an array that used to store 100 students name.
    d.  Declare an array for a table with 6 rows 2 columns that used to store integer value.
    e.  Initialize an array with the following value:
        $$
        \begin{pmatrix}
        6 & 9 \\
        2 & 5 \\
        4 & 6
        \end{pmatrix}
        $$
    f.  After initialize the array, modify the value of the above array to
        $$
        \begin{pmatrix}
        6 & 9 \\
        2 & 4 \\
        3 & 7
        \end{pmatrix}
        $$
    g.  Display all the values of an array name contact in separate lines.

2.  Correct the error for the following statements.  

	a.
	```java
	String[] code = {'AAA', 'AAB', 'AAC', 'AAD'};
	```
	   
	  b.
	```java
	int[] num = new num[10]; 
	for(int k=0; k<=num.length(); k++) 
	sum+=num;
	```
	c.
	```java
	int [][]t = new int[3][]; 
	t[1][2] = 5;
	```
	d.
	```java
	int i = 4;
	int []score = new int[5];
	score[1] = 78;
	score[++i] = 100;
	```

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

4.  Write the statements that display the number of occurrence of the word "the" (case sensitive) in a string array name sentence.

5.  Write the statements that display the string array name sentence in reverse order. Each string element must be displayed in reverse order as well.

6.  Write the statements that generate 1 random integer within 0-255. Convert the number to binary and store the bit into an 8-bit array. Then, display the binary number.
