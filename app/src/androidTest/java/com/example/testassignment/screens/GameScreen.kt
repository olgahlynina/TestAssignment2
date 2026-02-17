package com.example.testassignment.screens

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.common.views.KView
import com.example.testassignment.R

object GameScreen : KScreen<GameScreen>() {

    override val layoutId: Int? = R.layout.screen_game
    override val viewClass: Class<*>? = null

    val navBackButton = KView { withId(R.id.toolbar_back_button) }
    val gameContainer = KView { withId(R.id.game_container) }
}