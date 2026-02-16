package model;
import java.time.LocalDateTime;

public class Defect {
    private String defectID;
    private String description;
    private String status;
    private String priority;
    private String assignedTo; //developer assigned to resolve
    private LocalDateTime createdDate;
    private LocalDateTime resolvedDate;

    public Defect(String defectID, String description, String priority,String assignedTo) {
        this.defectID = defectID;
        this.description = description;
        this.status = "Open"; // Default status when defect is created
        this.priority = priority;
        this.assignedTo = assignedTo;
        this.createdDate = LocalDateTime.now();
        this.resolvedDate = null; // Set to null initially
    }

    // Get and set methods for defectID
    public String getDefectID() {
        return defectID;
    }

    public void setDefectID(String defectID) {
        this.defectID = defectID;
    }

    // Get and set methods for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Get and set methods for status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        if (status.equalsIgnoreCase("Resolved")){
            resolvedDate =LocalDateTime.now(); // Automatically set resolved date when status changes
        }
    }

    // Get and set methods for priority
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    //Get and seet methods for assignedTo
    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    // Get and set methods for createdDate
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    // Get and set methods for resolvedDate
    public LocalDateTime getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(LocalDateTime resolvedDate) {
        this.resolvedDate = resolvedDate;
    }


}
