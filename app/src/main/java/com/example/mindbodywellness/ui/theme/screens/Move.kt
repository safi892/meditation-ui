package com.example.mindbodywellness.ui.theme.pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mindbodywellness.R
import com.example.mindbodywellness.theme.AppTheme
import com.example.mindbodywellness.ui.theme.components.AppCard
import com.example.mindbodywellness.ui.theme.components.Footer
import com.example.mindbodywellness.ui.theme.components.SearchBar
import com.example.mindbodywellness.ui.theme.components.ThemedButton

@Composable
fun MoveScreen() {
    val verticalSpace = 16.dp
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.colors.background)
            .verticalScroll(scrollState)
            .padding(top = 3.dp, bottom = 17.dp, start = 15.dp, end = 15.dp)
    ) {
        Spacer(modifier = Modifier.height(verticalSpace))

        // Cards
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Meditation Card
            Card(
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = AppTheme.colors.secondary),
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
                        text = "7,234",
                        color = AppTheme.colors.textPrimary,
                        style = AppTheme.typography.pageName
                    )
                }
            }

            // Steps Card
            Card(
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = AppTheme.colors.secondary),
                modifier = Modifier.weight(1f)
            ) {
                Column(
                    modifier = Modifier.padding(32.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Calories",
                        color = AppTheme.colors.textPrimary,
                        style = AppTheme.typography.cardHeading
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "320",
                        color = AppTheme.colors.textPrimary,
                        style = AppTheme.typography.pageName
                    )
                }
            }

        }

        Spacer(modifier = Modifier.height(verticalSpace))

        // quick

        Row {
            Text(
                text = "Quick Workouts",
                color = AppTheme.colors.onBackground, // Use theme text color
                style = AppTheme.typography.heading,
            )
        }
        Spacer(modifier = Modifier.height(verticalSpace))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(AppTheme.colors.background)
                .horizontalScroll(scrollState)
                .padding(0.dp),

            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AppCard(
                image = painterResource(R.drawable.yoga),
                title = "Yoga Flow",
                description = "15 min.",
                modifier = Modifier
                    .weight(1f)
            )
            AppCard(
                image = painterResource(R.drawable.strength),
                title = "Strength Training",
                description = "20 min",
                modifier = Modifier
                    .weight(1f)
            )

        }

        Spacer(modifier = Modifier.height(verticalSpace))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(AppTheme.colors.background)
                .padding(0.dp),

            ) {
            AppCard(
                image = painterResource(R.drawable.bodyweight),
                title = "Body weight Circuit",
                description = "25 min",
                modifier = Modifier
                    .width(180.dp)        // cards
                    .height(320.dp)
            )

        }


        Spacer(modifier = Modifier.height(verticalSpace))

        Row {
            Text(
                text = "Activity History",
                color = AppTheme.colors.onBackground, // Use theme text color
                style = AppTheme.typography.heading,
            )
        }
        Spacer(modifier = Modifier.height(verticalSpace))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 1.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // icon
            Icon(
                painter = painterResource(R.drawable.histroy_walking),
                contentDescription = null,
                tint = AppTheme.colors.textDescription,
                modifier = Modifier
                    .size(45.dp)
                    .background(AppTheme.colors.secondary, RoundedCornerShape(8.dp))
            )

            // main text block
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "3,500 steps",
                    style = AppTheme.typography.cardHeading,
                    color = AppTheme.colors.textPrimary
                )
                Text(
                    text = "Morning Walk",
                    style = AppTheme.typography.cardDescription,
                    color = AppTheme.colors.textDescription
                )
            }

            Text(
                text = "30 min",
                style = AppTheme.typography.headingThin,
                color = AppTheme.colors.textPrimary
            )
        }

        Spacer(modifier = Modifier.height(verticalSpace))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 1.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // icon
            Icon(
                painter = painterResource(R.drawable.histroy_walking),
                contentDescription = null,
                tint = AppTheme.colors.textDescription,
                modifier = Modifier
                    .size(45.dp)
                    .background(AppTheme.colors.secondary, RoundedCornerShape(8.dp))
            )

            // main text block
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "3,734 steps",
                    style = AppTheme.typography.cardHeading,
                    color = AppTheme.colors.textPrimary
                )
                Text(
                    text = "Evening Run",
                    style = AppTheme.typography.cardDescription,
                    color = AppTheme.colors.textDescription
                )
            }

            Text(
                text = "45 min",
                style = AppTheme.typography.headingThin,
                color = AppTheme.colors.textPrimary
            )
        }

        Spacer(modifier = Modifier.height(verticalSpace))

    }
}