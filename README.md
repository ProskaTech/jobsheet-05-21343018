## Object-oriented Programming 05: Get Input from Keyboard
> Created by Anita Nursi &nbsp;&middot;&nbsp;
> Student ID Number: 21343018 &nbsp;&middot;&nbsp;
> Majority of Informatics &nbsp;&middot;&nbsp;
> Faculcity of Engineering &nbsp;&middot;&nbsp;
> Universitas Negeri Padang
---
# #1 Scanner
The Scanner class is used to get user input, and it is found in the java.util package.

```
// Library
import java.util.Scanner;
```

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings.

![image](https://user-images.githubusercontent.com/112265105/191425724-123ecfcc-7b22-44dc-947f-b0239af82895.png)
---
# #2 BufferedReader
```
// Library
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

```
The BufferedReader class of the java.io package can be used with other readers to read data (in characters) more efficiently. In order to create a BufferedReader, we must import the java.io.BuferedReader package first. Once we import the package, here is how we can create the reader.

```
// Creates a FileReader
FileReader file = new FileReader(String file);

// Creates a BufferedReader
BufferedReader buffer = new BufferedReader(file);
```
---
# #3 JOptionPane
```
// Library
import javax.swing.JOptionPane;
```
JOptionPane makes it easy to pop up a standard dialog box that prompts users for a value or informs them of something. While the JOptionPane class may appear complex because of the large number of methods, almost all uses of this class are one-line calls to one of the static showXxxDialog methods shown below:

![image](https://user-images.githubusercontent.com/112265105/191426933-91218fd8-3d33-42cd-a98a-efbeeb0e0a73.png)
---

### Source
> https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
<br> https://www.programiz.com/java-programming/bufferedreader
<br> https://www.w3schools.com/java/java_user_input.asp
---
