package org.example.web

import org.example.application.MessageService
import org.example.infrastructure.MessageRepositoryImpl

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

        val service = MessageService(MessageRepositoryImpl())
        val message = service.getMessage()
        println(message)
    }

}