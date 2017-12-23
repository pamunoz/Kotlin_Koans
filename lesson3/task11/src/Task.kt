// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    val allOrders = customers.flatMap { orders }
    val allProducts = allOrders.filter { it.isDelivered }.flatMap { it.products }
    return allProducts.maxBy { it.price }
}

// Return how many times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {

    val allOrders = customers.flatMap { it.orders }
    var allProducts = allOrders.filter { it.products.contains(product) }.map { it.products }
    return allProducts.size
}


