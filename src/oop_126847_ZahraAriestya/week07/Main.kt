package oop_126847_ZahraAriestya.week07

fun main() {

    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    println("\n=== TEST COPY & DESTRUCTURING ===")
    val user1 = DataUser("Alice", 22)
    val user2 = user1.copy(age = 25)

    println("User1: $user1")
    println("User2 (hasil copy): $user2")

    val (name, age) = user2
    println("Destructured -> Name: $name, Age: $age")

    println("\n=== TEST SEALED CLASS (WHEN) ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil diambil")

    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan data: ${response.data}"
        is ApiResponse.Error -> "Tampilkan error: ${response.message}"
        ApiResponse.Loading -> "Tampilkan loading..."
    }

    println(uiMessage)

    println("\n=== TEST GAME MANAGER ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TEST RARITY & WEAPON FORGE ===")
    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()

    println("Senjata awal:")
    println("Nama: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")

    println("\n=== TEST GAME FLOW ===")

    val upgradedItem = starterWeapon.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}