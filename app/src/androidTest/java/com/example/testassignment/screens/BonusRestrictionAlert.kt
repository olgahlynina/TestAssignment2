package com.example.testassignment.screens

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.kakao.text.KButton
import com.example.testassignment.R

object BonusRestrictionAlert : KScreen<BonusRestrictionAlert>() {

    override val layoutId: Int? = R.layout.dialog_bonus_restriction
    override val viewClass: Class<*>? = null

    val alertMessage = KTextView { withId(R.id.alert_message_text) }
    val myAccountsButton = KButton { withId(R.id.my_accounts_button) }
}