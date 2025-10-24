package Driver;

import java.util.List;
import java.util.Scanner;

import Student.Student;
import schoolmanagmentservice.service.StudentService;

public class StudentDriver {

	public static void main(String[] args) {
		StudentService service=new StudentService();
		System.out.println("WELCOME TO SCHOOLMANAGMENT SERVICE");
		
		System.out.println("Welcome to Student Menu");
		System.out.println("Enter 1 for add the data");
		System.out.println("Enter 2 for update the data");
		System.out.println("Enter 3 for fetch the data");
		System.out.println("Enter 4 for delete the data");
		System.out.println("Enter 5 for close the data");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			service.save();
			break;
		case 2:
			service.update();
			break;
		case 3:
			List<Student> list=service.fetchall();
			if(list!=null) {
				for(Student student:list) {
					System.out.println(student);
				}
			}
			break;
		case 4:
			service.delete();
			break;
		case 5:
			service.exit();
			break;
			default:
				System.out.println("invalid input");
				break;
	
		}
		

	}

}
