package org.generations.toDoListAssessment.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.generations.toDoListAssessment.controller.dto.ItemTableDTO;

import java.text.SimpleDateFormat;
import java.util.Date;


@Entity
public class ItemTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;
    private Date targetDate;

    public ItemTable(){

    }


    public ItemTable(ItemTableDTO itemTableDTO){

        this.title = itemTableDTO.getTitle();
        this.description = itemTableDTO.getDescription();
        this.targetDate = itemTableDTO.getTargetDate();
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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


    @Override
    public String toString()
    {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "ItemTable{" + "id=" + id + ", title='" + title + '\'' + ", description='" +
                description+ '\'' + "targetDate= '" + dateFormat.format(targetDate) + '\'' +'}';
    }



}
