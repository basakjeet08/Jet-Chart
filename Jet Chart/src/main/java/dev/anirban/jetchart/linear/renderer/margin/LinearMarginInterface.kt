package dev.anirban.jetchart.linear.renderer.margin

import androidx.compose.ui.graphics.drawscope.DrawScope
import dev.anirban.jetchart.linear.calculator.LinearDataInterface
import dev.anirban.jetchart.linear.decoration.LinearDecoration

/**
 * This is the interface which defines that all the Implementation for the Drawing of the margins
 * need to implement this interface.
 *
 * Implementations for this interface are :- [LinearStringMargin]
 *
 */
interface LinearMarginInterface {

    /**
     * This function draws the margins in the graph according to the implementation passed
     *
     * @param linearData This is the data for the graph
     * @param decoration This is the decoration for the graph
     */
    fun DrawScope.drawMargin(
        linearData: LinearDataInterface,
        decoration: LinearDecoration
    )
}