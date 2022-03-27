package main

import (
	"fmt"
)

func main() {

	fmt.Println("Maps in GOLang")

	languages := make(map[string]string)

	languages["JS"] = "Java"
	languages["RB"] = "Ruby"
	languages["PY"] = "Python"

	fmt.Println("List of all lang: ", languages)
	fmt.Println("JS Shorts for: ", languages["JS"])

	delete(languages, "RB")
	fmt.Println("List of all lang: ", languages)

	// loops are interesting in goLang

	for key, value := range languages {
		fmt.Printf("For key %v Value is %v\n", key, value)
	}

}
