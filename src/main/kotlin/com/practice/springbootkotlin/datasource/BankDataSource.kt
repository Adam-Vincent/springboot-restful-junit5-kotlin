package com.practice.springbootkotlin.datasource

import com.practice.springbootkotlin.model.Bank

interface BankDataSource {

    fun retrieveBanks():Collection<Bank>

    fun retrieveBank(accountNumber: String): Bank

    fun createBank(bank: Bank): Bank

    fun updateBank(bank: Bank): Bank

    fun deleteBank(accountNumber: String)
}
