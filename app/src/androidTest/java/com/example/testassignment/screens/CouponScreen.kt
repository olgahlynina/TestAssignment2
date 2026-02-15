package com.example.testassignment.screens

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.kaspersky.components.composesupport.core.KNode
import io.github.kakaocup.compose.node.element.ComposeScreen

class CouponScreen(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<CouponScreen>(
        semanticsProvider = semanticsProvider,
        viewBuilderAction = { hasTestTag("CouponScreen") }
    ) {
    val eventCell: KNode = child {
        hasTestTag("CouponScreen:EventCell")
    }
    val couponGenerationItem: KNode = child {
        hasTestTag("CouponScreen:GenerationItem")
    }
}