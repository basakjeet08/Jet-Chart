package dev.anirban.jetchartdemo.preview.linear.line

import android.graphics.drawable.BitmapDrawable
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat
import dev.anirban.jetchart.common.ChartPoint
import dev.anirban.jetchartdemo.R

object LineExampleTokens {

    // Chart Point Lists which can be used for the Charts UI
    val chartPointList = listOf(
        ChartPoint.pointDataBuilder(6f, 5f, 4f, 6f, 7.5f, 7f, 6f),
        ChartPoint.pointDataBuilder(3f, 6f, 8f, 2f, 3.5f, 3f, 4f),
        ChartPoint.pointDataBuilder(1f, 8f, 4f, 3f, 5.9f, 2.9f, 4.7f),
        ChartPoint.pointDataBuilder(2f, 4f, 6f, 1f, 5f, 1f, 8f)
    )

    // Level Chart Testing Points
    val levelChartPointList = listOf(
        ChartPoint.pointDataBuilder(4f, 3f, 0f, 2f, 3f, 4f, 2f),
        ChartPoint.pointDataBuilder(1f, 2f, 4f, 2f, 4f, 1f, 3f),
        ChartPoint.pointDataBuilder(3f, 2f, 1f, 4f, 2f, 2f, 1f)
    )

    // Chart X Axis Labels
    val chartXAxis = ChartPoint.pointDataBuilder(
        "Jan", "Mar", "May", "Jul", "Sep", "Nov", "Dec"
    )

    // Y Level Marker Labels
    val chartYAxisLabels = ChartPoint.pointDataBuilder(
        "Level 1",
        "Level 2",
        "Level 3",
        "Level 4",
        "Level 5"
    )


    // Y Emoji Marker Labels
    @Composable
    fun getYEmojiMarker(): List<ChartPoint<BitmapDrawable>> {
        return ChartPoint.pointDataBuilder(
            ContextCompat.getDrawable(
                LocalContext.current,
                R.drawable.emoji_furious
            ) as BitmapDrawable,
            ContextCompat.getDrawable(
                LocalContext.current,
                R.drawable.emoji_angry
            ) as BitmapDrawable,
            ContextCompat.getDrawable(
                LocalContext.current,
                R.drawable.emoji_sad
            ) as BitmapDrawable,
            ContextCompat.getDrawable(
                LocalContext.current,
                R.drawable.emoji_depressed
            ) as BitmapDrawable,
            ContextCompat.getDrawable(
                LocalContext.current,
                R.drawable.emoji_confused
            ) as BitmapDrawable,
            ContextCompat.getDrawable(
                LocalContext.current,
                R.drawable.emoji_calm
            ) as BitmapDrawable,
            ContextCompat.getDrawable(
                LocalContext.current,
                R.drawable.emoji_happy
            ) as BitmapDrawable
        )
    }
}