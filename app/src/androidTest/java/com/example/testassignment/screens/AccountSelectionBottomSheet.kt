package com.example.testassignment.screens

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.kakao.common.views.KView
import android.view.View
import org.hamcrest.Matcher
import com.example.testassignment.R

object AccountSelectionBottomSheet : KScreen<AccountSelectionBottomSheet>() {

    override val layoutId: Int? = R.layout.bottom_sheet_account_selection
    override val viewClass: Class<*>? = null

    val accountsList = KRecyclerView(
        builder = { withId(R.id.accounts_recycler) },
        itemTypeBuilder = { itemType(::AccountItem) }
    )

    class AccountItem(parent: Matcher<View>) : KRecyclerItem<AccountItem>(parent) {
        val accountName = KTextView(parent) { withId(R.id.account_name) }
        val rootView = KView(parent) { withId(R.id.account_item_root) }
    }
}