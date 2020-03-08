package org.example.application

import org.example.domain.MessageRepository

class MessageService(private val repository: MessageRepository) {
    fun getMessage(): String {
        return repository.getMessage().asString()
    }
}
