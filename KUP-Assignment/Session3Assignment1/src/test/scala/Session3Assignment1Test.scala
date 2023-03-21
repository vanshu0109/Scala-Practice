package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class Session3Assignment1Test extends AnyFunSuite {
  val bankingInstance = new BankingApplication

  test("To create the new account") {
    val newAccount = bankingInstance.createAccount(2000).keys.head
    val expectedAccountNumber = bankingInstance.accountsData.contains(newAccount)
    assert(expectedAccountNumber == true)
  }

  test("To list all accounts") {
    val expectedResult = bankingInstance.accountsData.size
    assert(expectedResult == bankingInstance.listAccounts().size)
  }

  test("To fetch any account balance") {
    val list = bankingInstance.listAccounts()
    val expectedAccountNumber = list.head._1
    val expectedOpeningBalance = list.head._2
    assert(bankingInstance.fetchAccountBalance(expectedAccountNumber) == expectedOpeningBalance)
  }

  test("To delete any account") {
    val accountNumber = bankingInstance.createAccount(2000.0).keys.head
    assert(bankingInstance.deleteAccount(accountNumber))
  }

  test("To delete account that does not exist") {
    val accountNumber = 123459087
    assert(!bankingInstance.deleteAccount(accountNumber))
  }

  test("To update any account balance") {
    val newAccount1 = bankingInstance.createAccount(2000).keys.head
    val transcationList = List(Transactions(1, newAccount1, "credit", 400))
    bankingInstance.updateBalance(transcationList)
    assert(bankingInstance.fetchAccountBalance(newAccount1) == 2400.0)
  }

  test("To check for negative balance") {
    val newAccount1 = bankingInstance.createAccount(2000).keys.head
    val newAccount2 = bankingInstance.createAccount(6000).keys.head
    val transcationList = List(Transactions(1, newAccount1, "credit", 400), Transactions(2, newAccount2, "debit", 8200))
    assertThrows[ArithmeticException] {
      bankingInstance.updateBalance(transcationList)
    }
  }

  test("To check for invalid transaction type") {
    val newAccount1 = bankingInstance.createAccount(2000).keys.head
    val newAccount2 = bankingInstance.createAccount(6000).keys.head
    val transcationList = List(Transactions(1, newAccount1, "deposit", 400), Transactions(2, newAccount2, "debit", 3200))
    assertThrows[IllegalArgumentException] {
      bankingInstance.updateBalance(transcationList)
    }
  }
}
