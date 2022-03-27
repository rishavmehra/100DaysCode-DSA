package main

import "fmt"

func main() {
	fmt.Println("Structs in golang")
	//no heritance in golang; no super or parent
	rishu := User{"rishu", "rishavmehra61@gamil.com", true, 21}
	fmt.Println(rishu)
	fmt.Printf("details are:%+v\n", rishu)
	fmt.Printf("Name is %v and email is %v", rishu.Name, rishu.Email)

}

type User struct {
	Name   string
	Email  string
	Status bool
	Age    int
}
