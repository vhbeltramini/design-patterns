package main

import (
	"bytes"
	"encoding/gob"
	"fmt"
)

type Address struct {
	Suite               int
	StreetAddress, City string
}

type Employee struct {
	Name   string
	Office Address
}

// employee factory
// either a struct or some functions
var mainOffice = Employee{
	"", Address{0, "Rua São Paulo", "Rio de Janeiro"}}
var auxOffice = Employee{
	"", Address{0, "Rua 25 e Julho", "Rio de Janeiro"}}
var devOffice = Employee{
	"", Address{0, "Rua Tiradentes, 101", "Rio de Janeiro"}}

func main() {
	john := NewMainOfficeEmployee("John", 100)
	jane := NewAuxOfficeEmployee("Jane", 200)
	doe := NewDevOfficeEmployee("Doe", 300)

	fmt.Println(john)
	fmt.Println(jane)
	fmt.Println(doe)
}

func (p *Employee) DeepCopy() *Employee {
	b := bytes.Buffer{}
	e := gob.NewEncoder(&b)
	_ = e.Encode(p)

	d := gob.NewDecoder(&b)
	result := Employee{}
	_ = d.Decode(&result)
	return &result
}

// utility method for configuring emp
//   ↓ lowercase
func newEmployee(proto *Employee,
	name string, suite int) *Employee {
	result := proto.DeepCopy()
	result.Name = name
	result.Office.Suite = suite
	return result
}

func NewMainOfficeEmployee(
	name string, suite int) *Employee {
	return newEmployee(&mainOffice, name, suite)
}

func NewAuxOfficeEmployee(
	name string, suite int) *Employee {
	return newEmployee(&auxOffice, name, suite)
}

func NewDevOfficeEmployee(
	name string, suite int) *Employee {
	return newEmployee(&devOffice, name, suite)
}
