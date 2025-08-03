package com.example.mindbodywellness.ui.theme.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mindbodywellness.theme.AppTheme
import com.example.mindbodywellness.ui.theme.components.ThemedButton


@Composable
fun WellnessHubScreen(onNavigateToHome: () -> Unit = {}) {


    val verticalSpace = 16.dp

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.colors.background) // Use theme background
            .padding(
                top = 38.dp,
                bottom = 17.dp,
                start = 15.dp,
                end = 15.dp
            ),
    ) {


        Spacer(modifier = Modifier.height(verticalSpace))

        // Main Title
        Row {
            Text(
                text = "Find your balance",
                color = AppTheme.colors.secondaryBackground, // Use theme text color
                style = AppTheme.typography.pageHeading

            )
        }

        Spacer(modifier = Modifier.height(verticalSpace))

        // Meditation Focus Section
        MeditationFocusSection()

        Spacer(modifier = Modifier.height(verticalSpace))

        // Activities Section
        ActivitiesSection()

        // Pushes everything that follows to the very bottom
        Spacer(Modifier.weight(1f))

        // Bottom Start Button
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 17.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Button(
                onClick = onNavigateToHome,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = AppTheme.colors.primary, // Use theme primary color
                    contentColor = AppTheme.colors.textPrimary // Use theme text on primary color
                )
            ) {
                Text(
                    text = "Start",
                    style = AppTheme.typography.textButton
                )
            }
        }
    }
}


@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun MeditationFocusSection() {
    val labels = listOf("Stress Relief", "Focus", "Sleep", "Mindfulness")
    // remember which labels are selected
    val selected = rememberSaveable { mutableStateOf(setOf<String>()) }

    Column {
        Text(
            text = "Meditation Focus",
            color = AppTheme.colors.secondaryBackground,
            style = AppTheme.typography.heading,
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(22.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            labels.forEach { label ->
                val isSelected = label in selected.value
                ThemedButton(
                    text = label,
                    style = AppTheme.typography.headingThin,
                    containerColor = if (isSelected) AppTheme.colors.primary
                        else AppTheme.colors.secondary,
                    contentColor   = if (isSelected) AppTheme.colors.textPrimary
                    else AppTheme.colors.secondaryBackground,
                    onClick = {
                        // toggle
                        selected.value = selected.value
                            .toMutableSet()
                            .apply { if (isSelected) remove(label) else add(label) }
                    },
                )
            }
        }
    }
}




@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun ActivitiesSection() {
    val labels = listOf(" Running ", "Walking ", "Yoga", "Cycling")
    // remember which labels are selected
    val selected = rememberSaveable { mutableStateOf(setOf<String>()) }

    Column {
        Text(
            text = "Activities",
            color = AppTheme.colors.secondaryBackground, // Use theme text color
            style = AppTheme.typography.heading,
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(22.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            labels.forEach { label ->
                val isSelected = label in selected.value
                ThemedButton(
                    text = label,
                    style = AppTheme.typography.headingThin,
                    containerColor = if (isSelected) AppTheme.colors.primary
                    else AppTheme.colors.secondary,
                    contentColor = if (isSelected) AppTheme.colors.textPrimary
                    else AppTheme.colors.secondaryBackground,
                    onClick = {
                        // toggle selection
                        selected.value = selected.value
                            .toMutableSet()
                            .apply { if (isSelected) remove(label) else add(label) }
                    },
                )
            }
        }
    }
}

@Preview
@Composable
fun WellnessHubScreenPreview() {
    WellnessHubScreen()
}

//package com.example.mindbodywellness.ui.theme.pages
//
//import androidx.compose.foundation.layout.*
//import androidx.compose.material3.Button
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//
//
//@Composable
//fun WellnessHubScreen(onNavigateToHome: () -> Unit) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//    ) {
//        Text(
//            text ="Wellness Hub",
//            fontSize = 24.sp,
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//        Button(onClick = onNavigateToHome) {
//            Text("Start")
//        }
//    }
//}