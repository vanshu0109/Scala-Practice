package com.knoldus
import scala.util.Random
import scala.collection.mutable.Map

case class Transactions(transactionId: Long, accountNumber: Long, transactionType: String, amount: Double)

class BankingApplication {
  // map to store all account details
  val accountsData: scala.collection.mutable.Map[Long, Double] = Map.empty

  def createAccount(openingBalance: Double): Map[Long, Double] = {
    // To generate 16 digit random account number
    val accountNumber = Random.nextLong(Math.pow(10, 16).toLong)
    if (accountsData.contains(accountNumber)) createAccount(openingBalance)
    else accountsData += (accountNumber -> openingBalance)
  }

  def listAccounts(): Map[Long, Double] = {
    accountsData
  }

  def fetchAccountBalance(accountNumber: Long): Double = {
    if (!(accountsData.contains(accountNumber))) {
      throw new IllegalArgumentException("Account Number not found")
    }
    else accountsData(accountNumber)
  }

  def updateBalance(transactions: List[Transactions]): Map[Long, Double] = {
    transactions.map(transaction => {
      val amountToDebitOrCredit = transaction.amount
      val accountNumber = transaction.accountNumber
      val currentBalance = accountsData(accountNumber)

      transaction.transactionType match {
        case "credit" => accountsData += (accountNumber -> (currentBalance + amountToDebitOrCredit))
        case "debit" => {
          val newBalance = currentBalance - amountToDebitOrCredit
          if (newBalance < 0) throw new ArithmeticException("Transaction resulted in negative balance")
          else accountsData += (accountNumber -> (currentBalance - amountToDebitOrCredit))
        }
        case _ => throw new IllegalArgumentException("Invalid transaction type")
      }
    })
    accountsData
  }

  def deleteAccount(accountNumber: Long): Boolean = {
    if (accountsData.contains(accountNumber)) {
      accountsData -= accountNumber
      true
    }
    else false
  }
  //  createAccount(1800.90)
  //  createAccount(openingBalance = 1200)
  //  createAccount(openingBalance = 0)
  //  createAccount(openingBalance = 1200)
  //createAccount(openingBalance = 1200)
  // println( "account created = "+createAccount(openingBalance = 1200))

  //  //updateBalance()
  // println(accountsData)
  // println(fetchAccountBalance(accountsData.keys.head))
  ////  val object1 = Transactions(1234,3,"credit",500)
  //// // println(fetchAccountBalance(2))
  ////  println(account)
  ////  println(updateBalance(List(object1)))
  //println(deleteAccount(accountsData.keys.tail.head))
  // println(accountsData)
}
