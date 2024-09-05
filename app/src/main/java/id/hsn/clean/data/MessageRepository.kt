package id.hsn.clean.data

import id.hsn.clean.domain.MessageEntity
import id.hsn.clean.domain.MessageRepositoryInterface

class MessageRepository(private val messageDataSource: MessageDataSource) : MessageRepositoryInterface {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}