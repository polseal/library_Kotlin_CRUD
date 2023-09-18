package com.example.library.controller

import com.example.library.entity.Book
import com.example.library.service.BookServiceImpl
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping(path = ["/books"])
class BookController
{
    val bookService: BookServiceImpl? = null

    @GetMapping("/")
    fun index(): String? {
        return "Starting page"
    }

    @PostMapping("/new")
    fun save(@RequestBody book: Book?): ResponseEntity<*>? {
        return if (book == null) ResponseEntity.badRequest()
            .body<String>("The provided book is not valid") else ResponseEntity.status(HttpStatus.CREATED)
            .body(bookService?.saveBook(book))
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long?): ResponseEntity<*>? {
        return if (id == null) ResponseEntity.badRequest().body<String>("The provided id is not valid")
        else ResponseEntity.status(HttpStatus.NO_CONTENT).body(bookService?.deleteBook(id))
    }



}