package com.example.testassignment.tests.coupon

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.testassignment.MainActivity
import com.example.testassignment.screens.CouponScreen
import com.example.testassignment.screens.GameScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

// TC-381294: Вход на/Выход с экрана игры. Positive
@RunWith(AndroidJUnit4::class)
class GameScreenEnterExitTest : TestCase() {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun gameScreenEnterExitFromCoupon() = run {

        step("Вход на экран игры — тап на ячейку события") {
            CouponScreen {
                eventsList {
                    firstChild<CouponScreen.EventItem> {
                        isVisible()
                        rootView { click() }
                    }
                }
            }
        }

        step("Проверка перехода на экран игры") {
            GameScreen {
                gameContainer { isVisible() }
            }
        }

        step("Выход по кнопке Назад в навбаре") {
            GameScreen {
                navBackButton {
                    isVisible()
                    click()
                }
            }
        }

        step("Проверка возврата на экран Купон") {
            CouponScreen {
                eventsList { isVisible() }
            }
        }

        step("Снова войти на экран игры") {
            CouponScreen {
                eventsList {
                    firstChild<CouponScreen.EventItem> {
                        rootView { click() }
                    }
                }
            }
        }

        step("Выход по системной кнопке Назад") {
            device.uiDevice.pressBack()
        }

        step("Проверка возврата на экран Купон") {
            CouponScreen {
                eventsList { isVisible() }
            }
        }
    }
}