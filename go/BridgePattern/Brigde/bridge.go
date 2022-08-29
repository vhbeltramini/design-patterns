package main

import "fmt"

type Renderer interface {
	RenderCircle(radius float32)
}

type VectorRenderer struct {
}

func (v VectorRenderer) RenderCircle(radius float32) {
	fmt.Println("Drawing a circle of radius ", radius)

}

type RasterRenderer struct {
	Dpi int
}

func (c RasterRenderer) RenderCircle(radius float32) {
	fmt.Println("Drawing pixels for circle of radius ", radius)
}

type Circle struct {
	render Renderer
	radius float32
}

func (c *Circle) Draw() {
	c.render.RenderCircle(c.radius)
}

func (c *Circle) Resize(factor float32) {
	c.radius *= factor
}

func NewCircle(r Renderer, radius float32) *Circle {
	return &Circle{render: r, radius: radius}
}

func main() {
	vectorRenderer := VectorRenderer{}
	rasterRenderer := RasterRenderer{Dpi: 72}
	circle1 := NewCircle(&vectorRenderer, 5)
	circle1.Draw()
	circle2 := NewCircle(rasterRenderer, 5)
	circle2.Draw()
	circle1.Resize(2)
	circle2.Resize(2)
	circle1.Draw()
	circle2.Draw()
}
