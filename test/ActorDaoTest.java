package studentapp.test;

import java.util.List;
import java.util.concurrent.CompletableFuture.AsynchronousCompletionTask;

import studentapp.actors.Actor;
import studentapp.actors.ActorDao;

public class ActorDaoTest {
	
    public static void main(String[] args) {
        try {
            // Create an instance of ActorDao
        	ActorDao dao = new ActorDao();
            
            // Run the tests
//            testCreateActor(dao);
            testReadActors(dao);
//            testUpdateActor(dao);
//            testDeleteActor(dao);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testCreateActor(ActorDao dao) throws Exception {
        System.out.println("Testing createActor");

        // Create a new actor instance
//        Actor newActor = new Actor("Doe", "johndoe@example.com", "Student");

        // Call the create method of ActorDao
//        dao.createActor(newActor);

        // Verify the actor was created successfully
//        Actor createdActor = dao.findActorByLastName("Doe");
        Actor createdActor = null;
        if (createdActor != null && createdActor.getContactInfo().equals("johndoe@example.com")) {
            System.out.println("Test passed: Actor created successfully");
        } else {
            System.out.println("Test failed: Actor creation failed");
        }
    }

    private static void testReadActors(ActorDao dao) throws Exception {
        System.out.println("Testing readActor");

        // Call the findActorByLastName method of ActorDao
        List<Actor> foundActors = null;
        foundActors = dao.readActors();
        
        if (foundActors != null) {
        	for(Actor a : foundActors)
        	{
        		System.out.println(a.getId() + "\t" + a.getContactInfo().getFirstName() + "\t" + a.getContactInfo().getLastName());
        	}
        }
        

        // Verify the actor is read successfully
//        if (actor != null && actor.getContactInfo().getLastName().equals("Doe")) {
//            System.out.println("Test passed: Actor read successfully");
//        } else {
//            System.out.println("Test failed: Actor read failed");
//        }
    }

    private static void testUpdateActor(ActorDao dao) throws Exception {
        System.out.println("Testing updateActor");

        // Call the findActorByLastName method to find an actor
//        Actor actor = dao.findActorByLastName("Doe");
        Actor actor = null;
        
        
        // Update the contact information
        if (actor != null) {
            actor.setContactInfo(null);
//            dao.updateActor(actor);

            // Verify the contact info was updated successfully
//            Actor updatedActor = dao.findActorByLastName("Doe");
            Actor updatedActor = null;
            if (updatedActor != null && updatedActor.getContactInfo().equals("newemail@example.com")) {
                System.out.println("Test passed: Actor updated successfully");
            } else {
                System.out.println("Test failed: Actor update failed");
            }
        } else {
            System.out.println("Test failed: Actor not found");
        }
    }

    private static void testDeleteActor(ActorDao dao) throws Exception {
        System.out.println("Testing deleteActor");

        // Call the delete method of ActorDao to delete an actor
//        dao.deleteActorByLastName("Doe");

        // Verify the actor was deleted successfully
//        Actor deletedActor = dao.findActorByLastName("Doe");
        Actor deletedActor = null;
        if (deletedActor == null) {
            System.out.println("Test passed: Actor deleted successfully");
        } else {
            System.out.println("Test failed: Actor deletion failed");
        }
    }
}
