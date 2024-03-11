package studentapp.actors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import studentapp.actors.Actor;

public class ActorDao {
    private static final String CSV_FILE_PATH = "src/Actors.csv";

    public List<Actor> readActors() {
        List<Actor> actors = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 4) { // Ensure there are at least four fields (firstName, lastName, contactInfo, role)
                    String firstName = data[3];
                    String lastName = data[4];
                    String contactInfo = data[10];
                    String role = data[1];
                    
                    // You may need to parse additional fields here if needed
                    Actor actor = new Actor(firstName, lastName, contactInfo, role);
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

