package studentapp.course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CourseDao {
	
//	private String file = "C:\\Users\\Iso-Codex\\Downloads\\coursedataset.csv";
	private String file = "/Users/kofibonney/Documents/src/internship/studentapp/coursedataset.csv";


	public Course[] readCourses() throws Exception {
		Course[] allCourses = new Course[10];
		BufferedReader reader = null;
		String line = "";
		
		
		try {
			reader = new BufferedReader(new FileReader(file));
			int index = 0;
			line = reader.readLine();
			while((line = reader.readLine()) != null) {
				
				String[] row = line.split(",");
//				Course(int row, String name, String details, int credits, int duration)
				allCourses [index] = new Course(Integer.parseInt(row[1]), row[0], row[2], Integer.parseInt(row[3]), Integer.parseInt(row[4]));
				index++;
//				for(String text : row) {
//					System.out.printf("%-10s", text);
//				}
//				System.out.println();
			}
			return allCourses;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
				return allCourses;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return allCourses;
			}
		}
		
	}
	
	
}

