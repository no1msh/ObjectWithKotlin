package org.example.com.example.chapter01

class TicketOffice(
    private val amount: Long,
    tickets: List<Ticket> = emptyList(),
) {
    private val tickets: MutableList<Ticket> = tickets.toMutableList()

    fun sellTicketTo(audience: Audience) {
        plusAmount(audience.buy(getTicket()))
    }

    fun getTicket(): Ticket {
        return tickets.removeFirst()
    }

    fun plusAmount(amount: Long) {
        this.amount + amount
    }
}
