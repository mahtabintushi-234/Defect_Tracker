package model;

import static org.junit.jupiter.api.Assertions.*;

import model.Defect;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class DefectTest {

    @Test
    public void testDefectConstructor() {
        Defect defect = new Defect("D001", "NullPointerException in UserService", "Critical", "John Doe");

        // Verify attributes
        assertEquals("D001", defect.getDefectID());
        assertEquals("NullPointerException in UserService", defect.getDescription());
        assertEquals("Critical", defect.getPriority());
        assertEquals("John Doe", defect.getAssignedTo());

        // Verify default values
        assertEquals("Open", defect.getStatus()); // Default status should be "Open"
        assertNull(defect.getResolvedDate()); // resolvedDate should be null initially
    }
    @Test
    public void testSettersAndGetters() {
        Defect defect = new Defect("D001", "NullPointerException", "Critical", "John Doe");

        // Update attributes using setters
        defect.setDescription("ArrayIndexOutOfBoundsException");
        defect.setPriority("Major");
        defect.setAssignedTo("Jane Smith");
        defect.setStatus("In Progress");

        // Verify that the getters return the updated values
        assertEquals("ArrayIndexOutOfBoundsException", defect.getDescription());
        assertEquals("Major", defect.getPriority());
        assertEquals("Jane Smith", defect.getAssignedTo());
        assertEquals("In Progress", defect.getStatus()); // status should be updated
    }
    @Test
    public void testSetStatusResolved() {
        Defect defect = new Defect("D001", "NullPointerException", "Critical", "John Doe");

        // Ensure that the initial status is "Open"
        assertEquals("Open", defect.getStatus());
        assertNull(defect.getResolvedDate()); // Initially null

        // Set status to "Resolved"
        defect.setStatus("Resolved");

        // Verify that the status is "Resolved" and resolvedDate is set
        assertEquals("Resolved", defect.getStatus());
        assertNotNull(defect.getResolvedDate()); // resolvedDate should now be set
    }
    @Test
    public void testSetStatusNotResolved() {
        Defect defect = new Defect("D001", "NullPointerException", "Critical", "John Doe");

        // Ensure that the initial status is "Open"
        assertEquals("Open", defect.getStatus());
        assertNull(defect.getResolvedDate()); // Initially null

        // Set status to something other than "Resolved"
        defect.setStatus("In Progress");

        // Verify that the status is "In Progress" and resolvedDate is still null
        assertEquals("In Progress", defect.getStatus());
        assertNull(defect.getResolvedDate()); // resolvedDate should still be null
    }
    @Test
    public void testSetAssignedTo() {
        Defect defect = new Defect("D001", "NullPointerException", "Critical", "John Doe");

        // Assign a new developer
        defect.setAssignedTo("Jane Smith");

        // Verify that the defect is now assigned to "Jane Smith"
        assertEquals("Jane Smith", defect.getAssignedTo());
    }
    @Test
    public void testSetCreatedDate() {
        Defect defect = new Defect("D001", "NullPointerException", "Critical", "John Doe");

        // Create a new date
        LocalDateTime newCreatedDate = LocalDateTime.of(2023, 8, 1, 10, 30, 0, 0);
        defect.setCreatedDate(newCreatedDate);

        // Verify that the created date is updated
        assertEquals(newCreatedDate, defect.getCreatedDate());
    }

    @Test
    public void testReassignDefectAfterResolved() {
        Defect defect = new Defect("D001", "NullPointerException", "Critical", "John Doe");
        defect.setStatus("Resolved");
        defect.setAssignedTo("Jane Smith");
        assertEquals("Jane Smith", defect.getAssignedTo()); // After resolution, reassign
    }


}
