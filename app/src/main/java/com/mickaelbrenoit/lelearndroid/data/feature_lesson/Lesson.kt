package com.mickaelbrenoit.lelearndroid.data.feature_lesson

import java.util.UUID

data class Lesson(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val content: String,
    val isUnlocked: Boolean
)
