package org.example.com.example.chapter01

data class Bag(
    private val amount: Long,
    private val invitation: Invitation?,
    private var ticket: Ticket?,
) {
    val hasInvitation: Boolean
        get() = invitation != null

    fun hold(ticket: Ticket): Long {
        if (hasInvitation) {
            this.ticket = ticket
            return 0L
        } else {
            this.ticket = ticket
            minusAmount(ticket.fee)
            this.ticket = ticket
            return ticket.fee
        }
    }

    private fun minusAmount(amount: Long) {
        this.amount - amount
    }
}
