package com.menna.cenimateckets.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.menna.cenimateckets.R
import com.menna.cenimateckets.composable.home.BottomNavigation
import com.menna.cenimateckets.composable.home.CategoryChips
import com.menna.cenimateckets.composable.Genre
import com.menna.cenimateckets.composable.home.Pager
import com.menna.cenimateckets.composable.SpacerHorizontal8
import com.menna.cenimateckets.composable.Time
import com.menna.cenimateckets.ui.theme.OnBackground_87

@Composable
fun HomeScreen() {
    Box() {
        Image(
            painter = painterResource(R.drawable.slider2),
            modifier = Modifier
                .fillMaxWidth()
                .blur(32.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded),
            contentDescription = "")}
Column (
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceBetween,
    modifier = Modifier
        .fillMaxWidth()
){
        CategoryChips()
        Pager()
        Spacer(modifier = Modifier.height(28.dp))
        Time( backgroundColor = Color.Transparent , textColor = OnBackground_87)
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "Fantastic Beasts: The Secrets of Dumbledore",
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
        )

        Spacer(modifier = Modifier.height(4.dp))
        Row {
            Genre(text = "Fantasy")
            SpacerHorizontal8()
            Genre(text = "Adventure")
        }
        Spacer(modifier = Modifier.height(8.dp))
        BottomNavigation(isSelected = true)
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}