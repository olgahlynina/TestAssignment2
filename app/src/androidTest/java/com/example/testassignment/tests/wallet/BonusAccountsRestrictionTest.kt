package com.example.testassignment.tests.wallet

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.testassignment.MainActivity
import com.example.testassignment.screens.AccountSelectionBottomSheet
import com.example.testassignment.screens.BonusRestrictionAlert
import com.example.testassignment.screens.PopularScreen
import com.kaspersky.components.composesupport.config.withComposeSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import io.github.kakaocup.compose.node.element.ComposeScreen.Companion.onComposeScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BonusAccountsRestrictionTest : TestCase(
    kaspressoBuilder = Kaspresso.Builder.withComposeSupport()
) {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun restrictedBonusAccountsAreAbsentInBottomSheet() = run {

        step("Открыт таб Топ в разделе Популярное") {
            onComposeScreen<PopularScreen>(composeTestRule) {
                tabTop {
                    assertIsDisplayed()
                    performClick()
                }
            }
        }

        step("Тап на слот Игра недели") {
            onComposeScreen<PopularScreen>(composeTestRule) {
                weeklyGameSlot {
                    assertIsDisplayed()
                    performClick()
                }
            }
        }

        step("В боттоме выбора счёта выбрать Бонусный на Слоты") {
            onComposeScreen<AccountSelectionBottomSheet>(composeTestRule) {
                bonusSlotsAccount {
                    assertIsDisplayed()
                    performClick()
                }
            }
        }

        step("Отображается алерт о запрете игры с бонусного счёта") {
            onComposeScreen<BonusRestrictionAlert>(composeTestRule) {
                alertMessage {
                    assertIsDisplayed()
                    assertTextContains("В этой игре нет возможности играть с бонусного счёта. Смените счёт и повторите попытку")
                }
                myAccountsButton {
                    assertIsDisplayed()
                }
            }
        }

        step("Тап на кнопку Мои счета — открывается боттом выбора счёта") {
            onComposeScreen<BonusRestrictionAlert>(composeTestRule) {
                myAccountsButton {
                    performClick()
                }
            }
        }

        step("Запрещённые счета отсутствуют в списке") {
            onComposeScreen<AccountSelectionBottomSheet>(composeTestRule) {
                sportBonusAccount {
                    assertDoesNotExist()
                }
                xGamesBonusAccount {
                    assertDoesNotExist()
                }
            }
        }

        step("Доступные счета отображаются") {
            onComposeScreen<AccountSelectionBottomSheet>(composeTestRule) {
                mainAccount { assertIsDisplayed() }
                currencyAccount { assertIsDisplayed() }
                bonusSlotsAccount { assertIsDisplayed() }
            }
        }
    }
}