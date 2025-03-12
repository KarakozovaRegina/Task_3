package krv.fit.bstu.task_3.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import krv.fit.bstu.task_3.list.AccountsList
import krv.fit.bstu.task_3.ui.theme.BackgroundColor
import krv.fit.bstu.task_3.ui.theme.PrimaryColor
import krv.fit.bstu.task_3.ui.theme.SurfaceColor
import krv.fit.bstu.task_3.ui.theme.TextBasicColor



@Composable
fun AccountSelectionDialog(
    onDismiss: () -> Unit
) {
    AlertDialog(
        modifier = Modifier.fillMaxWidth(),
        onDismissRequest = { } ,
        title = {
            Text(
                "Select the account",
                modifier = Modifier.fillMaxWidth(),
                color = TextBasicColor,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                fontSize = 34.sp,
                ) },
        text = {
            LazyColumn {

            }
        },
        confirmButton = {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = PrimaryColor,
                    contentColor = TextBasicColor
                ),) {
                Text(
                    text = "Submit",
                    color = TextBasicColor,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp,)
            }
        },
        containerColor = BackgroundColor

    )
}