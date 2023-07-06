package com.menna.cenimateckets.composable.booking

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.cenimateckets.R
import com.menna.cenimateckets.composable.Genre
import com.menna.cenimateckets.composable.PrimaryButton
import com.menna.cenimateckets.composable.SpacerHorizontal8

@Composable
fun BottomSheet(
    modifier: Modifier = Modifier
) {
    Surface(modifier = modifier
        .clip(
            RoundedCornerShape(topStartPercent = 10, topEndPercent = 10)
        )
       ) {
        Column(
            modifier = Modifier.padding(vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp, horizontal = 48.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Rate(rate = "6.8", totalRate = "/10", title = "IMDb")
                Rate(rate = "63%", totalRate = "", title = "Rotten Tomatoes")
                Rate(rate = "4", totalRate = "/10", title = "IGN")
            }
            Text(
                text = "Fantastic Beasts: The Secrets of Dumbledore",
                modifier = Modifier.padding(vertical = 16.dp, horizontal = 48.dp),
                textAlign = TextAlign.Center,
                fontSize = 24.sp,
            )
            Row {
                Genre(text = "Fantasy")
                SpacerHorizontal8()
                Genre(text = "Adventure")
            }
            Spacer(modifier = Modifier.height(16.dp))
            ImageCard()
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Professor Albus Dumbledore knows the powerful, " +
                        "dark wizard Gellert Grindelwald is moving to seize control of the wizarding world. ",
                modifier = Modifier.padding(horizontal = 24.dp),
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
            )
            Spacer(modifier = Modifier.height(16.dp))
            PrimaryButton(text = "Booking", painter = painterResource(id = R.drawable.ticket))
        }
    }
}