package com.example.testassignment.screens

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.common.views.KView
import android.view.View
import org.hamcrest.Matcher
import com.example.testassignment.R

object CouponScreen : KScreen<CouponScreen>() {

    override val layoutId: Int? = R.layout.screen_coupon
    override val viewClass: Class<*>? = null

    val eventsList = KRecyclerView(
        builder = { withId(R.id.coupon_events_recycler) },
        itemTypeBuilder = { itemType(::EventItem) }
    )

    val couponGenerationButton = KButton { withId(R.id.coupon_generation_button) }

    class EventItem(parent: Matcher<View>) : KRecyclerItem<EventItem>(parent) {
        val rootView = KView(parent) { withId(R.id.event_cell_root) }
    }
}