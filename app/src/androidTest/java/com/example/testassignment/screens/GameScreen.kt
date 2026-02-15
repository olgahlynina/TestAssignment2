package com.example.testassignment.screens

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

class GameScreen(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<GameScreen>(
        semanticsProvider = semanticsProvider,
        viewBuilderAction = { hasTestTag("GameScreen") }
    ) {
    val navBackButton: KNode = child { hasTestTag("GameScreen:NavBackButton") }
}