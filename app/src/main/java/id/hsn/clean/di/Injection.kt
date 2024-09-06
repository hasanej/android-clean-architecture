package id.hsn.clean.di

import id.hsn.clean.data.MessageDataSourceImpl
import id.hsn.clean.data.MessageDataSource
import id.hsn.clean.data.MessageRepositoryImpl
import id.hsn.clean.domain.MessageInteractor
import id.hsn.clean.domain.MessageRepository
import id.hsn.clean.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): MessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepositoryImpl(messageDataSource)
    }

    private fun provideDataSource(): MessageDataSource {
        return MessageDataSourceImpl()
    }
}