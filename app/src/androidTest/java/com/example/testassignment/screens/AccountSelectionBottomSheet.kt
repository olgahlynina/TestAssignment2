package com.example.testassignment.screens

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode

class AccountSelectionBottomSheet(semanticsProvider: SemanticsNodeInteractionsProvider) :
    ComposeScreen<AccountSelectionBottomSheet>(
        semanticsProvider = semanticsProvider,
        viewBuilderAction = { hasTestTag("AccountSelectionBottomSheet") }
    ) {
    val bonusSlotsAccount: KNode = child { hasTestTag("Account:BonusSlots") }
    val mainAccount: KNode = child { hasTestTag("Account:Main") }
    val currencyAccount: KNode = child { hasTestTag("Account:Currency") }
    val sportBonusAccount: KNode = child { hasTestTag("Account:BonusSport") }
    val xGamesBonusAccount: KNode = child { hasTestTag("Account:BonusXGames") }
}