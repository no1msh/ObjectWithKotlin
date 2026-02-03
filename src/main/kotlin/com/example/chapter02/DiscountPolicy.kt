package org.example.com.example.chapter02

abstract class DiscountPolicy(vararg conditions: DiscountCondition) {
    private val conditions: List<DiscountCondition> = conditions.toList()

    fun calculateDiscountAmount(screening: Screening): Money {
        for (each in conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening)
            }
        }
        return Money.ZERO
    }

    protected abstract fun getDiscountAmount(screening: Screening): Money
}
