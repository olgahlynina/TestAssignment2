package com.example.testassignment.screens

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.kaspersky.components.composesupport.core.KNode
import io.github.kakaocup.compose.node.element.ComposeScreen

class CouponGenerationScreen(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<CouponGenerationScreen>(
        semanticsProvider = semanticsProvider,
        viewBuilderAction = { hasTestTag("CouponGenerationScreen") }
    ) {
    val navBackButton: KNode = child {
        hasTestTag("CouponGenerationScreen:NavBackButton")
    }
}