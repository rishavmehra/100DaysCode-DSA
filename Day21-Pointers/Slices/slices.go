package main

import (
	"fmt"
	"sort"
)

func main() {
	fmt.Println("Welcome to video on Slices")

	var fruitlist = []string{"Apple", "Tomato", "Peach"}
	fmt.Printf("Type of the fruitlist id %T\n", fruitlist)

	fruitlist = append(fruitlist, "Mango", "Banana")
	fmt.Println(fruitlist)

	fruitlist = append(fruitlist[:1])
	fmt.Println(fruitlist)

	highScores := make([]int, 4)
	highScores[0] = 234
	highScores[1] = 945
	highScores[2] = 465
	highScores[3] = 867
	//highScores[4] = 777

	highScores = append(highScores, 555, 666, 321)

	fmt.Println(highScores)
	//fmt.Println(sort.IntsAreSorted(highScores))
	sort.Ints(highScores)
	//fmt.Println(highScores)
	//fmt.Println(sort.IntsAreSorted(highScores))

	//	 how to remove a value from sciles based on index

	var courses = []string{"reactJS", "javascript", "swift", "python", "ruby"}
	fmt.Println(courses)
	var index int = 2
	courses = append(courses[:index], courses[index+1:]...)
	fmt.Println(courses)

}
