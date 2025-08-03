package com.example.mindbodywellness.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource // Keep this import for local drawable resources
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
// Removed: import coil.compose.AsyncImage // No longer using AsyncImage
import com.example.mindbodywellness.R
import com.example.mindbodywellness.theme.AppTheme


@Composable
fun MeditationPlayerScreen(
    onCloseClick: () -> Unit = {},
    // Removed profileImageUrl parameter as it's no longer directly used by Image composable
    currentProgress: Float = 0.5f,
    currentTime: String = "1:17",
    totalTime: String = "2:23",
    likesCount: String = "123",
    bookmarksCount: String = "45",
    sharesCount: String = "67"
) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.colors.background) // Placeholder for background
    ) {
        // Top Bar (Close Button)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(AppTheme.colors.background) // Placeholder for background
                .padding(horizontal = 4.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.End
        ) {
            IconButton(
                onClick = onCloseClick,
                modifier = Modifier
                    .size(48.dp)
                    .clip(RoundedCornerShape(12.dp))
            ) {
                Text(
                    text = "X",
                    color = AppTheme.colors.textPrimary,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
        }

        // Main Content Area
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(AppTheme.colors.background) // Placeholder for background
                .padding(horizontal = 16.dp, vertical = 12.dp)
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(28.dp))

            // Profile Picture / Main Image
            Box(
                modifier = Modifier
                    .size(256.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(AppTheme.colors.background)
            ) {
                // Replaced AsyncImage with Image using a local drawable
                androidx.compose.foundation.Image( // Explicitly use foundation.Image
                    painter = painterResource(id = R.drawable.sleep_page), // Using your uploaded image as placeholder
                    contentDescription = "Meditation Session Image",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Title and Subtitle
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Mindful Breathing",
                    color = AppTheme.colors.textPrimary, // Placeholder for textPrimary
                    style =AppTheme.typography.cardHeading,
                    lineHeight = 28.sp,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Sarah Johnson",
                    color = AppTheme.colors.textDescription, // Placeholder for primaryText/textSecondary
                    style = AppTheme.typography.cardDescription,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    textAlign = TextAlign.Center
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Progress Bar
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(4.dp)
                        .background(AppTheme.colors.primary.copy(alpha = 0.4f), RoundedCornerShape(2.dp)) // Placeholder for accent
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(currentProgress)
                            .height(4.dp)
                            .background(AppTheme.colors.primary, RoundedCornerShape(2.dp)) // Placeholder for accent
                    )
                    // Thumb indicator
                    Box(
                        modifier = Modifier
                            .align(Alignment.CenterStart)
                            .offset(x = (256.dp * currentProgress) - 8.dp)
                            .size(16.dp)
                            .clip(CircleShape)
                            .background(AppTheme.colors.primary) // Placeholder for accent
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = currentTime,
                        color = AppTheme.colors.textPrimary, // Placeholder for primaryText
                        style =AppTheme.typography.cardDescription,

                        )
                    Text(
                        text = totalTime,
                        color = AppTheme.colors.textPrimary, // Placeholder for primaryText
                        style =AppTheme.typography.cardDescription,

                        )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Playback Controls
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Skip Back Button
                IconButton(
                    onClick = { /* TODO: Implement skip back */ },
                    modifier = Modifier.size(40.dp)
                ) {
                    Text(text = "<<", color = AppTheme.colors.primary, fontSize = 24.sp) // Placeholder
                }

                Spacer(modifier = Modifier.width(24.dp))

                // Rewind Button
                IconButton(
                    onClick = { /* TODO: Implement rewind */ },
                    modifier = Modifier.size(40.dp)
                ) {
                    Text(text = "<", color = AppTheme.colors.primary, fontSize = 24.sp) // Placeholder
                }

                Spacer(modifier = Modifier.width(24.dp))

                // Play/Pause Button
                IconButton(
                    onClick = { /* TODO: Implement play/pause */ },
                    modifier = Modifier
                        .size(67.dp)
                        .clip(CircleShape)
                        .background(AppTheme.colors.primary) // Placeholder for accent
                ) {
                    Text(
                        text = "▶",
                        color = AppTheme.colors.textPrimary,
                        fontSize = 32.sp,
                        modifier = Modifier
                            .fillMaxSize()
                            .wrapContentSize(Alignment.Center)
                    )
                }

                Spacer(modifier = Modifier.width(24.dp))

                // Fast Forward Button
                IconButton(
                    onClick = { /* TODO: Implement fast forward */ },
                    modifier = Modifier.size(40.dp)
                ) {
                    Text(text = ">", color = AppTheme.colors.primary, fontSize = 24.sp) // Placeholder
                }

                Spacer(modifier = Modifier.width(24.dp))

                // Skip Forward Button
                IconButton(
                    onClick = { /* TODO: Implement skip forward */ },
                    modifier = Modifier.size(40.dp)
                ) {
                    Text(text = ">>", color = AppTheme.colors.primary, fontSize = 24.sp) // Placeholder
                }
            }

            Spacer(modifier = Modifier.height(2.dp))
        }

        // Bottom Action Bar (Likes, Bookmarks, Share)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(AppTheme.colors.background) // Placeholder for background
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Heart Icon and Count
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "♡", // Placeholder character for heart
                    color = AppTheme.colors.textPrimary, // Placeholder for primaryText
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = likesCount,
                    color = AppTheme.colors.textPrimary, // Placeholder for primaryText
                    style =AppTheme.typography.cardHeading,

                    )
            }

            // Bookmark Icon and Count
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "✎", // Placeholder character for bookmark
                    color = AppTheme.colors.textPrimary, // Placeholder for primaryText
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = bookmarksCount,
                    color = AppTheme.colors.textPrimary, // Placeholder for primaryText
                    style = AppTheme.typography.cardHeading
                )
            }

            // Share Icon and Count
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "↗", // Placeholder character for share
                    color = AppTheme.colors.textPrimary, // Placeholder for primaryText
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = sharesCount,
                    color =AppTheme.colors.textPrimary,  // Placeholder for primaryText
                    style =AppTheme.typography.cardHeading,

                    )
            }
        }
        Spacer(modifier = Modifier.height(20.dp).background(AppTheme.colors.background)) // Placeholder for background
    }
}


@Preview(showBackground = true, widthDp = 360)
@Composable
fun MeditationPlayerScreenPreview() {
    MeditationPlayerScreen()
}