package com.example.library.service

import com.example.library.entity.Book
import com.example.library.repo.BookRepo
import org.springframework.stereotype.Service

@Service
interface BookService
{
     fun isBookInLibrary(book_id: Long): Boolean
     fun getBookByTitle(title : String) : Book?
     fun saveBook(book: Book?): Book?
     fun deleteBook(bookId: Long?)

}