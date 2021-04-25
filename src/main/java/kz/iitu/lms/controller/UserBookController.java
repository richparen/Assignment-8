package kz.iitu.lms.controller;

import kz.iitu.lms.model.Userbooks;
import kz.iitu.lms.service.iUserBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserBookController {

    @Autowired
    private iUserBookService iUserBookService;

    @PostMapping("/userbooks/create")
    public Userbooks create(@RequestBody Userbooks o){
        return iUserBookService.create(o);
    }

    @PutMapping("/userbooks/update")
    public Userbooks update(@RequestBody Userbooks o){
        return iUserBookService.update(o);
    }

    @GetMapping("/userbooks/{id}")
    public Userbooks get(@PathVariable Long id){
        return iUserBookService.getById(id);
    }

    @DeleteMapping("userbooks/delete/{id}")
    public void deleteById(@PathVariable Long id){
         iUserBookService.deleteById(id);
    }

    @GetMapping("/userbooks")
    public List<Userbooks> getAll(){
        return iUserBookService.getAll();
    }

    @GetMapping("/userbooks/user")
    public List<Userbooks> getAllByUser(@Param(value = "id") Long id){
        return iUserBookService.getAllByUser(id);
    }

    @GetMapping("/userbooks/book")
    public List<Userbooks> getAllByBook(@Param(value = "id") Long id){
        return iUserBookService.getAllByBook(id);
    }
}


