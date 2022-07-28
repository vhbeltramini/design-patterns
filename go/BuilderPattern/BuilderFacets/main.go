package main

import "fmt"

type Person struct {
	// Personal information
	FirstName, LastName string
	Age                 int

	// Adress
	StreetAddress, Postcode, City string

	// Job
	CompanyName, Position string
	AnnualIncome          int
}

type PersonBuilder struct {
	person *Person
}

type PersonInformationBuilder struct {
	PersonBuilder
}

type PersonAddressBuilder struct {
	PersonBuilder
}

type PersonJobBuilder struct {
	PersonBuilder
}

func main() {
	person := NewPersonBuilder()
	person.
		PersonalInformation().
		FirstName("Victor").
		LastName("Hugo").
		Age(19).
		Adress().
		StreetAddress("123 London Road").
		City("London").
		Postcode("SW12BC").
		Job().
		Company("Fabrikam").
		Position("Programmer").
		Earnings(123000)
	fmt.Println(*person.Build())
}

func NewPersonBuilder() *PersonBuilder {
	return &PersonBuilder{&Person{}}
}

func (it *PersonBuilder) Build() *Person {
	return it.person
}

func (b *PersonBuilder) Job() *PersonJobBuilder {
	return &PersonJobBuilder{*b}
}

func (pjb *PersonJobBuilder) Company(
	companyName string) *PersonJobBuilder {
	pjb.person.CompanyName = companyName
	return pjb
}

func (pjb *PersonJobBuilder) Position(
	position string) *PersonJobBuilder {
	pjb.person.Position = position
	return pjb
}

func (pjb *PersonJobBuilder) Earnings(
	annualIncome int) *PersonJobBuilder {
	pjb.person.AnnualIncome = annualIncome
	return pjb
}

func (b *PersonBuilder) Adress() *PersonAddressBuilder {
	return &PersonAddressBuilder{*b}
}

func (it *PersonAddressBuilder) StreetAddress(
	streetAddress string) *PersonAddressBuilder {
	it.person.StreetAddress = streetAddress
	return it
}

func (it *PersonAddressBuilder) City(
	city string) *PersonAddressBuilder {
	it.person.City = city
	return it
}

func (it *PersonAddressBuilder) Postcode(
	postcode string) *PersonAddressBuilder {
	it.person.Postcode = postcode
	return it
}

func (b *PersonBuilder) PersonalInformation() *PersonInformationBuilder {
	return &PersonInformationBuilder{*b}
}

func (it *PersonInformationBuilder) FirstName(firstName string) *PersonInformationBuilder {
	it.person.FirstName = firstName
	return it
}

func (it *PersonInformationBuilder) LastName(lastName string) *PersonInformationBuilder {
	it.person.LastName = lastName
	return it
}

func (it *PersonInformationBuilder) Age(age int) *PersonInformationBuilder {
	it.person.Age = age
	return it
}
