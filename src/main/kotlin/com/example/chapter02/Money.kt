package org.example.com.example.chapter02

import java.math.BigDecimal

data class Money(val amount: BigDecimal) {

    companion object {
        @JvmField
        val ZERO = wons(0)

        fun wons(amount: Long): Money = Money(BigDecimal.valueOf(amount))
        fun wons(amount: Double): Money = Money(BigDecimal.valueOf(amount))
    }

    // 연산자 오버로딩
    operator fun plus(other: Money): Money = Money(this.amount.add(other.amount))
    operator fun minus(other: Money): Money = Money(this.amount.subtract(other.amount))
    operator fun times(percent: Double): Money = Money(this.amount.multiply(BigDecimal.valueOf(percent)))

    // 비교 로직
    fun isLessThan(other: Money): Boolean = amount < other.amount
    fun isGreaterThanOrEqual(other: Money): Boolean = amount >= other.amount

    // BigDecimal의 equals는 scale(소수점 자릿수)까지 비교하므로,
    // 값만 비교하기 위해 compareTo를 사용하는 것이 권장되나 원본의 doubleValue 비교를 유지함
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Money) return false
        return amount.toDouble() == other.amount.toDouble()
    }

    override fun hashCode(): Int = amount.toDouble().hashCode()

    override fun toString(): String = "${amount}원"
}