package com.example.testassignment.screens

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.kaspersky.components.composesupport.core.KNode
import io.github.kakaocup.compose.node.element.ComposeScreen

class BonusRestrictionAlert(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<BonusRestrictionAlert>(
        semanticsProvider = semanticsProvider,
        viewBuilderAction = { hasTestTag("BonusRestrictionAlert") }
    ) {
    val alertMessage: KNode = child {
        hasTestTag("BonusRestrictionAlert:Message")
    }
    val myAccountsButton: KNode = child {
        hasTestTag("BonusRestrictionAlert:MyAccountsButton")
    }
}