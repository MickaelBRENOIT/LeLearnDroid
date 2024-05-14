package com.mickaelbrenoit.lelearndroid.core

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mickaelbrenoit.lelearndroid.core.ui.theme.LeLearnDroidTheme
import com.mickaelbrenoit.lelearndroid.data.feature_lesson.Lesson
import com.mickaelbrenoit.lelearndroid.presentation.feature_lesson.LessonItem
import com.mickaelbrenoit.lelearndroid.presentation.feature_lesson.LessonsList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val lessons = listOf(
            Lesson(title = "Introduction to Kotlin", content = "Learn the basics of Kotlin.", isUnlocked = true),
            Lesson(title = "Deep Dive into Jetpack Compose", content = "Understanding Compose from the ground up.", isUnlocked = true),
            Lesson(title = "Using Coroutines", content = "Manage background tasks with Kotlin Coroutines.", isUnlocked = true)
        )

        setContent {
            LeLearnDroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    LessonsList(lessons = lessons, modifier = Modifier.padding(it))
                }
            }
        }
    }
}