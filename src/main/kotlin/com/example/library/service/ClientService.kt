package com.example.library.service

import com.example.library.repo.LibraryLogsRepo
import org.springframework.stereotype.Service

@Service
interface ClientService
{
    fun getUserLogs(id: Int): List<LibraryLogsRepo?>?
}