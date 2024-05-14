package com.mickaelbrenoit.lelearndroid.presentation.feature_lesson

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mickaelbrenoit.lelearndroid.data.feature_lesson.Lesson

@Composable
fun LessonsList(lessons: List<Lesson>, modifier: Modifier) {
    LazyColumn(
        modifier = modifier
    ){
        items(lessons) { lesson ->
            LessonItem(lesson = lesson) {

            }
        }
    }
}

@Preview
@Composable
fun LessonsListPreview(modifier: Modifier = Modifier) {
    val lessons = listOf(
        Lesson(title = "Introduction to Kotlin", content = "Learn the basics of Kotlin.", isUnlocked = true),
        Lesson(title = "Deep Dive into Jetpack Compose", content = "Understanding Compose from the ground up.", isUnlocked = true),
        Lesson(title = "Using Coroutines", content = "Manage background tasks with Kotlin Coroutines.", isUnlocked = true)
    )
    LessonsList(lessons = lessons, modifier = Modifier.padding(16.dp))
}