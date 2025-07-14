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
