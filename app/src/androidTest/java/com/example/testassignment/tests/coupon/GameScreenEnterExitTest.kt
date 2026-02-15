package com.example.testassignment.tests.coupon

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.testassignment.MainActivity
import com.example.testassignment.screens.CouponScreen
import com.example.testassignment.screens.GameScreen
import com.kaspersky.components.composesupport.config.withComposeSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import io.github.kakaocup.compose.node.element.ComposeScreen.Companion.onComposeScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class GameScreenEnterExitTest : TestCase(
    kaspressoBuilder = Kaspresso.Builder.withComposeSupport()
) {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    // Preconditions: в купоне есть событие, открыт экран Купон

    @Test
    fun gameScreenEnterExitFromCoupon() = run {

        step("Вход на экран игры — тап на ячейку события") {
            onComposeScreen<CouponScreen>(composeTestRule) {
                eventCell {
                    assertIsDisplayed()
                    performClick()
                }
            }
        }

        step("Проверка перехода на экран игры") {
            onComposeScreen<GameScreen>(composeTestRule) {
                assertIsDisplayed()
            }
        }

        step("Выход по кнопке Назад в навбаре") {
            onComposeScreen<GameScreen>(composeTestRule) {
                navBackButton {
                    assertIsDisplayed()
                    performClick()
                }
            }
        }

        step("Проверка возврата на экран Купон") {
            onComposeScreen<CouponScreen>(composeTestRule) {
                assertIsDisplayed()
            }
        }

        step("Снова войти на экран игры") {
            onComposeScreen<CouponScreen>(composeTestRule) {
                eventCell {
                    assertIsDisplayed()
                    performClick()
                }
            }
        }

        step("Выход по системной кнопке Назад") {
            device.exploit.pressBack()
        }

        step("Проверка возврата на экран Купон") {
            onComposeScreen<CouponScreen>(composeTestRule) {
                assertIsDisplayed()
            }
        }
    }
}
