package com.example.library.entity

import jakarta.persistence.*

@Entity
@Table(name = "client")
class Client
{
    @Id
    @GeneratedValue
    private val id: Long? = null

    @Column(nullable = false)
    private val name: String? = null

    @Column(nullable = false)
    private val email: String? = null


}