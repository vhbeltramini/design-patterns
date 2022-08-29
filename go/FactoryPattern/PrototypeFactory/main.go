package main

import "fmt"

type Employee struct {
	Name, Position string
	AnnualIncome   int
}

const (
	Developer = iota
	Manager
	TechLead
)

func main() {
	manager := NewEmployee(Manager)
	manager.Name = "Sam"
	fmt.Println(manager)
	tl := NewEmployee(TechLead)
	tl.Name = "Sam"
	fmt.Println(tl)
}

func NewEmployee(role int) *Employee {
	switch role {
	case Developer:
		return &Employee{"", "Developer", 60000}
	case Manager:
		return &Employee{"", "Manager", 80000}
	case TechLead:
		return &Employee{"", "TechLead", 100000}
	default:
		panic("unsupported role")
	}
}
