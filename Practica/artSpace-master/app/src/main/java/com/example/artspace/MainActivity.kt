package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme
import com.example.artspace.ui.theme.Purple80
import com.example.artspace.ui.theme.PurpleGrey80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceApp()
                }
            }
        }
    }
}

data class ArtData(
    val textLabelResourceId: Int,
    val drawableResourceId: Int,
    val contentDescriptionResourceId: Int
)

@Composable
fun ArtSpaceApp() {
    val artDataList = listOf(
        ArtData(R.string.frame_description1, R.drawable.cuadro1, R.string.frame_name1),
        ArtData(R.string.frame_description2, R.drawable.cuadro2, R.string.frame_name2),
        ArtData(R.string.frame_description3, R.drawable.cuadro3, R.string.frame_name3)
    )

    var currentStep by remember { mutableStateOf(0) }

    Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.purple_200))
                .padding(start = 20.dp, end = 16.dp)
        ) {
            TextImageAndButton(
                artData = artDataList[currentStep],
                onNextClick = {
                    if (currentStep < artDataList.size - 1) {
                        currentStep++
                    }
                },
                onPrevClick = {
                    if (currentStep > 0) {
                        currentStep--
                    }
                }
            )
        }
}

@Composable
fun TextImageAndButton(
    artData: ArtData,
    onNextClick: () -> Unit,
    onPrevClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = stringResource(id = artData.textLabelResourceId),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(id = artData.drawableResourceId),
            contentDescription = stringResource(id = artData.contentDescriptionResourceId),
            modifier = Modifier
                .height(300.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .border(4.dp, colorResource(id = R.color.black), shape = RoundedCornerShape(20.dp))
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = onPrevClick,
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp),
                colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.white),
                    contentColor = colorResource(id = R.color.purple_500)
                )
            ) {
                Text(
                    text = stringResource(R.string.previous),
                    color = colorResource(id = R.color.purple_500)
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(
                onClick = onNextClick,
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp),
                colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.white),
                    contentColor = colorResource(id = R.color.purple_500)
                )
            ) {
                Text(
                    text = stringResource(R.string.next),
                    color = colorResource(id = R.color.purple_500)
                )
            }
        }
    }
}
