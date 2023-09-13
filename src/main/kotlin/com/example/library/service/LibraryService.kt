package com.example.library.service

interface LibraryService {

    fun borrowBook(bookId: Long)

    fun returnBook(bookId: Long)
}