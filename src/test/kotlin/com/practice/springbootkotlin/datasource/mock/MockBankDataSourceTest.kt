package com.practice.springbootkotlin.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MockBankDataSourceTest {

    private val mockBankDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
        //when
        val banks = mockBankDataSource.retrieveBanks()

        //then
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    internal fun `should provide some mock data`() {
        //when
        val banks = mockBankDataSource.retrieveBanks()

        //then
        assertThat(banks).allMatch{ it.accountNumber.isNotBlank()}
        assertThat(banks).allMatch{ it.trust != 0.0}
        assertThat(banks).allMatch{ it.transactionFee != 0}

    }
}
