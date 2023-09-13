package com.example.library.entity

import jakarta.persistence.*


@Entity
@Table(name = "book")
class Book {
    @Id
    @GeneratedValue
    private val id: Long? = null

    @Column(nullable = false)
    private val title: String? = null

    @Column(nullable = false)
    private val year: Int? = null

    @Column(nullable = false)
    private val publisher: Int? = null


}

