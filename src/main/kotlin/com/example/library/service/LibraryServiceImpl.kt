package com.example.library.service

import com.example.library.repo.BookRepo
import com.example.library.repo.ClientRepo
import com.example.library.repo.LibraryRepo

class LibraryServiceImpl : LibraryService {

    val clientRepository: ClientRepo? = null
    val bookRepository: BookRepo? = null
    val libraryRepo: LibraryRepo? = null
    override fun borrowBook(bookId: Long, clientId: Long) {

        val client = clientRepository?.findById(clientId)
                ?: throw IllegalArgumentException("Client does not exist!")
        val bookToRent = bookRepository?.findById(bookId)
            ?: throw  IllegalArgumentException("Client does not exist!")
        updateBookAvailabilityWhenRentingAndSaveToDb(bookId)
        libraryRepo?.borrowBook(clientId, bookId)

    }

    override fun returnBook(bookId: Long) {
        updateBookAvailabilityWhenReturningAndSaveToDb(bookId)
        //докрутить логику, не просто id последнего клиента, который взял книгу, он ее еще не должен был вернуть
        val clientId: Long? = libraryRepo?.findClientIdByBookIdAndStatus(bookId)
        if (clientId != null) {
            libraryRepo?.returnBook(clientId, bookId)
        }
    }

    private fun updateBookAvailabilityWhenRentingAndSaveToDb(bookId: Long) {
        bookRepository?.updateBookAvailability(bookId, false)
    }
    private fun updateBookAvailabilityWhenReturningAndSaveToDb(bookId: Long) {
        bookRepository?.updateBookAvailability(bookId, true)
    }
}