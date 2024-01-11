package dev.anirban.jetchart.renderer.plot

import androidx.compose.ui.graphics.drawscope.DrawScope
import dev.anirban.jetchart.calculator.LinearDataInterface
import dev.anirban.jetchart.common.decoration.LinearDecoration

/**
 * This is the interface which needs to be every graph plot logic to work in the Library
 *
 * Implementations for this interface are :- [LinearBarPlot] , [LinearLinePlot]
 */
interface LinearPlotInterface {

    /**
     * This function plots the graph points
     */
    fun DrawScope.plotChart(
        linearData: LinearDataInterface,
        decoration: LinearDecoration
    )
}