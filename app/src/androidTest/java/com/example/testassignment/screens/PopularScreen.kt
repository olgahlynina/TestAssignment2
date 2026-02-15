package com.example.testassignment.screens

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.kaspersky.components.composesupport.core.KNode
import io.github.kakaocup.compose.node.element.ComposeScreen

class PopularScreen(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<PopularScreen>(
        semanticsProvider = semanticsProvider,
        viewBuilderAction = { hasTestTag("PopularScreen") }
    ) {
    val tabTop: KNode = child {
        hasTestTag("PopularScreen:TabTop")
    }
    val weeklyGameSlot: KNode = child {
        hasTestTag("PopularScreen:WeeklyGameSlot")
    }
}