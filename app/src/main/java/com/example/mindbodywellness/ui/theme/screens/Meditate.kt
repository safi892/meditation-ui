
package com.example.mindbodywellness.ui.theme.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mindbodywellness.R
import com.example.mindbodywellness.theme.AppTheme
import com.example.mindbodywellness.ui.theme.components.AppCard
import com.example.mindbodywellness.ui.theme.components.Footer
import com.example.mindbodywellness.ui.theme.components.SearchBar
import com.example.mindbodywellness.ui.theme.components.ThemedButton


@Composable
fun MeditateScreen(){
    val verticalSpace = 16.dp
    val scrollcolumn = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.colors.background)
            .verticalScroll(scrollcolumn)
            .padding(
                top = 3.dp,
                bottom = 17.dp,
                start = 15.dp,
                end = 15.dp
            ),
    ) {
        // App Title


        Spacer(modifier = Modifier.height(verticalSpace))

        SearchBar()

        Spacer(modifier = Modifier.height(verticalSpace))

        ActivitiesSection()

        Spacer(modifier = Modifier.height(verticalSpace))

        //focus

        Row {
            Text(
                text = "Focus",
                color = AppTheme.colors.onBackground, // Use theme text color
                style = AppTheme.typography.heading,
            )
        }
        Spacer(modifier = Modifier.height(verticalSpace))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(AppTheme.colors.background)
                .padding(0.dp),

            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AppCard(
                image = painterResource(R.drawable.mindful2),
                title = "Mindful Moments",
                description = "Short meditations for busy days.",
                modifier = Modifier
                    .weight(1f)
            )
            AppCard(
                image = painterResource(R.drawable.deepfocus),
                title = "Deep Focus",
                description = "Enhance concentration and productivity.",
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
                image = painterResource(R.drawable.clarity),
                title = "Sclarity Boost",
                description = "Clear your mind and find focus on fitness",
                modifier = Modifier
                    .width(180.dp)        // cards
                    .height(320.dp)
            )

        }
        Spacer(modifier = Modifier.height(verticalSpace))

        // sleep

        Row {
            Text(
                text = "Sleep",
                color = AppTheme.colors.onBackground, // Use theme text color
                style = AppTheme.typography.heading,
            )
        }
        Spacer(modifier = Modifier.height(verticalSpace))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(AppTheme.colors.background)
                .padding(0.dp),

            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AppCard(
                image = painterResource(R.drawable.sleepstory),
                title = "Sleep Stories",
                description = "Soothing tales to lull you to sleep.",
                modifier = Modifier
                    .weight(1f)
            )
            AppCard(
                image = painterResource(R.drawable.nighttime),
                title = "Night Relaxation",
                description = "Gentle exercises for a peaceful night.",
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
                image = painterResource(R.drawable.dream),
                title = "Dreamy Escapes",
                description = "Immersive soundscapes for restful sleep",
                modifier = Modifier
                    .width(180.dp)        // cards
                    .height(320.dp)
            )

        }
        Spacer(modifier = Modifier.height(verticalSpace))


        // stress releif
        Row {
            Text(
                text = "Stress Relief",
                color = AppTheme.colors.onBackground, // Use theme text color
                style = AppTheme.typography.pageHeading,
            )
        }
        Spacer(modifier = Modifier.height(verticalSpace))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(AppTheme.colors.background)
                .padding(0.dp),

            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AppCard(
                image = painterResource(R.drawable.calmbreathing),
                title = "Calm Breathing",
                description = "Breathing exercises for instant calm",
                modifier = Modifier
                    .weight(1f)
            )
            AppCard(
                image = painterResource(R.drawable.stressrelease),
                title = "Stress Release",
                description = "Techniques to release tension and stress.",
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
                image = painterResource(R.drawable.anxiety),
                title = "Anxiety Relief",
                description = "Strategies to manage anxiety.",
                modifier = Modifier
                    .width(180.dp)        // cards
                    .height(320.dp)
            )

        }
        Spacer(modifier = Modifier.height(verticalSpace))



    }

}
@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun ActivitiesSection() {
    val labels = listOf(" All ", "Featured ", "New")
    // remember which labels are selected
    val selected = rememberSaveable { mutableStateOf(setOf<String>()) }

    Column {

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
                    else AppTheme.colors.onBackground,
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
