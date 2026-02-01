package org.example.com.example.chapter01

data class Bag(
    private val amount: Long,
    private val invitation: Invitation?,
    var ticket: Ticket?,
) {
    val hasInvitation: Boolean
        get() = invitation != null

    val hasTicket: Boolean
        get() = ticket != null

    fun minusAmount(amount: Long) {
        this.amount - amount
    }

    fun plusAmount(amount: Long) {
        this.amount + amount
    }

    constructor(amount: Long) : this(amount = amount, invitation = null, ticket = null)

    constructor(amount: Long, invitation: Invitation) : this(amount = amount, invitation = invitation, ticket = null)
}
