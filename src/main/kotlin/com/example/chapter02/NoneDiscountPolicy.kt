package org.example.com.example.chapter02

class NoneDiscountPolicy : DiscountPolicy() {
    override fun getDiscountAmount(screening: Screening): Money {
        return Money.ZERO
    }
}
