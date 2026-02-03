package org.example.com.example.chapter01

data class Audience(
    val bag: Bag,
) {
    fun buy(ticket: Ticket): Long {
        return bag.hold(ticket)
    }
}
