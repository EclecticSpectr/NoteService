package ru.netology.NoteService

open class Base(
    var id: Int,
    var isDeleting: Boolean = false,
    var userId: Int
)