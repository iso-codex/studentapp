package studentapp.actors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ActorDao {
    private static final String CSV_FILE_PATH = "\\Actors.csv";

    public List<Actor> readActors() {
        List<Actor> actors = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 2) { // Ensure there are at least two fields (ID and name)
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    // You can parse additional fields here if needed
                    Actor actor = new Actor(id, name);
                    actors.add(actor);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return actors;
    }
}
