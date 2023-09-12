package com.example.library.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "author")
class Author {
    @Id
    @GeneratedValue
    private val id: Long? = null
}