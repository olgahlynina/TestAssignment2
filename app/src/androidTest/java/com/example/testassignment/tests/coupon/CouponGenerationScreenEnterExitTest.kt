package com.example.testassignment.tests.coupon

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.testassignment.MainActivity
import com.example.testassignment.screens.CouponGenerationScreen
import com.example.testassignment.screens.CouponScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

// TC-378813: Вход на/Выход с экрана Генерация купона. Positive
@RunWith(AndroidJUnit4::class)
class CouponGenerationScreenEnterExitTest : TestCase() {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun couponGenerationScreenEnterExit() = run {

        step("Вход на экран Генерация купона — тап на пункт") {
            CouponScreen {
                couponGenerationButton {
                    isVisible()
                    click()
                }
            }
        }

        step("Проверка перехода на экран Генерация купона") {
            CouponGenerationScreen {
                screenContainer { isVisible() }
            }
        }

        step("Выход по стрелке в навбаре") {
            CouponGenerationScreen {
                navBackButton {
                    isVisible()
                    click()
                }
            }
        }

        step("Проверка возврата на экран Купон") {
            CouponScreen {
                couponGenerationButton { isVisible() }
            }
        }

        step("Снова войти на экран Генерация купона") {
            CouponScreen {
                couponGenerationButton { click() }
            }
        }

        step("Выход по системной кнопке Назад") {
            device.uiDevice.pressBack()
        }

        step("Проверка возврата на экран Купон") {
            CouponScreen {
                couponGenerationButton { isVisible() }
            }
        }
    }
}