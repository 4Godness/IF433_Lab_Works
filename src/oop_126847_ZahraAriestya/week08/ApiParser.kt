package oop_126847_ZahraAriestya.week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Extract id dan name dengan requireNotNull
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" } as? String
            ?: throw IllegalArgumentException("API Invalid: ID must be String type")

        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" } as? String
            ?: throw IllegalArgumentException("API Invalid: Name must be String type")

        // Extract type
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = (rawJson["warranty"] as? Int) ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = (rawJson["size"] as? String) ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) {
        val transactionId = when (product) {
            is Electronic -> JavaPaymentService.processPayment(product.id)
            is Clothing -> JavaPaymentService.processPayment(product.id)
        }

        // Menggunakan !! karena kita yakin Java service selalu mengembalikan nilai yang valid
        val safeTransactionId = transactionId!!
        println("Transaction successful! Transaction ID: $safeTransactionId")
    }

    //done back ApiParser
}