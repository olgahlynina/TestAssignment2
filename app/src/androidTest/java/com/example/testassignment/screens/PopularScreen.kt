package com.example.testassignment.screens

package com.example.testassignment.screens

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

class PopularScreen(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<PopularScreen>(
        semanticsProvider = semanticsProvider,
        viewBuilderAction = { hasTestTag("PopularScreen") }
    ) {
    val tabTop: KNode = child { hasTestTag("PopularScreen:TabTop") }
    val weeklyGameSlot: KNode = child { hasTestTag("PopularScreen:WeeklyGameSlot") }
}