package main

import "fmt"

type Person struct {
	Name    string
	Address *Address
	Friends []string
}

type Address struct {
	StreetAddress, City, Country string
}

func main() {
	john := Person{"John Doe",
		&Address{"85 California Road", "California", "USA"},
		[]string{"Victor", "Hugo", "Teste"}}

	jane := john.DeepCopy()
	jane.Name = "Jane Doe"
	jane.Address.StreetAddress = "777 New York St"
	jane.Friends = append(jane.Friends, "Angela")

	fmt.Println(john, john.Address)
	fmt.Println(jane, jane.Address)
}

func (a *Address) DeepCopy() *Address {
	return &Address{
		a.StreetAddress,
		a.City,
		a.Country}
}

func (p *Person) DeepCopy() *Person {
	q := *p // copies Name
	q.Address = p.Address.DeepCopy()
	copy(q.Friends, p.Friends)
	return &q
}
