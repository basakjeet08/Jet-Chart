package dev.anirban.jetchart.linear.renderer.colorconvention

import androidx.compose.runtime.Composable
import dev.anirban.jetchart.linear.decoration.LinearDecoration

/**
 * This implementation shall be implemented by all the classes which are making color convention
 * implementation
 *
 * Implementations for this interface are :- [LinearDefaultColorConvention],
 * [LinearGridColorConvention]
 *
 * @property DrawColorConventions THis function draws the desired color Convention
 */
interface LinearColorConventionInterface {

    /**
     * This variable contains the list of strings which needs to be drawn in the color convention
     */
    val textList: List<String>

    /**
     * This is the function which draws all the color convention
     */
    @Composable
    fun DrawColorConventions(decoration: LinearDecoration)

}