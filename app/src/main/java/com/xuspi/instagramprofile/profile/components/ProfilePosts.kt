package com.xuspi.instagramprofile.profile.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ProfilePosts(modifier: Modifier = Modifier) {

    LazyVerticalGrid(columns = GridCells.Fixed(3), modifier = modifier) {
        items(10) {
            PostItem(modifier = Modifier.padding(1.dp))
        }
    }
}

@Composable
fun PostItem(modifier: Modifier = Modifier) {
    AsyncImage(
        model = "https://via.placeholder.com/1000",
        contentDescription = "Post",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun ProfilePostsPreview() {
    ProfilePosts()
}