package main

import "fmt"

type Employee struct {
	Name, Position string
	AnnualIncome   int
}

// structural approach

type EmployeeFactory struct {
	Position     string
	AnnualIncome int
}

func main() {
	developerFactory := NewEmployeeFactory("Developer", 60000)
	managerFactory := NewEmployeeFactory("Manager", 80000)
	sallerFactory := NewEmployeeFactory("Manager", 80000)

	manager := managerFactory("Jane")
	fmt.Println(manager)

	saller := sallerFactory("Erick")
	fmt.Println(saller)

	developer := developerFactory("Adam")
	fmt.Println(developer)

	bossFactory := NewEmployeeFactoryForCreate("CEO", 100000)
	// can modify post-hoc
	bossFactory.AnnualIncome = 110000
	boss := bossFactory.Create("Victor")
	fmt.Println(boss)
}

// functional approach
//  factories for specific roles

func NewEmployeeFactory(position string, annualIncome int) func(name string) *Employee {
	return func(name string) *Employee {
		return &Employee{name, position, annualIncome}
	}
}

func NewEmployeeFactoryForCreate(position string, annualIncome int) *EmployeeFactory {
	return &EmployeeFactory{position, annualIncome}
}

func (f *EmployeeFactory) Create(name string) *Employee {
	return &Employee{name, f.Position, f.AnnualIncome}
}
