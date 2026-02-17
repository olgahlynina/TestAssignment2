package com.example.testassignment.screens

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.tabs.KTabLayout
import io.github.kakaocup.kakao.common.views.KView
import com.example.testassignment.R

object PopularScreen : KScreen<PopularScreen>() {

    override val layoutId: Int? = R.layout.screen_popular
    override val viewClass: Class<*>? = null

    val tabLayout = KTabLayout { withId(R.id.popular_tabs) }
    val weeklyGameSlot = KView { withId(R.id.weekly_game_slot) }
}