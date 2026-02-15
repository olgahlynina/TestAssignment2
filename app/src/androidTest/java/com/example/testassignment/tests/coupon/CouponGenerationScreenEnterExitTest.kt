package com.example.testassignment.tests.coupon

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.testassignment.MainActivity
import com.example.testassignment.screens.CouponGenerationScreen
import com.example.testassignment.screens.CouponScreen
import com.kaspersky.components.composesupport.config.withComposeSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import io.github.kakaocup.compose.node.element.ComposeScreen.Companion.onComposeScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CouponGenerationScreenEnterExitTest : TestCase(
    kaspressoBuilder = Kaspresso.Builder.withComposeSupport()
) {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun couponGenerationScreenEnterExit() = run {

        step("Вход на экран Генерация купона — тап на пункт") {
            onComposeScreen<CouponScreen>(composeTestRule) {
                couponGenerationItem {
                    assertIsDisplayed()
                    performClick()
                }
            }
        }

        step("Проверка перехода на экран Генерация купона") {
            onComposeScreen<CouponGenerationScreen>(composeTestRule) {
                assertIsDisplayed()
            }
        }

        step("Выход по стрелке в навбаре") {
            onComposeScreen<CouponGenerationScreen>(composeTestRule) {
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

        step("Снова войти на экран Генерация купона") {
            onComposeScreen<CouponScreen>(composeTestRule) {
                couponGenerationItem {
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