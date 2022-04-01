package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {

	fmt.Println("Switch case in GoLang")

	rand.Seed(time.Now().UnixNano())
	diceNumber := rand.Intn(6) + 1
	fmt.Println("Random number is: ", diceNumber)

	switch diceNumber {
	case 1:
		fmt.Println("You can open and move 1 spot")
	case 2:
		fmt.Println("You can move 2 spot")
	case 3:
		fmt.Println("You can move 3 spot")
	case 4:
		fmt.Println("You can move 4 spot")
		fallthrough
	case 5:
		fmt.Println("You can move 5 spot")
	case 6:
		fmt.Println("You can open and roll it up")

	default:
		fmt.Println("What was that!")
	}
}
