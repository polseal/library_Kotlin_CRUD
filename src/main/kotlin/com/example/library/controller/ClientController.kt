package com.example.library.controller

import com.example.library.entity.Client
import com.example.library.service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/clients"])
class ClientController
{
    @Autowired
    var clientService: ClientService? = null

    @RequestMapping(method = [RequestMethod.GET])
    fun getClients(): List<Client?>? {
        return clientService?.getAllClients()
    }

    @RequestMapping(method = [RequestMethod.POST])
    @ResponseStatus(HttpStatus.CREATED)
    fun insertPerson(@Validated @RequestBody client: Client): Client? {
        return clientService?.save(client)
    }

}