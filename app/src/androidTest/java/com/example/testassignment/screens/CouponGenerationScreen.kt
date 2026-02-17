package com.example.testassignment.screens

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.common.views.KView
import com.example.testassignment.R

object CouponGenerationScreen : KScreen<CouponGenerationScreen>() {

    override val layoutId: Int? = R.layout.screen_coupon_generation
    override val viewClass: Class<*>? = null

    val navBackButton = KView { withId(R.id.toolbar_back_button) }
    val screenContainer = KView { withId(R.id.coupon_generation_container) }
}