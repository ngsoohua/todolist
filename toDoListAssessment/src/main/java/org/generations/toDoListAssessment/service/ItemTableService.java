package org.generations.toDoListAssessment.service;

import org.generations.toDoListAssessment.repository.entity.ItemTable;

import java.util.ArrayList;

public interface ItemTableService {


    ItemTable save(ItemTable customer);


    //Read all ItemTable from database
    ArrayList<ItemTable> all();


    //Delete ItemTable from database - based on ItemTable Id
    void delete(int itemTableId);

    //find ItemTable from database - based on ItemTable Id
    public ItemTable findById(int ItemTableId);



}
