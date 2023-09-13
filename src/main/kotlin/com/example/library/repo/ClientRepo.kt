package com.example.library.repo

import com.example.library.entity.Client
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepo : JpaRepository<Client, Long>
{
    fun findClientByEmail(email: String?): Client?
    fun findClientByName(name: String?): Client?

}