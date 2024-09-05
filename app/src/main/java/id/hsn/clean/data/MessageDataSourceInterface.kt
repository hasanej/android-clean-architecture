package id.hsn.clean.data

import id.hsn.clean.domain.MessageEntity

interface MessageDataSourceInterface {
    fun getMessageFromSource(name: String): MessageEntity
}