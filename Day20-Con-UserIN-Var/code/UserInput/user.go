package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	welcome := "Hey! Rishu"
	fmt.Println(welcome)

	reader := bufio.NewReader(os.Stdin)
	fmt.Println("Enter the rating for aur Pizaa:")
	// comma ok // err ok

	input, _ := reader.ReadString('\n')
	fmt.Println("Thanks for reading, ", input)
	fmt.Printf("Type of this raing is %T", input)

}
