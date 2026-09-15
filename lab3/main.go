package main

import "fmt"

type Person struct {
	Name   string
	Age    int
	Job string
	Salary float32
}

// function by pointer
func (s *Person) readData() {
	fmt.Print("Enter person name: ")
	fmt.Scanln(&s.Name)
	fmt.Print("Enter person age: ")
	fmt.Scanln(&s.Age)
	fmt.Print("Enter person job: ")
	fmt.Scanln(&s.Job)
	fmt.Print("Enter person salary: ")
	fmt.Scanln(&s.Salary)
}

//method
func (s Person) printData() {
	fmt.Print("Name: ", s.Name)
	fmt.Print("\nAge: ", s.Age)
	fmt.Print("\nJob: ", s.Job)
	fmt.Print("\nSalary: ", s.Salary)
}
func main() {
	var person1 Person
	var person2 Person	
	fmt.Println("\nthe Details of first person")
	person1.readData()
	person1.printData()
	fmt.Println("the Details of second person")
	person2.readData()
	person2.printData()
}
