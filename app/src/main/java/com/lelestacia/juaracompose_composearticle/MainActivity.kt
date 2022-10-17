package com.lelestacia.juaracompose_composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lelestacia.juaracompose_composearticle.ui.theme.JuaraComposeComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JuaraComposeComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentHeight(Alignment.Top),
                    color = MaterialTheme.colors.background
                ) {
                    val title = stringResource(id = R.string.title)
                    val firstContent = stringResource(id = R.string.first_content)
                    val secondContent = stringResource(id = R.string.second_content)
                    Column {
                        HeaderImage()
                        SetContent(title, firstContent, secondContent)
                    }
                }
            }
        }
    }
}

@Composable
fun HeaderImage() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = "Header Image",
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun SetContent(title: String, first: String, second: String) {
    Column {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = first,
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = second,
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JuaraComposeComposeArticleTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentHeight(Alignment.Top),
            color = MaterialTheme.colors.background
        ) {
            val title = stringResource(id = R.string.title)
            val firstContent = stringResource(id = R.string.first_content)
            val secondContent = stringResource(id = R.string.second_content)
            Column {
                HeaderImage()
                SetContent(title, firstContent, secondContent)
            }
        }
    }
}