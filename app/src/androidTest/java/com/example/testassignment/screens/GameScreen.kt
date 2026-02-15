package com.example.testassignment.screens

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.kaspersky.components.composesupport.core.KNode
import io.github.kakaocup.compose.node.element.ComposeScreen

class GameScreen(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<GameScreen>(
        semanticsProvider = semanticsProvider,
        viewBuilderAction = { hasTestTag("GameScreen") }
    ) {
    val navBackButton: KNode = child {
        hasTestTag("GameScreen:NavBackButton")
    }
}