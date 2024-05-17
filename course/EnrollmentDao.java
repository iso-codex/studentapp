package studentapp.course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EnrollmentDao {
	
	private String file = "/Users/kofibonney/Documents/src/internship/studentapp/EnrollmentData.csv";
	// Instance variable 
	public Map readEnrollments() throws Exception {
//		Enrollment[] allEnrollments = new Enrollment[10];
		
		Map<Integer, Integer> studentIdToCourseId = new HashMap();
		
		BufferedReader reader = null;
		String line = "";
		
		
		try {
			reader = new BufferedReader(new FileReader(file));
//			int index = 0;
			line = reader.readLine();
			while((line = reader.readLine()) != null) {
				
				String[] row = line.split(",");
				studentIdToCourseId.put(Integer.parseInt(row[0]), Integer.parseInt(row[1]));
				
//				allEnrollments [index] = new Enrollment(Integer.parseInt(row[0]), Integer.parseInt(row[1]));
//				index++;

			}
			return studentIdToCourseId;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
				return studentIdToCourseId;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return studentIdToCourseId;
			}
		}
		
	}
}
