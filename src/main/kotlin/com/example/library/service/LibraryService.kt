package com.example.library.service

interface LibraryService {

    fun borrowBook(bookId: Long, clientId: Long)
    fun returnBook(bookId: Long)
}