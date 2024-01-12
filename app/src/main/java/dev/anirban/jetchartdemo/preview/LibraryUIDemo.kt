package dev.anirban.jetchartdemo.preview

import android.graphics.drawable.BitmapDrawable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat
import dev.anirban.jetchart.common.ChartPoint
import dev.anirban.jetchart.linear.calculator.LinearEmojiData
import dev.anirban.jetchart.linear.calculator.LinearStringData
import dev.anirban.jetchart.linear.chart.LinearChart
import dev.anirban.jetchart.linear.renderer.plot.LinearBarPlot
import dev.anirban.jetchart.linear.renderer.plot.LinearGradientLinePlot
import dev.anirban.jetchart.linear.renderer.plot.LinearLinePlot
import dev.anirban.jetchartdemo.CustomCard
import dev.anirban.jetchartdemo.R

@Composable
fun LibraryUIDemo() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
    ) {

        // Design Pattern Single Line Chart
        CustomCard(
            title = "Single Line Chart"
        ) {

            LinearChart.LineChart(
                linearData = LinearStringData(
                    yAxisReadings = listOf(
                        ChartPoint.pointDataBuilder(6f, 5f, 4f, 6f, 7.5f, 7f, 6f)
                    ),
                    xAxisReadings = ChartPoint.pointDataBuilder(
                        "Jan", "Mar", "May", "Jul", "Sep", "Nov", "Dec"
                    )
                ),
                plot = LinearLinePlot(
                    lineStroke = 5f,
                    circleRadius = 8f
                )
            )
        }

        // Design Pattern Double Line Chart
        CustomCard(
            title = "Double Line Chart"
        ) {

            LinearChart.LineChart(
                linearData = LinearStringData(
                    yAxisReadings = listOf(
                        ChartPoint.pointDataBuilder(6f, 5f, 4f, 6f, 7.5f, 7f, 6f),
                        ChartPoint.pointDataBuilder(3f, 6f, 8f, 2f, 3.5f, 3f, 4f)
                    ),
                    xAxisReadings = ChartPoint.pointDataBuilder(
                        "Jan", "Mar", "May", "Jul", "Sep", "Nov", "Dec"
                    )
                ),
                plot = LinearLinePlot(
                    lineStroke = 8f,
                    circleRadius = 8f
                )
            )
        }

        // Design Pattern Triple Line Chart
        CustomCard(
            title = "Multiple Line Chart"
        ) {

            LinearChart.LineChart(
                linearData = LinearStringData(
                    yAxisReadings = listOf(
                        ChartPoint.pointDataBuilder(6f, 5f, 4f, 6f, 7.5f, 7f, 6f),
                        ChartPoint.pointDataBuilder(3f, 6f, 8f, 2f, 3.5f, 3f, 4f),
                        ChartPoint.pointDataBuilder(1f, 8f, 4f, 3f, 5.9f, 2.9f, 4.7f)
                    ),
                    xAxisReadings = ChartPoint.pointDataBuilder(
                        "Jan", "Mar", "May", "Jul", "Sep", "Nov", "Dec"
                    )
                )
            )
        }

        // Design Pattern String Marker Line Chart
        CustomCard(
            title = "String Marker Chart"
        ) {
            LinearChart.LineChart(
                linearData = LinearStringData(
                    yAxisReadings = listOf(
                        ChartPoint.pointDataBuilder(
                            4f, 3f, 0f, 2f, 3f, 4f, 2f
                        )
                    ),
                    xAxisReadings = ChartPoint.pointDataBuilder(
                        "Jan", "Mar", "May", "Jul", "Sep", "Nov", "Dec"
                    ),
                    yMarkerList = ChartPoint.pointDataBuilder(
                        "Hazardous",
                        "Very Unhealthy",
                        "Unhealthy",
                        "Moderate",
                        "Good"
                    ).toMutableList()
                )
            )
        }


        // Design Pattern String Marker Line Chart
        CustomCard(
            title = "Emoji Marker Chart"
        ) {
            LinearChart.EmojiLineChart(
                linearData = LinearEmojiData(
                    yAxisReadings = listOf(
                        ChartPoint.pointDataBuilder(
                            6f, 4f, 2f, 0f, 3f, 5f, 6f
                        )
                    ),
                    xAxisReadings = ChartPoint.pointDataBuilder(
                        "Jan", "Mar", "May", "Jul", "Sep", "Nov", "Dec"
                    ),
                    yMarkerList = ChartPoint.pointDataBuilder(
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
                    ).toMutableList()
                )
            )
        }

        // Design Pattern String Marker Gradient Line Chart using plot object
        CustomCard(
            title = "Gradient List using Plot Object"
        ) {

            LinearChart.GradientChart(
                linearData = LinearStringData(
                    yAxisReadings = listOf(
                        ChartPoint.pointDataBuilder(4f, 0f, 1.7f, 1.9f, 2f, 4f)
                    ),
                    xAxisReadings = ChartPoint.pointDataBuilder(
                        "8-9", "10-11", "12-1", "2-3", "4-5", "6-7"
                    ),
                    yMarkerList = ChartPoint.pointDataBuilder(
                        "Awake",
                        "Deep Sleep",
                        "Sleep",
                        "Asleep After",
                        "Bed Time"
                    ).toMutableList()
                ),
                plot = LinearGradientLinePlot(
                    colorList = listOf(
                        Color(0xFFE5E787).copy(alpha = .6f),
                        Color(0xFF85DE50).copy(alpha = .6f),
                        Color(0xFF57D6BF).copy(alpha = .6f),
                        Color(0xFF43B4E4).copy(alpha = .6f),
                        Color(0xFF3A60E6).copy(alpha = .6f),
                        Color(0xFF57D6BF).copy(alpha = .6f),
                        Color(0xFFD02596).copy(alpha = .6f)
                    )
                )
            )
        }

        // Design Pattern Custom Chart
        CustomCard(
            title = "Custom Chart"
        ) {

            LinearChart.CustomLinearChart(
                linearData = LinearEmojiData(
                    yAxisReadings = listOf(
                        ChartPoint.pointDataBuilder(
                            6f, 4f, 2f, 0f, 3f, 5f, 6f
                        )
                    ),
                    xAxisReadings = ChartPoint.pointDataBuilder(
                        "Jan", "Mar", "May", "Jul", "Sep", "Nov", "Dec"
                    ),
                    yMarkerList = ChartPoint.pointDataBuilder(
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
                    ).toMutableList()
                ),
                plot = LinearGradientLinePlot(
                    colorList = listOf(
                        Color(0xFFE5E787).copy(alpha = .6f),
                        Color(0xFF85DE50).copy(alpha = .6f),
                        Color(0xFF57D6BF).copy(alpha = .6f),
                        Color(0xFF43B4E4).copy(alpha = .6f),
                        Color(0xFF3A60E6).copy(alpha = .6f),
                        Color(0xFF57D6BF).copy(alpha = .6f),
                        Color(0xFFD02596).copy(alpha = .6f)
                    )
                )
            )
        }

        // Design Pattern Bar Chart
        CustomCard(
            title = "Bar Chart"
        ) {

            LinearChart.BarChart(
                linearData = LinearStringData(
                    yAxisReadings = listOf(
                        ChartPoint.pointDataBuilder(6f, 5f, 4f, 6f, 7.5f, 7f, 6f)
                    ),
                    xAxisReadings = ChartPoint.pointDataBuilder(
                        "Jan", "Mar", "May", "Jul", "Sep", "Nov", "Dec"
                    )
                ),
                plot = LinearBarPlot(
                    barWidth = 40f,
                    cornerRadius = 16f
                )
            )
        }

        // Design Pattern Emoji Bar Chart
        CustomCard(
            title = "Emoji Bar Chart"
        ) {

            LinearChart.EmojiBarChart(
                linearData = LinearEmojiData(
                    yAxisReadings = listOf(
                        ChartPoint.pointDataBuilder(
                            6f, 4f, 2f, 0f, 3f, 5f, 6f
                        )
                    ),
                    xAxisReadings = ChartPoint.pointDataBuilder(
                        "Jan", "Mar", "May", "Jul", "Sep", "Nov", "Dec"
                    ),
                    yMarkerList = ChartPoint.pointDataBuilder(
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
                    ).toMutableList()
                )
            )
        }
    }
}