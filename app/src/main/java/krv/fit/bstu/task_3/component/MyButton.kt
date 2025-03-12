package krv.fit.bstu.task_3.component

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import krv.fit.bstu.task_3.ui.theme.PrimaryColor
import krv.fit.bstu.task_3.ui.theme.TextBasicColor

@Composable
fun Button(
   modifier: Modifier,
   text: String
) {
    androidx.compose.material3.Button(
        onClick = {},
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = PrimaryColor,
            contentColor = TextBasicColor
        ),
    ) {
        Text(
            text = text,
            color = TextBasicColor,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 17.sp,)
    }
}