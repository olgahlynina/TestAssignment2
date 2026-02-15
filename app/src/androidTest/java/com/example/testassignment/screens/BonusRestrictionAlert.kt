package com.example.testassignment.screens

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

class BonusRestrictionAlert(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<BonusRestrictionAlert>(
        semanticsProvider = semanticsProvider,
        viewBuilderAction = { hasTestTag("BonusRestrictionAlert") }
    ) {
    val alertMessage: KNode = child { hasTestTag("BonusRestrictionAlert:Message") }
    val myAccountsButton: KNode = child { hasTestTag("BonusRestrictionAlert:MyAccountsButton") }
}