package com.example.library.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table


@Entity
@Table(name = "book")
class Book
{
    @Id
    @GeneratedValue
    private val id: Long? = null
}
