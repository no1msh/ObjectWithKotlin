package org.example.com.example.chapter02

import kotlin.time.Duration

class Movie(
    val title: String,
    val runningTime: Duration,
    val fee: Money,
    private val discountPolicy: DiscountPolicy
) {
    // calculateMovieFee 로직을 한 줄로 표현
    fun calculateMovieFee(screening: Screening): Money {
        return fee - discountPolicy.calculateDiscountAmount(screening)
    }
}