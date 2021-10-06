package org.crazyit.firstboot.controller;

import org.crazyit.firstboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class BookController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tip", "欢迎访问第一个Spring Boot应用");
        return "hello";
    }

    @GetMapping("/rest")
    @ResponseBody
    public ResponseEntity restIndex() {
        return new ResponseEntity<>("欢迎访问第一个Spring Boot应用", null, HttpStatus.OK);
    }
    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public String addBook(Book book, Model model) {
        bookService.addBook(book);
        return "redirect:listBooks";
    }

    @PostMapping("/rest/books")
    @ResponseBody
    public ResponseEntity<Map<String, String>> restAddBook(@RequestBody Book book) {

    }
}
