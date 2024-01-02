package com.xuspi.instagramprofile.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.xuspi.instagramprofile.profile.components.ProfileAction
import com.xuspi.instagramprofile.profile.components.ProfileDescription
import com.xuspi.instagramprofile.profile.components.ProfileHeader
import com.xuspi.instagramprofile.profile.components.ProfileInformation
import com.xuspi.instagramprofile.profile.components.ProfilePosts
import com.xuspi.instagramprofile.profile.components.ProfileStories

@Composable
fun ProfileScreen() {

    Column {
        ProfileHeader(
            backClick = { /*TODO*/ },
            notificationClick = { /*TODO*/ },
            optionsClick = { /*TODO*/ }
        )
        ProfileInformation()
        ProfileDescription(modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp))
        ProfileAction(modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp))
        ProfileStories(modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp))
        ProfilePosts(modifier = Modifier.padding(top = 16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}