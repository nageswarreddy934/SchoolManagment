School Management System – Student Module
A console-based Java application to manage student records in a school. This project demonstrates core Java concepts, object-oriented programming, and basic CRUD (Create, Read, Update, Delete) operations using in-memory data storage.

💡 Note: This is a foundational version using console I/O and ArrayList for data storage (no database). Ideal for learning and academic purposes. 

✨ Features
Add new student records (ID, name, age, grade, contact)
View all student details
Update existing student information
Delete a student by ID
Simple and interactive console menu
🛠️ Technologies Used
Language: Java 8+
Core Concepts: OOPs, Collections (ArrayList), Exception Handling, Encapsulation
Tools: Scanner (for input), Console output
📁 Project Structure
school-management-student/
│
├── src/
│   ├── Student/
│   │   └── Student.java          # Student model class
│   ├── schoolmanagmentservice/
│   │   └── service/
│   │       └── StudentService.java  # Business logic (CRUD operations)
│   └── StudentDriver.java        # Main driver class with menu
│
└── README.md
▶️ How to Run
Clone the repository:
bash
git clone https://github.com/your-username/school-management-student.git
cd school-management-student
Compile the Java files (from project root):
bash


1
javac -d bin src/**/*.java
Run the application:
bash


1
java -cp bin StudentDriver
Follow the on-screen menu prompts to manage student data.
🔸 Note: Data is stored in memory only. It will reset when the program exits. 

🖥️ Sample Output

WELCOME TO SCHOOLMANAGMENT SERVICE
Welcome to Student Menu
Enter 1 for add the data
Enter 2 for update the data
Enter 3 for fetch the data
Enter 4 for delete the data
Enter 5 for close the data
1
Enter Student ID: 101
Enter Name: Arjun Reddy
Enter Age: 15
Enter Grade: 10
Enter Contact: 9876543210
Student added successfully!
📝 Future Enhancements (Suggestions)
Integrate with MySQL or H2 Database for persistent storage
Add teacher, class, and attendance modules
Migrate to Spring Boot for a web-based interface
Implement file-based storage (e.g., JSON or CSV)
