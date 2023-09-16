package com.example.library.repo

import com.example.library.entity.Book
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface BookRepo : JpaRepository<Book, Long>
{
    fun findById(id: Long?) : Book?
    @Modifying
    @Query("update Book b set b.available = :status where b.id = :id")
    fun updateBookAvailability(id: Long?, status: Boolean)

    fun findBookByTitleIgnoreCase(title: String): Book?
}