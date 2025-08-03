import androidx.compose.foundation.Indication
import androidx.compose.foundation.border
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.unit.dp
import com.example.mindbodywellness.theme.AppTheme


@Composable
fun CustomBorderCheckbox(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    val borderColor = if (checked) AppTheme.colors.primary else AppTheme.colors.secondary
    val checkboxSize = 22.dp
    val cornerRadius = 4.dp
    val interactionSource = remember { MutableInteractionSource() }

    Box(
        modifier = modifier
            .size(checkboxSize)
            .border(2.dp, borderColor, RoundedCornerShape(cornerRadius))
            .clip(RoundedCornerShape(cornerRadius))
    ) {
        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange,
            colors = CheckboxDefaults.colors(
                checkedColor = Color.Transparent,
                uncheckedColor = Color.Transparent,
                checkmarkColor = AppTheme.colors.primary

            ),
            modifier = Modifier.size(checkboxSize),
            interactionSource = interactionSource
        )
    }
}