package com.example.mindbodywellness.ui.theme.components

import CustomBorderCheckbox
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mindbodywellness.R
import com.example.mindbodywellness.theme.AppTheme


@Composable
fun ThemedButton(
    text: String,
    onClick: () -> Unit,
    style: TextStyle,
    modifier: Modifier = Modifier,
    containerColor: Color = AppTheme.colors.secondary, // Use theme color
    contentColor: Color = AppTheme.colors.onSecondary, // Use theme color

) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor = contentColor
        ),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp) // Standard padding
    ) {
        Text(
            text = text,
            style = AppTheme.typography.headingThin,
        )
    }
}

@Composable
fun OutlinedChip(
    text: String,
    selected: Boolean,
    onClick: () -> Unit,
    fontFamily: FontFamily,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(
            width = 2.dp,
            color = if (selected) AppTheme.colors.primary else AppTheme.colors.secondary
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = AppTheme.colors.onSurface
        ),
        contentPadding = PaddingValues(horizontal = 19.dp, vertical = 10.dp)
    ) {
        Text(
            text = text,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp
        )
    }
}


@Composable
fun GoalCheckboxItem(
    isChecked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    text: String,
    fontFamily: FontFamily,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null        // optional: remove ripple
            ) { onCheckedChange(!isChecked) }   // <-- toggle
            .padding(vertical = 8.dp),          // add touch-height
        horizontalArrangement = Arrangement.spacedBy(14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        CustomBorderCheckbox(
            checked = isChecked,
            onCheckedChange = onCheckedChange   // already wired to the same lambda
        )
        Text(
            text = text,
            color = AppTheme.colors.onBackground,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 17.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier.weight(1f)
        )
    }
}
