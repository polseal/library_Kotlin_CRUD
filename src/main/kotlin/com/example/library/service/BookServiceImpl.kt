package com.example.library.service

import com.example.library.entity.Book
import com.example.library.repo.BookRepo

class BookServiceImpl : BookService  {
    override fun isBookInLibrary(bookId: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun getBookByID(bookId: String): BookRepo {
        TODO("Not yet implemented")
    }

    override fun getBookByName(bookId: String): BookRepo {
        TODO("Not yet implemented")
    }

    override fun searchBooks(searchText: String?): List<Book?>? {
        TODO("Not yet implemented")
    }

    override fun saveBook(bookRepo: BookRepo?, changedByUsername: String?): Book? {
        TODO("Not yet implemented")
    }
}