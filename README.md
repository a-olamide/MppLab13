# MppLab13
a.
List<Integer> ints = new ArrayList<>();
ints.add(1);
ints.add(2);
List<Number> nums = ints; **//You can't assign List<Integers> to List<Number>**
nums.add(3.14);    

List<Integer> ints = new ArrayList<>();
ints.add(1);
ints.add(2);
List<? extends Number> nums = ints;
nums.add(3.14); //While you can use a wildcard to assign List<Integer> into it's super type based on polymorshism, you will however not be able to carry out an add operation


4a: 
List<Integer> ints = new ArrayList<>();
ints.add(1);
ints.add(2);
List<? extends Number> nums = ints;
double dbl = sum(nums);
nums.add(3.14); //write operation on the list is not legal since num could be a list of subclass of Number: integer, double etc hence, the compiler does not know the right type, you can only read


List<Object> objs = new ArrayList<>();
objs.add(1);
objs.add("two");
List<? super Integer> ints = objs;
ints.add(3);
double dbl = sum(ints); //You can't pass List<? super Integer> to the sum method expecting List<? extends Number>
