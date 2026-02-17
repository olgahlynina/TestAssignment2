package com.example.testassignment.tests.wallet

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.testassignment.MainActivity
import com.example.testassignment.screens.AccountSelectionBottomSheet
import com.example.testassignment.screens.BonusRestrictionAlert
import com.example.testassignment.screens.PopularScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

// TC-698366: Бонусные счета. Отсутствие запрещенных: на Спорт, 1xGames. Positive
@RunWith(AndroidJUnit4::class)
class BonusAccountsRestrictionTest : TestCase() {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun restrictedBonusAccountsAreAbsentInBottomSheet() = run {

        step("Открыт таб Топ в разделе Популярное") {
            PopularScreen {
                tabLayout {
                    isVisible()
                    selectTab(1)
                }
            }
        }

        step("Тап на слот Игра недели") {
            PopularScreen {
                weeklyGameSlot {
                    isVisible()
                    click()
                }
            }
        }

        step("В боттоме выбора счёта выбрать Бонусный на Слоты") {
            AccountSelectionBottomSheet {
                accountsList {
                    childWith<AccountSelectionBottomSheet.AccountItem> {
                        withDescendant { withText("Бонусный на Слоты") }
                    } perform {
                        isVisible()
                        click()
                    }
                }
            }
        }

        step("Отображается алерт о запрете игры с бонусного счёта") {
            BonusRestrictionAlert {
                alertMessage {
                    isVisible()
                    containsText("В этой игре нет возможности играть с бонусного счёта")
                }
                myAccountsButton { isVisible() }
            }
        }

        step("Тап на кнопку Мои счета — открывается боттом выбора счёта") {
            BonusRestrictionAlert {
                myAccountsButton { click() }
            }
        }

        step("Доступные счета отображаются") {
            AccountSelectionBottomSheet {
                accountsList {
                    childWith<AccountSelectionBottomSheet.AccountItem> {
                        withDescendant { withText("Основной") }
                    } perform {
                        isVisible()
                    }

                    childWith<AccountSelectionBottomSheet.AccountItem> {
                        withDescendant { withText("Валютный") }
                    } perform {
                        isVisible()
                    }

                    childWith<AccountSelectionBottomSheet.AccountItem> {
                        withDescendant { withText("Бонусный на Слоты") }
                    } perform {
                        isVisible()
                    }
                }
            }
        }
    }
}