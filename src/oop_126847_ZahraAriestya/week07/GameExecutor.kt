package oop_126847_ZahraAriestya.week07

fun processEvent(event: BattleState) {
    val message = when (event) {
        is BattleState.MonsterEncounter ->
            "Monster muncul: ${event.monsterName}! Bersiaplah bertarung!"
        is BattleState.LootDropped ->
            "Kamu mendapatkan item: ${event.item.name} (Rarity: ${event.item.rarity})"
        is BattleState.GameOver ->
            "Game Over! Penyebab: ${event.reason}"
        BattleState.SafeZone ->
            "Kamu berada di zona aman. Istirahat sejenak."
    }
    println(message)
}