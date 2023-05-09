package org.generations.toDoListAssessment.controller.dto;

import java.util.Date;

public class ItemTableDTO {

    private String title;
    private String description;
    private Date targetDate;

    public ItemTableDTO (String title, String description, Date targetDate){
        this.title = title;
        this.description = description;
        this.targetDate = targetDate;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }



}
