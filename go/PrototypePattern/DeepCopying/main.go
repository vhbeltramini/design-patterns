package main

import "fmt"

type Address struct {
	StreetAddress, City, Country string
}

type Person struct {
	Name    string
	Address *Address
}

func main() {
	johnDoe := Person{"John Doe", &Address{"85 California Road", "California", "USA"}}

	//janeDae := johnDoe
	//janeDae.Name = "Jane" // this is ok
	//janeDae.Address.StreetAddress = "333 Miami Road"  // Doing this way we will be modifying the address for both objects since when we copy, we copy the address value for the address

	// To solve the situation above, we will have to do a deep copy, so then we will have a copy of all instances and not only coping the address value

	janeDae := johnDoe
	janeDae.Address = &Address{
		johnDoe.Address.StreetAddress,
		johnDoe.Address.City,
		johnDoe.Address.Country}

	janeDae.Address.StreetAddress = "333 Miami Road"

	fmt.Println(johnDoe, johnDoe.Address)
	fmt.Println(janeDae, janeDae.Address)
}
