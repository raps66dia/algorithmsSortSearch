# Analysis Questions

Which sorting algorithm performed faster? Why? Quick sorter faster because it has O(logN) complexity

How does performance change with input size? For example bubble sort has O(n^2) and we increase our array on 100, complexity became 100^2 it in 100^2 greater than usually

How does sorted vs unsorted data affect performance? for bubble sort is no affect but for quick sort if data sorted the complexity will O(n^2) instead of logn in unsorted data.

Do the results match the expected Big-O complexity? Yes if we use System.nanoTime() we can see how different complexity change the result

Which searching algorithm is more efficient? Why? Binary searching more efficient because it has logn complexity but work only on sorted data

Why does Binary Search require a sorted array? Because this search divide array to small array where left side is smaller than right side.

# Project Overview 

<img width="583" height="394" alt="изображение" src="https://github.com/user-attachments/assets/82e577d1-153f-4e63-83b5-6d0fbaa2bf0b" />
Bubble sort compare 2 closers element from beggining and if right element smaller than left one they will swap. The purpose of experiment is compare the time of execution when we input different sizes of array. Time complexity will O(n^2)

<img width="987" height="789" alt="изображение" src="https://github.com/user-attachments/assets/77d3cf02-e639-40b3-a924-e58e3d53dc43" />
This is quick sort and it works in O(logn) complexity. First step we need to find pivot for array where left part will less than right. For this I wrote function for pivot, this func take the last element like a pivot and also we need implement variuable (i) to know how many element less than pivot(last element) next with for cycle we start to compare all array with pivot and if we find this element. Programm will increment (i) and swap itself because in first iteration we have j = 0 and i = 0 if condition is true, next of some element will greater than pivot we not go in condition and for example the next will less than pivot condition is true and our varueable j = 2 and increment i = 1 so we swap element with index 2 and 1. In the end of cycle we chech our (i) for example it is 4 it means that 4 element less than pivot, because of that we take our pivot and swap with i+1 element and so we find pivot where left less than right next just recursion of this 2 array.

<img width="813" height="214" alt="изображение" src="https://github.com/user-attachments/assets/8b2eb7c1-80d7-40a3-b22e-24f711e3ab31" />
This is the result of different sizes of array. We can see all time for each sort.


I learned that algorithms grow differently when data size increases. Bubble Sort is okay for small lists, but it is very slow for large ones. Quick Sort and Binary Search are much faster because they use divide and conquer strategy. Choosing the right algorithm saves a lot of time. In theory, Quick Sort is always fast. But in practice, if the list is already sorted, it can become slow. Also, the first time I run the code in Java, it is a bit slower because the computer needs to "warm up." Small background programs on my PC can also change the results in nanoseconds. The biggest challenge was recursion in Quick Sort. It was hard to understand when it stops. Also it hard to understand the structure of all code






