package org.example.com.example.chapter01

import java.time.LocalDateTime

data class Invitation(
    // 책 내에선 when으로 명시되어있으나 키워드이므로 time으로 대체
    private val time: LocalDateTime,
)
