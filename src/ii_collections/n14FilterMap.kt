package ii_collections

fun Shop.getCitiesCustomersAreFrom(): Set<City> = customers.toSet().map { it.city }.toSet()

fun Shop.getCustomersFrom(city: City): List<Customer> = customers.toSet().filter { it.city == city }

