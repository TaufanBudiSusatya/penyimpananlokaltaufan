package com.example.taufanpenyimpananlokal.model

interface NoteRepository {
    fun addNote(note: Note)
    fun getNote(fileName: String): Note
    fun deleteNote(fileName: String): Boolean
}