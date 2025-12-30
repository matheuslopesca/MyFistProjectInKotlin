package main.kotlin.classes

class Account constructor(
    val accountNumber: String = "",
    val accountOwner: String = ""
) {

    private var balance: Double = 0.0

    constructor() : this(accountNumber = "", accountOwner = "") {
        println("Constructor")
    }

    constructor(accountNumber: String, accountOwner: String, balance: Double) : this(accountNumber, accountOwner) {
        this.balance = balance
    }

    fun deposit(amount: Double) {
        balance += amount
    }

    fun deposit(amount: Int) {
        balance += amount
    }

    fun print() {
        println("Account: $accountNumber, AccountOwner: $accountOwner, Balance: $balance")

    }

}