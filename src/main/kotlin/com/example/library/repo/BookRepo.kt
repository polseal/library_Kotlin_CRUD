package com.example.library.repo

import com.example.library.entity.Book
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepo : JpaRepository<Book, Long>
{
    override fun findAll(): MutableList<Book> {
        TODO("Not yet implemented")
    }
    fun findBookById(id: Long?) : Book?
    fun findBookByTitle(title: String?) : Book?
}