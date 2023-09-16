package com.example.library.controller
import com.example.library.service.LibraryService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = arrayOf("/library"))
class LibraryController
{
    private val libraryService: LibraryService? = null

    @PostMapping("/rent")
    @RequestMapping(method = [RequestMethod.POST])
    fun borrowBook(@RequestParam("client_id") client_id: Long, @RequestParam("book_id") book_id: Long): Unit? {
        return libraryService?.borrowBook(book_id, client_id)
    }

    @PostMapping("/return")
    @RequestMapping(method = [RequestMethod.POST])
    fun returnBook(@RequestParam("client_id") client_id: Long, @RequestParam("book_id") book_id: Long): Unit? {
        return libraryService?.returnBook(book_id)
    }



}