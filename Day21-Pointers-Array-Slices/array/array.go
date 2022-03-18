package main

import "fmt"

func main() {

	fmt.Println("heey")

	var fruitlist [4]string
	fruitlist[0] = "Apple"
	fruitlist[1] = "Tomato"
	fruitlist[3] = "Peach"

	fmt.Println("Fruit list is: ", fruitlist)
	fmt.Println("Fruit list is: ", len(fruitlist))

	var veglist = [5]string{"potato", "beans", "mushroom"}
	fmt.Println("Veg List is: ", veglist)
	fmt.Println("Veg List is: ", len(veglist))

}
