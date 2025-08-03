package com.example.mindbodywellness.ui.theme.pages

import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mindbodywellness.R
import com.example.mindbodywellness.theme.AppTheme
import com.example.mindbodywellness.ui.theme.components.AppCard
import com.example.mindbodywellness.ui.theme.components.CenteredIconCard
import com.example.mindbodywellness.ui.theme.components.Footer
import com.example.mindbodywellness.ui.theme.components.MeditationPlayerScreen
import com.example.mindbodywellness.ui.theme.components.StaticGallery
import com.example.mindbodywellness.ui.theme.components.SearchBar
import com.example.mindbodywellness.ui.theme.components.ThemedButton

@Composable
fun ProfileScreen(){

    MeditationPlayerScreen()
//    val verticalSpace = 16.dp
//    val scrollcolumn = rememberScrollState()
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(AppTheme.colors.background)
//            .verticalScroll(scrollcolumn)
//            .padding(
//                top = 3.dp,
//                bottom = 17.dp,
//                start = 15.dp,
//                end = 15.dp
//            ),
//    ) {
//
//        CenteredIconCard(
//            icon = painterResource(R.drawable.profile_image),
//            heading = "Sophia Carter",
//            subHeading = "30 days streak"
//        )
//
//        Spacer(modifier = Modifier.height(verticalSpace))
////setting
//        Row {
//            Text(
//                text = "Settings",
//                color = AppTheme.colors.onBackground, // Use theme text color
//                style = AppTheme.typography.pageHeading,
//            )
//        }
//        Spacer(modifier = Modifier.height(verticalSpace))
//
//        //remainder
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text(
//                text = "Remainders",
//                style = AppTheme.typography.headingThin,
//                color = AppTheme.colors.onBackground
//            )
//            Icon(
//                painter = painterResource(R.drawable.arrow_right),
//                contentDescription = null,
//                tint = AppTheme.colors.textPrimary,
//                modifier = Modifier.size(24.dp)
//            )
//        }
//
//        Spacer(modifier = Modifier.height(verticalSpace))
//
//        var switchmode by rememberSaveable { mutableStateOf(true) }
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth() ,
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text(
//                text = "Switch Mode",
//                style = AppTheme.typography.headingThin,
//                color = AppTheme.colors.onBackground
//            )
//
//            Switch(
//                checked = switchmode,
//                onCheckedChange = { enabled -> switchmode = enabled },
//                colors = SwitchDefaults.colors(
//                    checkedThumbColor   = AppTheme.colors.primary,
//                    checkedTrackColor   = AppTheme.colors.primary.copy(alpha = 0.5f),
//                    uncheckedThumbColor = AppTheme.colors.outline,
//                    uncheckedTrackColor = AppTheme.colors.outline.copy(alpha = 0.5f)
//                )
//            )
//        }
//
//        Spacer(modifier = Modifier.height(verticalSpace))
//
//
//        var notificationsEnabled by rememberSaveable { mutableStateOf(true) }
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text(
//                text = "Notification",
//                style = AppTheme.typography.headingThin,
//                color = AppTheme.colors.onBackground
//            )
//
//            Switch(
//                checked = notificationsEnabled,
//                onCheckedChange = { enabled -> notificationsEnabled = enabled },
//                colors = SwitchDefaults.colors(
//                    checkedThumbColor   = AppTheme.colors.primary,
//                    checkedTrackColor   = AppTheme.colors.primary.copy(alpha = 0.5f),
//                    uncheckedThumbColor = AppTheme.colors.outline,
//                    uncheckedTrackColor = AppTheme.colors.outline.copy(alpha = 0.5f)
//                )
//            )
//        }
//
//        Spacer(modifier = Modifier.height(verticalSpace))
//
//        Row {
//            Text(
//                text = "Achievements",
//                color = AppTheme.colors.onBackground, // Use theme text color
//                style = AppTheme.typography.pageHeading,
//            )
//        }
//
//        Spacer(modifier = Modifier.height(verticalSpace))
//
//
//        StaticGallery()
//
//
//
//        Spacer(modifier = Modifier.height(verticalSpace))
////account
//        Row {
//            Text(
//                text = "Account",
//                color = AppTheme.colors.onBackground, // Use theme text color
//                style = AppTheme.typography.pageHeading,
//            )
//        }
//        Spacer(modifier = Modifier.height(verticalSpace))
//
//        //manage
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text(
//                text = "Manage Account",
//                style = AppTheme.typography.headingThin,
//                color = AppTheme.colors.onBackground
//            )
//            Icon(
//                painter = painterResource(R.drawable.arrow_right),
//                contentDescription = null,
//                tint = AppTheme.colors.textPrimary,
//                modifier = Modifier.size(24.dp)
//            )
//        }
//        Spacer(modifier = Modifier.height(verticalSpace))
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text(
//                text = "Help",
//                style = AppTheme.typography.headingThin,
//                color = AppTheme.colors.onBackground
//            )
//            Icon(
//                painter = painterResource(R.drawable.arrow_right),
//                contentDescription = null,
//                tint = AppTheme.colors.textPrimary,
//                modifier = Modifier.size(24.dp)
//            )
//        }
//        Spacer(modifier = Modifier.height(verticalSpace))
//
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Text(
//                text = "Log Out",
//                style = AppTheme.typography.headingThin,
//                color = AppTheme.colors.onBackground
//            )
//            Icon(
//                painter = painterResource(R.drawable.arrow_right),
//                contentDescription = null,
//                tint = AppTheme.colors.textPrimary,
//                modifier = Modifier.size(24.dp)
//            )
//        }
//        Spacer(modifier = Modifier.height(verticalSpace))
//
//    }
}