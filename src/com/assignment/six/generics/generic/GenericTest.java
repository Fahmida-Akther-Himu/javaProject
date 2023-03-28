package com.assignment.six.generics.generic;

public class GenericTest {
    public static void main(String[] args) {
        Employee<String> employee = new Employee<String>("Fahmida", "SQA Engineer", "10000");
        System.out.println("Employee name is : " + employee.getName());
        System.out.println("Her designation will be "+ employee.getDesignation());
        Employee<Double> employee1 = new Employee<Double>(9000.32, 3000.2, 4888.9);
        System.out.println("Her salary will be defined as double $ "+ employee1.getSalary());
        Student<Float> student = new Student<Float>(10000.50f);
        System.out.println("Student's salary will be "+ student.getSalary()+" BDT");
    }

}
