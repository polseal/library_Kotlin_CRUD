package com.example.library.entity
import jakarta.persistence.*


@Entity
@Table(name = "book")
class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    internal val id: Long? = null

    @Column(nullable = false)
    internal val title: String? = null

    @Column(nullable = false)
    internal val year: Int? = null

    @Column(nullable = false)
    internal val author: String? = null

    @Column(nullable = false)
    internal val publisher: String? = null

    @Column(nullable = false)
    internal var available: Boolean? = null


}

