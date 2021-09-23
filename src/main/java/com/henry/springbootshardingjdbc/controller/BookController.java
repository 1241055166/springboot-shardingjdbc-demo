package com.henry.springbootshardingjdbc.controller;

import com.henry.springbootshardingjdbc.entity.Book;
import com.henry.springbootshardingjdbc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Henry
 * @Title class BookController
 * @Description: TODO
 * @date 2020/8/18 20:53
 */
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public List<Book> getItems(){
        return bookService.getBookList();
    }

    @RequestMapping(value = "/book",method = RequestMethod.POST)
    public Boolean saveItem(Book book){
        return bookService.save(book);
    }
}
