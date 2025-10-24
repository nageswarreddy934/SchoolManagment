package schoolmanagmentservice.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Student.Student;

public class StudentService {
	private static String url="jdbc:postgresql://localhost:5432/School";
	private static String user="postgres";
	private static String password="123";
	private static Connection connection;
	private static Scanner sc=new Scanner(System.in); 
		static {
			try {
				Class.forName("org.postgresql.Driver");
				try {
					 connection=DriverManager.getConnection(url, user, password);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public int save() {
			int res=0;
			System.out.println("enter Id:");
			int id=sc.nextInt();
			System.out.println("enter Name");
			String name=sc.next();
			System.out.println("enter Age:");
			int age=sc.nextInt();
			System.out.println("executed");
			String sql="insert into student values(?,?,?)";
			try {
				PreparedStatement pstm = connection.prepareStatement(sql);
				pstm.setInt(1, id);
				pstm.setString(2, name);
				pstm.setInt(3, age);
				res=pstm.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return res;
		}
		public int update() {
			int res=0;
			System.out.println("enter Age:");
			int age=sc.nextInt();
			System.out.println("enter Id:");
			int id=sc.nextInt();
			String sql="update student set age=? where id=?";
			try {
				PreparedStatement pstm=connection.prepareStatement(sql);
				pstm.setInt(1,age);
				pstm.setInt(2, id);
				pstm.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("data saved");
			return res;
		}
		public int delete() {
			int res=1;
			
			System.out.println("enter Id:");
			int id=sc.nextInt();
			String sql="delete from student where id=?";
			try {
				PreparedStatement pstm=connection.prepareStatement(sql);
				pstm.setInt(1, id);
				pstm.executeUpdate();
				System.out.println(id+"deleted");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return res;
		}
		public List<Student>fetchall(){
			List<Student>list=new ArrayList<Student>();
			String sql="SELECT * from student";
			try {
				Statement stm=connection.createStatement();
				ResultSet resultset=stm.executeQuery(sql);
				while(resultset.next()) {
					list.add(new Student(resultset.getInt(1),resultset.getString(2),resultset.getInt(3)));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return list;
			
		}
		public void exit() {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
}


