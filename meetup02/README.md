Brodnik et al. seem to have been the first to describe the Rootish ArrayStack
and prove a √n lower-bound like that in Section 2.6.2. They
also present a different structure that uses a more sophisticated choice
of block sizes in order to avoid computing square roots in the i2b(i)
method. Within their scheme, the block containing i is block blog(i+ 1)c,
which is simply the index of the leading 1 bit in the binary representation 
of i+ 1. Some computer architectures provide an instruction for computing
the index of the leading 1-bit in an integer.

A structure related to the RootishArrayStack is the two-level tieredvector
of Goodrich and Kloss. This structure supports the get(i,x)
and set(i,x) operations in constant time and add(i,x) and remove(i) in
O(√n) time. These running times are similar to what can be achieved with
the more careful implementation of a RootishArrayStack discussed in

Exercise 2.1. 
The List method addAll(i,c) inserts all elements of the
Collection c into the list at position i. (The add(i,x) method is a special
case where c = {x}.) Explain why, for the data structures in this chapter,
it is not efficient to implement addAll(i,c) by repeated calls to add(i,x).
Design and implement a more efficient implementation.


Exercise 2.2. 
Design and implement a RandomQueue. This is an implementation
of the Queue interface in which the remove() operation removes
an element that is chosen uniformly at random among all the elements
currently in the queue. (Think of a RandomQueue as a bag in which we
can add elements or reach in and blindly remove some random element.)
The add(x) and remove() operations in a RandomQueue should run in constant
time per operation.

Exercise 2.3. 
Design and implement a Treque (triple-ended queue). This
is a List implementation in which get(i) and set(i,x) run in constant
time and add(i,x) and remove(i) run in time
O(1 + min{i,n − i,|n/2 − i|}) .
In other words, modifications are fast if they are near either end or near
the middle of the list.

Exercise 2.4. 
Implement a method rotate(a,r) that “rotates” the array a
so that a[i] moves to a[(i + r) mod a.length], for all i ∈ {0,...,a.length}.

Exercise 2.5. 
Implement a method rotate(r) that “rotates” a List so that
list item i becomes list item (i + r) mod n. When run on an ArrayDeque,
or a DualArrayDeque, rotate(r) should run in O(1 + min{r,n − r}) time.
