package main

import "fmt"

type Person struct {
	firstName, lastName, position string
}

type personMod func(*Person)

type PersonBuilder struct {
	actions []personMod
}

func main() {
	b := PersonBuilder{}
	p := b.FirstName("Dmitri").LastName("Vegas").Position("dev").Build()
	fmt.Println(*p)
}

func (b *PersonBuilder) FirstName(name string) *PersonBuilder {
	b.actions = append(b.actions, func(p *Person) {
		p.firstName = name
	})
	return b
}

func (b *PersonBuilder) LastName(lastName string) *PersonBuilder {
	b.actions = append(b.actions, func(p *Person) {
		p.lastName = lastName
	})
	return b
}

func (b *PersonBuilder) Build() *Person {
	p := Person{}
	for _, a := range b.actions {
		a(&p)
	}
	return &p
}

// extend PersonBuilder
func (b *PersonBuilder) Position(position string) *PersonBuilder {
	b.actions = append(b.actions, func(p *Person) {
		p.position = position
	})
	return b
}
