package com.example.library.service

import com.example.library.entity.Book
import com.example.library.repo.BookRepo

class BookServiceImpl : BookService  {

    val  bookRepository : BookRepo? = null

    override fun isBookInLibrary(book_id: Long): Boolean {
        val bookFromLibrary = bookRepository?.findById(book_id)
            ?: return false
        return true
    }

    override fun getBookByTitle(title: String): Book? {
        return bookRepository?.findBookByTitleIgnoreCase(title)
    }

    override fun saveBook(book: Book?): Book? {
        return book?.let { bookRepository?.save(it) }
    }

    override fun deleteBook(bookId: Long?)
    {
        val bookFromLibrary = bookRepository?.findById(bookId)
            ?: throw IllegalArgumentException("Book with id $bookId not found")

        bookRepository?.delete(bookFromLibrary)

    }

}