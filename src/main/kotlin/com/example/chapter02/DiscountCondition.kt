package org.example.com.example.chapter02

interface DiscountCondition {
    fun isSatisfiedBy(screening: Screening): Boolean
}