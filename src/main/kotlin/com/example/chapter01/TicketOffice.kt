package org.example.com.example.chapter01

class TicketOffice(
    private val amount: Long,
    tickets: List<Ticket> = emptyList(),
) {
    private val tickets: MutableList<Ticket> = tickets.toMutableList()

    fun getTicket(): Ticket {
        return tickets.removeFirst()
    }

    fun minusAmount(amount: Long) {
        this.amount - amount
    }

    fun plusAmount(amount: Long) {
        this.amount + amount
    }
}
