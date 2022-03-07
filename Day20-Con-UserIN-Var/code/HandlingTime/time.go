package main

import (
	"fmt"
	"time"
)

func main() {
	fmt.Println("Welcome to time study of golang")

	presentTime := time.Now()
	fmt.Println(presentTime)

	fmt.Println(presentTime.Format("02-01-2006 15:04:05 Monday"))
	createDate := time.Date(2022, time.June, 23, 2, 05, 01, 10, time.UTC)
	fmt.Print(createDate, "\n")

	fmt.Println(createDate.Format("02-01-2006 Monday 15:04:05"))
}
