package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {

	fmt.Println("Welcome to our Pizza app")
	fmt.Println("please rate our pizza between 1 and 5")

	in := bufio.NewReader(os.Stdin)
	demo, _ := in.ReadString('\n')
	fmt.Println("Thanks for rating, ", demo)
	fmt.Printf("Type of this raing is %T\n", demo)

	numRating, err := strconv.ParseFloat(strings.TrimSpace(demo), 64)
	if err != nil {
		fmt.Println(err)
	} else {
		fmt.Println("Adding 1 to your rating: ", numRating+1)
		fmt.Printf("Type of this raing is %T", numRating)
	}

}
