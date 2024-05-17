package studentapp.actors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ActorDao {
//    private static final String CSV_FILE_PATH = "src/Actors.csv";
    private static final String CSV_FILE_PATH = "/Users/kofibonney/Documents/src/internship/studentapp/Actors.csv";

    public List<Actor> readActors() {
        List<Actor> actors = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String line;
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 11) { // Ensure there are at least four fields (firstName, lastName, contactInfo, role)
                    
                	ContactInfo contactInfo = new ContactInfo(data[3], data[4], data[5], data[6], data[7], data[8], data[9], data[10], data[2]);
                    String role = data[1];
                    int id = Integer.parseInt(data[0]);
                    String password = data[11];
                    
                    Actor actor = new Actor(id, role, contactInfo, password);
                    actors.add(actor);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return actors;
    }

    public static void main(String[] args) {
        ActorDao actorDao = new ActorDao();
        List<Actor> actors = actorDao.readActors();
        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }
}

