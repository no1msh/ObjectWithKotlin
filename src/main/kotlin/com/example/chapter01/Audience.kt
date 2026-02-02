package org.example.com.example.chapter01

data class Audience(
    val bag: Bag,
) {
    fun buy(ticket: Ticket): Long {
        if (bag.hasInvitation) {
            bag.ticket = ticket
            return 0L
        } else {
            bag.ticket = ticket
            bag.minusAmount(ticket.fee)
            bag.ticket = ticket
            return ticket.fee
        }
    }
}
