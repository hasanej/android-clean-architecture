package id.hsn.clean.data

import id.hsn.clean.domain.MessageRepository

class MessageRepositoryImpl(private val messageDataSource: MessageDataSource) : MessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}