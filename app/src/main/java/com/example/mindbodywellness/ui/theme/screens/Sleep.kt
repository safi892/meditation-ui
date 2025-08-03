package com.example.mindbodywellness.ui.theme.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mindbodywellness.R
import com.example.mindbodywellness.theme.AppTheme
import com.example.mindbodywellness.ui.theme.components.AppCard
import com.example.mindbodywellness.ui.theme.components.CenteredIconCard
import com.example.mindbodywellness.ui.theme.components.StaticGallery

@Composable
fun SleepScreen() {
    val verticalSpace = 16.dp

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.colors.background)
            .verticalScroll(rememberScrollState())
            .padding(
                top = 3.dp,
                bottom = 17.dp,
                start = 15.dp,
                end = 15.dp
            ),
    ) {
        Spacer(modifier = Modifier.height(verticalSpace))
        Row {
            Text(
                text = "Wind Down",
                color = AppTheme.colors.onBackground,
                style = AppTheme.typography.heading,
            )
        }

        Spacer(modifier = Modifier.height(verticalSpace))

        Row(
            modifier = Modifier
                .fillMaxWidth(),

            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "5 min",
                    style = AppTheme.typography.cardDescription,
                    color = AppTheme.colors.textDescription
                )
                Spacer(modifier = Modifier.height(3.dp))
                Text(
                    text = "Relaxing Breathing",
                    style = AppTheme.typography.cardHeading,
                    color = AppTheme.colors.textPrimary
                )
                Spacer(modifier = Modifier.height(3.dp))
                Text(
                    text = "Calm your mind and body with this guided breathing exercise.",
                    style = AppTheme.typography.cardDescription,
                    color = AppTheme.colors.textDescription
                )
            }
            Icon(
                painter = painterResource(R.drawable.sleep_page),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier
                    .size(126.dp)
            )
        }

        Spacer(modifier = Modifier.height(verticalSpace))
        Row {
            Text(
                text = "Sleep Stories",
                color = AppTheme.colors.onBackground,
                style = AppTheme.typography.heading,
            )
        }
        Spacer(modifier = Modifier.height(verticalSpace))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()) // Correctly applied horizontal scroll
                .padding(0.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AppCard(
                image = painterResource(R.drawable.story1),
                title = "Drift into Dreamland",
                description = "A soothing tale to ease you into sleep.",
                modifier = Modifier
                    .width(180.dp)
                    .height(300.dp)
            )
            AppCard(
                image = painterResource(R.drawable.story2),
                title = "Whispers of the Night",
                description = "Gentle narratives for a peaceful night.",
                modifier = Modifier
                    .width(180.dp)
                    .height(300.dp)
            )
            AppCard(
                image = painterResource(R.drawable.story3),
                title = "Serene Slumber",
                description = "A journey to a tranquil sleep.",
                modifier = Modifier
                    .width(180.dp)
                    .height(300.dp)
            )
        }

        // Soundscapes
        Spacer(modifier = Modifier.height(verticalSpace))
        Row {
            Text(
                text = "Soundscapes",
                color = AppTheme.colors.onBackground,
                style = AppTheme.typography.heading,
            )
        }
        Spacer(modifier = Modifier.height(verticalSpace))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()) // Correctly applied horizontal scroll
                .padding(0.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AppCard(
                image = painterResource(R.drawable.sound1),
                title = "Gentle Rain",
                description = "The soft patter of rain for relaxation.",
                modifier = Modifier
                    .width(180.dp)
                    .height(300.dp)
            )
            AppCard(
                image = painterResource(R.drawable.sound2),
                title = "Ocean Waves",
                description = "The rhythmic sound of waves.",
                modifier = Modifier
                    .width(180.dp)
                    .height(300.dp)
            )
            AppCard(
                image = painterResource(R.drawable.sound3),
                title = "Forest Night",
                description = "The peaceful sounds of the forest.",
                modifier = Modifier
                    .width(180.dp)
                    .height(300.dp)
            )
        }


//        profile
        CenteredIconCard(
                    icon = painterResource(R.drawable.profile_image),
                    heading = "Sophia Carter",
                    subHeading = "30 days streak"
                )

                Spacer(modifier = Modifier.height(verticalSpace))
        //setting
                Row {
                    Text(
                        text = "Settings",
                        color = AppTheme.colors.onBackground, // Use theme text color
                        style = AppTheme.typography.pageHeading,
                    )
                }
                Spacer(modifier = Modifier.height(verticalSpace))

                //remainder

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Remainders",
                        style = AppTheme.typography.headingThin,
                        color = AppTheme.colors.onBackground
                    )
                    Icon(
                        painter = painterResource(R.drawable.arrow_right),
                        contentDescription = null,
                        tint = AppTheme.colors.textPrimary,
                        modifier = Modifier.size(24.dp)
                    )
                }

                Spacer(modifier = Modifier.height(verticalSpace))

                var switchmode by rememberSaveable { mutableStateOf(true) }

                Row(
                    modifier = Modifier
                        .fillMaxWidth() ,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Switch Mode",
                        style = AppTheme.typography.headingThin,
                        color = AppTheme.colors.onBackground
                    )

                    Switch(
                        checked = switchmode,
                        onCheckedChange = { enabled -> switchmode = enabled },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor   = AppTheme.colors.primary,
                            checkedTrackColor   = AppTheme.colors.primary.copy(alpha = 0.5f),
                            uncheckedThumbColor = AppTheme.colors.outline,
                            uncheckedTrackColor = AppTheme.colors.outline.copy(alpha = 0.5f)
                        )
                    )
                }

                Spacer(modifier = Modifier.height(verticalSpace))


                var notificationsEnabled by rememberSaveable { mutableStateOf(true) }

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Notification",
                        style = AppTheme.typography.headingThin,
                        color = AppTheme.colors.onBackground
                    )

                    Switch(
                        checked = notificationsEnabled,
                        onCheckedChange = { enabled -> notificationsEnabled = enabled },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor   = AppTheme.colors.primary,
                            checkedTrackColor   = AppTheme.colors.primary.copy(alpha = 0.5f),
                            uncheckedThumbColor = AppTheme.colors.outline,
                            uncheckedTrackColor = AppTheme.colors.outline.copy(alpha = 0.5f)
                        )
                    )
                }

                Spacer(modifier = Modifier.height(verticalSpace))

                Row {
                    Text(
                        text = "Achievements",
                        color = AppTheme.colors.onBackground, // Use theme text color
                        style = AppTheme.typography.pageHeading,
                    )
                }

                Spacer(modifier = Modifier.height(verticalSpace))


                StaticGallery()



                Spacer(modifier = Modifier.height(verticalSpace))
        //account
                Row {
                    Text(
                        text = "Account",
                        color = AppTheme.colors.onBackground, // Use theme text color
                        style = AppTheme.typography.pageHeading,
                    )
                }
                Spacer(modifier = Modifier.height(verticalSpace))

                //manage

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Manage Account",
                        style = AppTheme.typography.headingThin,
                        color = AppTheme.colors.onBackground
                    )
                    Icon(
                        painter = painterResource(R.drawable.arrow_right),
                        contentDescription = null,
                        tint = AppTheme.colors.textPrimary,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Spacer(modifier = Modifier.height(verticalSpace))

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Help",
                        style = AppTheme.typography.headingThin,
                        color = AppTheme.colors.onBackground
                    )
                    Icon(
                        painter = painterResource(R.drawable.arrow_right),
                        contentDescription = null,
                        tint = AppTheme.colors.textPrimary,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Spacer(modifier = Modifier.height(verticalSpace))


                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Log Out",
                        style = AppTheme.typography.headingThin,
                        color = AppTheme.colors.onBackground
                    )
                    Icon(
                        painter = painterResource(R.drawable.arrow_right),
                        contentDescription = null,
                        tint = AppTheme.colors.textPrimary,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Spacer(modifier = Modifier.height(verticalSpace))


    }
}