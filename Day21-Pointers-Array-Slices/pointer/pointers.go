package main

import "fmt"

func main() {
	fmt.Println("Welcome to a class on pointers")

	// var ptr *int
	// fmt.Println("value of pointer is ", ptr)

	mynumber := 23

	var ptr = &mynumber

	fmt.Println("Value of actula pointer is ", ptr)
	fmt.Println("Value of actula pointer is ", *ptr)

	*ptr = *ptr * 2
	fmt.Println("New value is ", mynumber)
}
