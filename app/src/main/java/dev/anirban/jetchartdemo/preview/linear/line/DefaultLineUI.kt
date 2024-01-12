package dev.anirban.jetchartdemo.preview.linear.line

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.anirban.jetchart.linear.calculator.LinearEmojiData
import dev.anirban.jetchart.linear.calculator.LinearStringData
import dev.anirban.jetchart.linear.chart.LinearChart
import dev.anirban.jetchartdemo.CustomCard
import dev.anirban.jetchartdemo.preview.linear.line.LineExampleTokens.chartPointList
import dev.anirban.jetchartdemo.preview.linear.line.LineExampleTokens.chartXAxis
import dev.anirban.jetchartdemo.preview.linear.line.LineExampleTokens.chartYAxisLabels
import dev.anirban.jetchartdemo.preview.linear.line.LineExampleTokens.getYEmojiMarker
import dev.anirban.jetchartdemo.preview.linear.line.LineExampleTokens.levelChartPointList
import dev.anirban.jetchartdemo.ui.theme.JetChartDemoTheme


// Preview Composable Function
@Preview(
    "Light",
    heightDp = 2000,
    showBackground = true
)
@Preview(
    name = "Dark",
    heightDp = 2000,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true
)
@Composable
private fun DefaultPreview() {
    JetChartDemoTheme {

        // Call Function Here
        DefaultLineUI()
    }
}


@Composable
fun DefaultLineUI() {

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
    ) {

        // Default Line Chart (Single)
        CustomCard(title = "Default Line Chart (Single)") {
            LinearChart.LineChart(
                linearData = LinearStringData(
                    yAxisReadings = listOf(chartPointList[0]),
                    xAxisReadings = chartXAxis
                )
            )
        }

        // Default Line Chart (Double)
        CustomCard(title = "Default Line Chart (Double)") {

            LinearChart.LineChart(
                linearData = LinearStringData(
                    yAxisReadings = listOf(chartPointList[0], chartPointList[1]),
                    xAxisReadings = chartXAxis
                )
            )
        }


        // Default Line Chart (Multiple)
        CustomCard(title = "Default Line Chart (Multiple)") {

            LinearChart.LineChart(
                linearData = LinearStringData(
                    yAxisReadings = listOf(chartPointList[0], chartPointList[1], chartPointList[2]),
                    xAxisReadings = chartXAxis
                )
            )
        }

        // Default Line Chart (Multiple)
        CustomCard(title = "Default Line Chart (Multiple)") {

            LinearChart.LineChart(
                linearData = LinearStringData(
                    yAxisReadings = listOf(
                        chartPointList[0],
                        chartPointList[1],
                        chartPointList[2],
                        chartPointList[3]
                    ),
                    xAxisReadings = chartXAxis
                )
            )
        }

        // Default String Marker Line Chart (Single)
        CustomCard(title = "Default String Marker Line Chart (Single)") {
            LinearChart.LineChart(
                linearData = LinearStringData(
                    yAxisReadings = listOf(levelChartPointList[0]),
                    xAxisReadings = chartXAxis,
                    yMarkerList = chartYAxisLabels.toMutableList()
                )
            )
        }

        // Default String Marker Line Chart (Double)
        CustomCard(title = "Default String Marker Line Chart (Double)") {
            LinearChart.LineChart(
                linearData = LinearStringData(
                    yAxisReadings = listOf(levelChartPointList[0], levelChartPointList[1]),
                    xAxisReadings = chartXAxis,
                    yMarkerList = chartYAxisLabels.toMutableList()
                )
            )
        }

        // Default String Marker Line Chart (Multiple)
        CustomCard(title = "Default String Marker Line Chart (Multiple)") {
            LinearChart.LineChart(
                linearData = LinearStringData(
                    yAxisReadings = listOf(
                        levelChartPointList[0],
                        levelChartPointList[1],
                        levelChartPointList[2]
                    ),
                    xAxisReadings = chartXAxis,
                    yMarkerList = chartYAxisLabels.toMutableList()
                )
            )
        }


        // Default Emoji Marker Line Chart (Single)
        CustomCard(title = "Default Emoji Marker Line Chart (Single)") {
            LinearChart.EmojiLineChart(
                linearData = LinearEmojiData(
                    yAxisReadings = listOf(levelChartPointList[0]),
                    xAxisReadings = chartXAxis,
                    yMarkerList = getYEmojiMarker().toMutableList()
                )
            )
        }

        // Default Emoji Marker Line Chart (Double)
        CustomCard(title = "Default Emoji Marker Line Chart (Double)") {
            LinearChart.EmojiLineChart(
                linearData = LinearEmojiData(
                    yAxisReadings = listOf(levelChartPointList[0], levelChartPointList[1]),
                    xAxisReadings = chartXAxis,
                    yMarkerList = getYEmojiMarker().toMutableList()
                )
            )
        }

        // Default Emoji Marker Line Chart (Multiple)
        CustomCard(title = "Default Emoji Marker Line Chart (Multiple)") {
            LinearChart.EmojiLineChart(
                linearData = LinearEmojiData(
                    yAxisReadings = listOf(
                        levelChartPointList[0],
                        levelChartPointList[1],
                        levelChartPointList[2]
                    ),
                    xAxisReadings = chartXAxis,
                    yMarkerList = getYEmojiMarker().toMutableList()
                )
            )
        }
    }
}