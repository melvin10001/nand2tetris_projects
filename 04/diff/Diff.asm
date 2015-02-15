// For a given function f(x), calculates some values of f(x)
// using the Differential Engine method discussed in class
// 
// f(x) = a x^n + b x^(n-1)...k x^0
// R0 == n
// R1 == x_max
// R2 == x_0
// R3 == f(x_0)
// R4 == f'(x_0) = f(x_0)-f(x_0-1)
// ...
// R(n+3) == nth difference
//
// Assume n <= 4
//
// You can change the values in the registers as you execute
// 
// By the end, output all the values of x and f(x) you've calculated
// up to and including x_max and f(x_max). Output them by placing
// them in memory at and after RAM[100].
//
// Specifically 
// At the end, be sure that
// RAM[100] = x_0+1
// RAM[101] = f(x_0+1)
// RAM[102] = x_0+2
// RAM[103] = f(x_0+2)
// ...
// RAM[100 + (x_max-x_0-1) * 2] = x_max
// RAM[101 + (x_max-x_0-1) * 2] = f(x_max)
//
// File name: projects/04/Diff.asm

// Put your code here. 








