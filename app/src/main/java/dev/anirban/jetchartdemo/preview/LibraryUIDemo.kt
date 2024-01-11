package dev.anirban.jetchartdemo.preview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.anirban.jetchart.common.ChartPoint
import dev.anirban.jetchart.linear.calculator.LinearStringData
import dev.anirban.jetchart.linear.chart.LinearChart
import dev.anirban.jetchart.linear.renderer.plot.LinearLinePlot
import dev.anirban.jetchartdemo.CustomCard

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
    }
}