package main.kotlin.dsalgoleetcode

class LatestUniqueOrder {

    fun latestUniqueOrders(orders: List<Order>): List<Order> {
        val latestMap = mutableMapOf<String, Order>()

        for(order in orders){
            val current = latestMap[order.id]
            if(current == null || order.timestamp > current.timestamp){
                latestMap[order.id] = order
            }
        }
        return latestMap.values.toList()
    }
}

data class Order(val id: String, val timestamp: Long)