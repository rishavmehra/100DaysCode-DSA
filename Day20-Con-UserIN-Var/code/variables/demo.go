package main

import (
	"fmt"
)

const Logintoken string = "hey this is constant/global"

func main() {
	var username string = "rishav"
	fmt.Println(username)
	fmt.Printf("Variable is of type: %T \n", username)

	var isLogged bool = true
	fmt.Println(isLogged)
	fmt.Printf("Variable is of type: %T \n", isLogged)

	var smallVal uint8 = 255
	fmt.Println(smallVal)
	fmt.Printf("Variable is of type: %T \n", smallVal)

	var smallFloat float64 = 255.343534342343
	fmt.Println(smallFloat)
	fmt.Printf("Variable is of type: %T \n", smallFloat)

	// default values and some aliases
	var anotherVariable int
	fmt.Print("------------\n")
	fmt.Println(anotherVariable)
	fmt.Printf("Variable is of type: %T \n", anotherVariable)

	// implicit type(way) to implement the variable
	var website = "rishav.ml"
	fmt.Print("------------\n")
	fmt.Println(website)

	//no var style
	numberofUser := 3000
	fmt.Print("------------\n")
	fmt.Println(numberofUser)

	fmt.Print("------------\n")
	fmt.Println(Logintoken)
	fmt.Printf("Variable is of type: %T \n", Logintoken)

}
