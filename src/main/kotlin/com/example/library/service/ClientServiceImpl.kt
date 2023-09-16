package com.example.library.service

import com.example.library.entity.Client
import com.example.library.repo.ClientRepo
import com.example.library.repo.LibraryRepo
import org.springframework.beans.factory.annotation.Autowired

class ClientServiceImpl : ClientService {

    @Autowired
    internal var clientRepository: ClientRepo? = null
    override fun getUserLogs(id: Int): List<LibraryRepo?>? {
        TODO("Not yet implemented")
    }

    override fun getAllClients(): List<Client?>? {
        return clientRepository?.findAll()
    }

    override fun save(client: Client): Client? {
       return clientRepository?.save(client)
    }
}