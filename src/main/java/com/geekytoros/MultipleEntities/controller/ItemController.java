
package com.geekytoros.MultipleEntities.controller;

import com.geekytoros.MultipleEntities.entity.Item;
import com.geekytoros.MultipleEntities.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemController {
    @Autowired
    private ItemRepository iRepo;
    @GetMapping("add_item")
    private String addItem(Model model){
        Item item = new Item();
        model.addAttribute("item", item);
        return "add-item";
    }
    @PostMapping("/save_item")
    private String saveItem(Item item){
        iRepo.save(item);
       return "redirect:/add-item";
    }
}
