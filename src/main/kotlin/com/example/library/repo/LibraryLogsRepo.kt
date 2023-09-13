package com.example.library.repo

import com.example.library.entity.Book
import com.example.library.entity.LibraryLogs
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LibraryLogsRepo : JpaRepository<LibraryLogs, Long>
{

}