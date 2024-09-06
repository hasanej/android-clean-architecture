package id.hsn.clean.data

import id.hsn.clean.domain.MessageEntity

interface MessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}