package main

type Person struct {
	FirstName, LastName string
	Arms, Legs          int
}

func main() {
	NewPerson("Victor", "Hugo")
}

// Simple Factory example
func NewPerson(firstName, lastName string) *Person {

	// Before the return e can apply some validations too.

	return &Person{firstName, lastName, 2, 2}
}
