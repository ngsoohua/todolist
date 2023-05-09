package org.generations.toDoListAssessment.service;


import org.generations.toDoListAssessment.repository.ItemTableRepository;
import org.generations.toDoListAssessment.repository.entity.ItemTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Service
public class ItemTableServiceMySQL implements ItemTableService{

    private final ItemTableRepository itemTableRepository;

    //Dependency Injection of another class object to this class object can be done with
    // @Autowired annotation


    public ItemTableServiceMySQL(@Autowired ItemTableRepository itemTableRepository)
    {
        this.itemTableRepository = itemTableRepository;
    }


    @Override
    public ItemTable save(ItemTable customer)
    {
        //since we have done the dependency injection we can now call any method from CRUDRepository

        return itemTableRepository.save(customer);
    }



    @Override
    public ArrayList<ItemTable> all()
    {
        ArrayList<ItemTable> result = new ArrayList<>();
        itemTableRepository.findAll().forEach(result::add);
        return result;
    }


    @Override
    public void delete(int customerId)
    {
        itemTableRepository.deleteById(customerId);
    }



    @Override
    public ItemTable findById(int customerId)
    {

        //Optional is a list that accepts either a null(empty), or with item
        Optional<ItemTable> itemTable = itemTableRepository.findById(customerId);
        ItemTable itemTableResponse = itemTable.get();
        return itemTableResponse;
    }



}
