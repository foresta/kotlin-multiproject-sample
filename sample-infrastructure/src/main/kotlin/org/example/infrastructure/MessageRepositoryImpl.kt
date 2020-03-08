package org.example.infrastructure

import org.example.domain.Message
import org.example.domain.MessageRepository

class MessageRepositoryImpl: MessageRepository {
    override fun getMessage(): Message {
        return Message("Hello World!!")
    }
}