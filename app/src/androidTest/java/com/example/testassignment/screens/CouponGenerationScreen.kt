package com.example.testassignment.screens

package com.example.testassignment.screens

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

class CouponGenerationScreen(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<CouponGenerationScreen>(
        semanticsProvider = semanticsProvider,
        viewBuilderAction = { hasTestTag("CouponGenerationScreen") }
    ) {
    val navBackButton: KNode = child { hasTestTag("CouponGenerationScreen:NavBackButton") }
}