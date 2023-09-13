package com.example.library.service

import com.example.library.entity.Book
import com.example.library.repo.BookRepo
import org.springframework.stereotype.Service

@Service
interface BookService
{
     fun isBookInLibrary(bookId : String) : Boolean
     fun getBookByID(bookId : String) : BookRepo
     fun getBookByName(bookId : String) : BookRepo
     fun searchBooks(searchText: String?): List<Book?>?
     fun saveBook(bookRepo: BookRepo?, changedByUsername: String?): Book?

}