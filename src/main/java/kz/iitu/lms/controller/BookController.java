package kz.iitu.lms.controller;

import kz.iitu.lms.model.Book;
import kz.iitu.lms.service.iBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private iBookService iBookService;

    @GetMapping("/books/{id}")
    public Book getById(@PathVariable Long id) {
        return iBookService.getById(id);
    }

    @PostMapping("/books/create")
    public Book create(@RequestBody Book o){
        return iBookService.create(o);
    }

    @PostMapping("/books/update")
    public Book update(@RequestBody Book o){
        return iBookService.update(o);
    }

    @DeleteMapping("/books/delete/{id}")
    public void delete(@PathVariable Long id) {
        iBookService.delete(id);
    }

    @GetMapping("/books/all")
    public List<Book> getAll(){
       return iBookService.getAll();
    }

    @GetMapping("/books")
    public List<Book> getAllByName(@Param(value = "name") String name){
       return iBookService.getAllByName(name);
    }

    @GetMapping("/books/desc")
    public List<Book> getAllByDesc(@Param(value = "info") String info){
       return iBookService.getAllByDesc(info);
    }

    @GetMapping("/books/author")
    public List<Book> getAllByAuthor(@Param(value = "id") Long id){
       return iBookService.getAllByAuthor(id);
    }
}

