package org.example.com.example.chapter01

data class TicketSeller(
    private val ticketOffice: TicketOffice,
) {
    fun sellTo(audience: Audience) {
        if (audience.bag.hasInvitation) {
            val ticket: Ticket = ticketOffice.getTicket()
            audience.bag.ticket = ticket
        } else {
            val ticket: Ticket = ticketOffice.getTicket()
            audience.bag.minusAmount(ticket.fee)
            ticketOffice.plusAmount(ticket.fee)
            audience.bag.ticket = ticket
        }
    }
}
