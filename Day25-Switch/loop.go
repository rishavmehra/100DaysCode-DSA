package main

import "fmt"

func main() {
	fmt.Println("Loop break continue and goto in golang")

	days := []string{"Sunday", "Tuesday", "Wednesday", "Friday", "Saturday"}
	fmt.Println(days)

	// for d := 0; d < len(days); d++ {
	// 	fmt.Println(days[d])
	// }

	// for i := range days {
	// 	fmt.Println(days[i])
	// }

	// for index, day := range days {
	// 	fmt.Printf("index is %v and value is %v\n", index, day)
	// }

	rouguevalue := 1

	for rouguevalue < 10 {

		if rouguevalue == 2 {
			goto lco
		}

		if rouguevalue == 5 {
			break
			// rouguevalue++
			// continue
		}

		fmt.Println("value is: ", rouguevalue)
		rouguevalue++
	}

lco:
	fmt.Println("IF value is 2 than jump to LearnCodeonline.in")

}
