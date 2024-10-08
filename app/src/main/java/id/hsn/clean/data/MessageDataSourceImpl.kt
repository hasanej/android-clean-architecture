package id.hsn.clean.data

import id.hsn.clean.domain.MessageEntity

class MessageDataSourceImpl : MessageDataSource {
    override fun getMessageFromSource(name: String) =
        MessageEntity("Hi $name, welcome aboard! This is your starting point for the Clean Architecture journey.")
}