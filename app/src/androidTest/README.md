# UI Tests — Kaspresso + Jetpack Compose

## Тест-кейсы

### TC-381294 — Вход/Выход с экрана игры
`tests/coupon/GameScreenEnterExitTest.kt`
- Вход на экран игры по ячейке события в купоне
- Выход по кнопке Назад в навбаре
- Выход по системной кнопке Назад

### TC-378813 — Вход/Выход экрана Генерация купона
`tests/coupon/CouponGenerationScreenEnterExitTest.kt`
- Вход на экран Генерация купона
- Выход по стрелке в навбаре
- Выход по системной кнопке Назад

### TC-698366 — Бонусные счета: отсутствие запрещённых
`tests/wallet/BonusAccountsRestrictionTest.kt`
- Проверка что счета Спорт и 1xGames отсутствуют в боттом-шите
- Проверка что Основной, Валютный и Бонусный на Слоты отображаются

## Стек
- Kaspresso 1.6.0
- kaspresso-compose-support 1.6.0
- Jetpack Compose BOM 2024.10.01
