package com.example.library.entity

import jakarta.persistence.*
import java.sql.Timestamp


@Entity
@Table(name="library_logs")
class LibraryLogs
{
    @Id
    @GeneratedValue
    private val index: Long? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", insertable = false, updatable = false)
    private val book: Book? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", insertable = false, updatable = false)
    private val client: Client? = null

    @Column(name = "timestamp")
    private val dated: Timestamp? = null

    @Column(name = "taken")
    private val away: Boolean? = null


}