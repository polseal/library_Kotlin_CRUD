package com.example.library.service

import com.example.library.daolayer.BookDAO
import org.springframework.stereotype.Service

@Service
class BookService(val repository: BookDAO)
{

}