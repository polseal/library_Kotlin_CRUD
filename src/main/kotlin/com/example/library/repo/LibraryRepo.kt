package com.example.library.repo

import com.example.library.entity.Book
import com.example.library.entity.Library
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.sql.Timestamp

@Repository
interface LibraryRepo : JpaRepository<Library, Long>
{
    @Modifying
    @Query(value = "INSERT INTO library (client_id, book_id, timestamp, status) VALUES (:clientId, :bookId, :timestamp, :status)", nativeQuery = true)
    fun borrowBook(
        @Param("clientId") clientId: Long,
        @Param("bookId") bookId: Long,
        @Param("timestamp") timestamp: Timestamp? = Timestamp(System.currentTimeMillis()),
        @Param("status") status: Boolean = false
    )

    @Modifying
    @Query(value = "INSERT INTO library (client_id, book_id, timestamp, status) VALUES (:clientId, :bookId, :timestamp, :status)", nativeQuery = true)
    fun returnBook(
        @Param("clientId") clientId: Long,
        @Param("bookId") bookId: Long,
        @Param("timestamp") timestamp: Timestamp? = Timestamp(System.currentTimeMillis()),
        @Param("status") status: Boolean = true
    )

    @Query("SELECT l.client.id FROM Library l WHERE l.book.id = :bookId AND l.away = true ORDER BY l.dated DESC")
    fun findClientIdByBookIdAndStatus(bookId: Long): Long?

}