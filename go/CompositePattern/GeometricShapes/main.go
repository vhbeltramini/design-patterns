package main

import (
	"fmt"
	"strings"
)

type GraphicObject struct {
	Name, Color string
	Children    []GraphicObject
}

func (g *GraphicObject) String() string {
	sb := strings.Builder{}
	g.print(&sb, 0)
	return sb.String()
}

func (g *GraphicObject) print(sb *strings.Builder, depth int) {
	sb.WriteString(strings.Repeat("-", depth))
	if len(g.Color) > 0 {
		sb.WriteString(g.Color)
		sb.WriteRune(' ')
	}
	sb.WriteString(g.Name)
	sb.WriteRune('\n')

	for _, child := range g.Children {
		child.print(sb, depth+1)
	}
}

func NewCircle(color string) *GraphicObject {
	return &GraphicObject{
		Name:  "Circle",
		Color: color,
	}
}

func NewRectangle(color string) *GraphicObject {
	return &GraphicObject{
		Name:  "Rectangle",
		Color: color,
	}
}

func (g *GraphicObject) Add(child GraphicObject) {
	g.Children = append(g.Children, child)
}

func main() {

	drawing := GraphicObject{
		Name:     "My Drawing",
		Color:    "",
		Children: nil,
	}
	drawing.Add(*NewCircle("red"))
	drawing.Add(*NewRectangle("blue"))

	group := GraphicObject{
		Name:     "Group 1",
		Color:    "",
		Children: nil,
	}

	group.Add(*NewCircle("red"))
	group.Add(*NewRectangle("blue"))
	group.Add(*NewRectangle("blue"))
	group.Add(*NewRectangle("blue"))
	group.Add(*NewRectangle("blue"))
	group.Add(drawing)
	drawing.Add(group)

	fmt.Println(drawing.String())
}
