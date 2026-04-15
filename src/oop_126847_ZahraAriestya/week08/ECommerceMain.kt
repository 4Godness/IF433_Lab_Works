package oop_126847_ZahraAriestya.week08

fun main() {
    println("=== E-COMMERCE DATA PARSER ===\n")

    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    println("Processing ${rawApiData.size} items from API...\n")

    for ((index, raw) in rawApiData.withIndex()) {
        println("--- Processing Item ${index + 1} ---")
        println("Raw data: $raw")

        try {
            val product = parser.parseProduct(raw)

            if (product != null) {
                println("✓ Successfully parsed: ${product::class.simpleName} - ${product.name}")

                when (product) {
                    is Electronic -> println("  Warranty: ${product.warrantyMonths} months")
                    is Clothing -> println("  Size: ${product.size}")
                }

                // Process checkout
                parser.checkout(product)
            } else {
                println("⚠ Skipped: Unknown product type or invalid data")
            }
            println()

        } catch (e: IllegalArgumentException) {
            println("❌ ERROR: ${e.message}")
            println()
        }
    }

    println("=== PROCESSING COMPLETE ===")
}