package krv.fit.bstu.task_3.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import krv.fit.bstu.task_3.R
import krv.fit.bstu.task_3.list.AccountsList
import krv.fit.bstu.task_3.ui.theme.SurfaceColor
import krv.fit.bstu.task_3.ui.theme.TextBasicColor
import krv.fit.bstu.task_3.ui.theme.TextGreyColor


@Composable
fun AccountCard(
    currentAccount: String,
    onCardClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = {} ),
        colors = CardDefaults.cardColors(
            containerColor = SurfaceColor,
        )
    ) {
        Row( modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically) {

            Image(
                painter = painterResource(id = R.drawable.card),
                contentDescription = "",
                modifier = Modifier
                    .wrapContentWidth()
                    .size(85.dp)
                    .padding(bottom = 15.dp, start = 16.dp)
            )
            Column(modifier = Modifier
                .padding(16.dp)
                .weight(1f)
            ) {
                Text(
                    text = currentAccount,
                    color = TextBasicColor,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 15.sp,
                )
                Spacer(Modifier.height(3.dp))
                Text(
                    text = "12121",
                    color = TextGreyColor,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 15.sp,
                    )
                Spacer(Modifier.height(3.dp))
                Text(
                    text = ".... 121222",
                    color = TextGreyColor,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 15.sp,
                )
            }

            Column {
                FloatingActionButton(
                    onClick = {
                    },
                    modifier = Modifier
                        .padding(end = 5.dp, ),
                    elevation = FloatingActionButtonDefaults.elevation(0.dp),
                    containerColor = SurfaceColor,
                ) {
                    Icon(
                        Icons.Filled.KeyboardArrowRight,
                        contentDescription = "Next",
                        tint = TextGreyColor)
                }
            }
        }
    }
}