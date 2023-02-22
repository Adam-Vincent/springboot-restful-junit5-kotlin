package com.practice.springbootkotlin.service

import com.practice.springbootkotlin.datasource.BankDataSource
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private val dataSource: BankDataSource = mockk(relaxed = true)

    private val bankService = BankService(dataSource)

    @Test
    internal fun `should call its data source to retrive banks`() {
        //when
        bankService.getBanks()

        //then
        verify (exactly = 1){ dataSource.retrieveBanks() }
    }
}
