package com.example.library.daolayer

import com.example.library.entity.Book
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.JpaRepository

@Transactional
interface BookDAO : JpaRepository<Book, Long>
{

}