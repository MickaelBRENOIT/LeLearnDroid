package com.mickaelbrenoit.lelearndroid.presentation.feature_lesson

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mickaelbrenoit.lelearndroid.data.feature_lesson.Lesson

@Composable
fun LessonItem(lesson: Lesson, onCLick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.elevatedCardElevation()
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(text = lesson.title, style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = lesson.content, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = onCLick,
                modifier = Modifier.align(Alignment.End)
            ) {
                Text(text = "Learn more!")
            }
        }
    }
}

@Preview
@Composable
fun LessonItemPreview() {
    val lesson = Lesson(title = "This is a title", content = "This is a simple message in order to test my function, only for preview", isUnlocked = true)
    LessonItem(lesson = lesson) {
        
    }
}