package com.xuspi.instagramprofile.profile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ProfileStories(modifier: Modifier = Modifier) {

    LazyRow(modifier = modifier, horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        items(10) {
            StoryItem(number = it)
        }

    }
}

@Composable
fun StoryItem(number: Int, modifier: Modifier = Modifier) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        AsyncImage(
            model = "https://via.placeholder.com/200",
            contentDescription = "Story image",
            modifier = Modifier.clip(CircleShape)
        )
        Text(text = "Story $number")
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileStoriesPreview() {
    ProfileStories()
}