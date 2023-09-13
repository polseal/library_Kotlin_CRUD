package com.example.library.entity

import jakarta.persistence.*
import java.sql.Timestamp


@Entity
@Table(name="status")
class Status
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private val id = 0

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private val book: Book? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private val user: Client? = null

    @Column(name = "dated")
    private val dated: Timestamp? = null
}