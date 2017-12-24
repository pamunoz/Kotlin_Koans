fun renderProductTable(): String {
    return html {
        table {
            tr(getTitleColor()) {
                td(getCellColor(0, 0)) {
                    text("Product")
                }
                td(getCellColor(1, 0)) {
                    text("Price")
                }
                td(getCellColor(2, 0)) {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for (product in products) {
                tr(getTitleColor()) {
                    val index = products.indexOf(product)
                    td(getCellColor(index, index + 1)) {
                        text(product.description)
                    }
                    td(getCellColor(index, index + 1)) {
                        text(product.price)
                    }
                    td(getCellColor(index, index + 1)) {
                        text(product.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) %2 == 0) "#dce4ff" else "#eff2ff"
