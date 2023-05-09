package org.generations.toDoListAssessment.controller;

import org.generations.toDoListAssessment.controller.dto.ItemTableDTO;
import org.generations.toDoListAssessment.repository.entity.ItemTable;
import org.generations.toDoListAssessment.service.ItemTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Date;


@RestController
@RequestMapping("/itemTable")
public class ItemTableController {

    private final ItemTableService itemTableService;

    public ItemTableController(@Autowired ItemTableService itemTableService){

        this.itemTableService = itemTableService;

    }


    @CrossOrigin
    @GetMapping("/all")
    public Iterable<ItemTable> getItemTable(){

        return itemTableService.all();
    }

    @CrossOrigin
    @PostMapping("/add")
    public void save(  @RequestParam(name="title", required = true) String title,
                       @RequestParam(name="description", required = true) String description,
                       @RequestParam(name="targetDate", required = true) Date targetDate) throws IOException
    {


        //String fullPath = imageFolder + "/" + imageUrl;
        ItemTableDTO itemTableDTO = new ItemTableDTO(title, description, targetDate);
        itemTableService.save(new ItemTable(itemTableDTO));

        System.out.println("In all");
    }











}

