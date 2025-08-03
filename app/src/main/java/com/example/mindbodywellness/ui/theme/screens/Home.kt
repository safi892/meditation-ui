package com.example.mindbodywellness.ui.theme.pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mindbodywellness.R
import com.example.mindbodywellness.theme.AppTheme
import com.example.mindbodywellness.ui.theme.components.AppCard

@Composable
fun HomeScreen() {
    val verticalSpace = 16.dp
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.colors.background)
            .verticalScroll(scrollState)
            .padding(
                top = 3.dp,
                bottom = 17.dp,
                start = 15.dp,
                end = 15.dp
            ),
    ) {
        // App Title


        Spacer(modifier = Modifier.height(verticalSpace))

        // Greeting
        Text(
            text = "Good morning, Ethan",
            color = AppTheme.colors.onBackground,
            style = AppTheme.typography.pageHeading,
        )
        Spacer(modifier = Modifier.height(verticalSpace))

        // Cards Section
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Meditation Card
            Card(
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = AppTheme.colors.background),
                border = BorderStroke(2.dp, AppTheme.colors.outline),
                modifier = Modifier.weight(1f)
            ) {
                Column(
                    modifier = Modifier.padding(32.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Meditation",
                        color = AppTheme.colors.textPrimary,
                        style = AppTheme.typography.cardHeading
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "15 min",
                        color = AppTheme.colors.textPrimary,
                        style = AppTheme.typography.pageName
                    )
                }
            }

            // Steps Card
            Card(
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = AppTheme.colors.background),
                border = BorderStroke(2.dp, AppTheme.colors.outline),

                modifier = Modifier.weight(1f)
            ) {
                Column(
                    modifier = Modifier.padding(32.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Steps",
                        color = AppTheme.colors.textPrimary,
                        style = AppTheme.typography.cardHeading
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "3,200",
                        color = AppTheme.colors.textPrimary,
                        style = AppTheme.typography.pageName
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(verticalSpace))

        // Workout Card
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(AppTheme.colors.background)
                .border(
                    width = 2.dp,
                    shape = RoundedCornerShape(8.dp),
                    color = AppTheme.colors.outline
                )
                .padding(32.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Workout",
                color = AppTheme.colors.textPrimary,
                style = AppTheme.typography.cardHeading,
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "30 min",
                color = AppTheme.colors.textPrimary,
                style = AppTheme.typography.pageName,
            )
        }

        Spacer(modifier = Modifier.height(verticalSpace))

        // Featured Section
        Text(
            text = "Featured",
            color = AppTheme.colors.onBackground,
            style = AppTheme.typography.heading,
        )
        Spacer(modifier = Modifier.height(verticalSpace))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(scrollState)
                .padding(0.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AppCard(
                image = painterResource(R.drawable.meditation),
                title = "Morning Yoga",
                description = "Start your day with calm and energy.",
                modifier = Modifier
                    .weight(1f)
            )
            AppCard(
                image = painterResource(R.drawable.running),
                title = "Morning Yoga",
                description = "Start your day with calm and energy.",
                modifier = Modifier
                    .weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(verticalSpace))

        // Quick Sessions Section
        Text(
            text = "Quick Sessions",
            color = AppTheme.colors.onBackground,
            style = AppTheme.typography.heading,
        )
        Spacer(modifier = Modifier.height(verticalSpace))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AppCard(
                image = painterResource(R.drawable.mindfull),
                title = "Mindful Moments",
                description = "Short meditations for busy days.",
                modifier = Modifier
                    .weight(1f)
            )
            AppCard(
                image = painterResource(R.drawable.active),
                title = "Active Breaks",
                description = "Quick exercises to boost your energy.",
                modifier = Modifier
                    .weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(verticalSpace))

        // Sleep Sounds Card
        AppCard(
            image = painterResource(R.drawable.sleep),
            title = "Sleep Sounds",
            description = "Soothing sounds to help you fall asleep.",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = verticalSpace)
                .height(320.dp)
        )
    }
}