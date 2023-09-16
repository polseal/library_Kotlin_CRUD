package com.example.library.service

import com.example.library.entity.Client
import com.example.library.repo.LibraryRepo
import org.springframework.stereotype.Service

@Service
interface ClientService
{
    fun getUserLogs(id: Int): List<LibraryRepo?>?
    fun getAllClients(): List<Client?>?
    fun save(client: Client): Client?
}