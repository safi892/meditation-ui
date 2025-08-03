package com.example.mindbodywellness.ui.theme.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mindbodywellness.R
import com.example.mindbodywellness.theme.AppTheme
import com.example.mindbodywellness.ui.theme.components.GoalCheckboxItem
import com.example.mindbodywellness.ui.theme.components.OutlinedChip
// Make sure CustomBorderCheckbox is in the same package or correctly imported
// import com.example.mindbodywellness.ui.theme.pages.CustomBorderCheckbox // Example if it's here

@Composable
fun WelcomeScreen(onNavigateToWellness: () -> Unit) {

    val Lexend = remember { // Remember the FontFamily to avoid re-creating on recomposition
        FontFamily(
            Font(R.font.lexend_light, FontWeight.Light),
            Font(R.font.lexend_regular, FontWeight.Normal),
            Font(R.font.lexend_medium, FontWeight.Medium),
            Font(R.font.lexend_semibold, FontWeight.SemiBold),
            Font(R.font.lexend_bold, FontWeight.Bold),
        )
    }
    val verticalSpace = 16.dp

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.colors.background)
            .padding(
                top = 38.dp,
                bottom = 17.dp,
                start = 15.dp,
                end = 15.dp
            ),
    ) {


        Spacer(modifier = Modifier.height(verticalSpace))


        // Greeting
        Row {
            Text(
                text = "Hi, Name ",
                color = AppTheme.colors.secondaryBackground,
                style = AppTheme.typography.pageHeading,
            )
        }

        Spacer(modifier = Modifier.height(verticalSpace))

        // Prompt for goals
        Row {
            Text(
                text = "Let's get started with your wellness journey. What are your primary goals? ",
                color = AppTheme.colors.secondaryBackground,
                style = AppTheme.typography.headingThin,
                textAlign = TextAlign.Left,
                modifier = Modifier.fillMaxWidth()
            )
        }

        Spacer(modifier = Modifier.height(verticalSpace))

        // Goal Selection Checkboxes
        // Pass the fontFamily to GoalSelectionSection
        GoalSelectionSection(fontFamily = Lexend)

        Spacer(modifier = Modifier.height(verticalSpace))

        // Meditation Experience Level Section
        // Pass the fontFamily to MeditationExperienceSection
        MeditationExperienceSection(fontFamily = Lexend)


        // Pushes everything that follows to the very bottom
        Spacer(Modifier.weight(1f))

        // Continue Button
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 17.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Button(
                onClick = onNavigateToWellness,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = AppTheme.colors.primary,
                    contentColor = AppTheme.colors.textPrimary
                )
            ) {
                Text(
                    text = "Continue",
                    style = AppTheme.typography.textButton,
                )
            }
        }
    }
}


@Composable
private fun GoalSelectionSection(fontFamily: FontFamily) { // Added fontFamily parameter
    val isChecked1 = remember { mutableStateOf(false) }
    val isChecked2 = remember { mutableStateOf(false) }
    val isChecked3 = remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxWidth()) {
        GoalCheckboxItem(
            isChecked = isChecked1.value,
            onCheckedChange = { isChecked1.value = it },
            text = "Reduce stress and anxiety",
            fontFamily = fontFamily,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        GoalCheckboxItem(
            isChecked = isChecked2.value,
            onCheckedChange = { isChecked2.value = it },
            text = "Improve sleep quality",
            fontFamily = fontFamily,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        GoalCheckboxItem(
            isChecked = isChecked3.value,
            onCheckedChange = { isChecked3.value = it },
            text = "Enhance physical fitness",
            fontFamily = fontFamily,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

/**
 * Composable for the Meditation Experience Level section.
 * @param fontFamily The font family to use for texts.
 */
@Composable
private fun MeditationExperienceSection(fontFamily: FontFamily) { // Added fontFamily parameter
    Column {
        Text(
            text = "What's your experience level with meditation?",
            color = AppTheme.colors.secondaryBackground,
            style = AppTheme.typography.headingThin,
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth()
        )
        // parent composable
        var selectedLevel by remember { mutableStateOf<String?>(null) }

        Row( modifier = Modifier.padding(vertical = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
        )
        {
            listOf("Beginner", "Intermediate", "Advanced").forEach { level ->
                OutlinedChip(
                    text = level,
                    selected = selectedLevel == level,
                    onClick = { selectedLevel = level },
                    fontFamily = fontFamily // Pass fontFamily to OutlinedChip
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen(onNavigateToWellness = {})
}