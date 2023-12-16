package org.example;

// ������� ����� Employee (���������), � ��������:
//1.1 ���� ��������� ���� String firstName (���) +++++
//1.2 ���� ��������� ���� String lastName (�������) +++++
//1.3 ��������� ���� int age (�������) +++++
//1.4 ��������� ���� double salary (��������) +++++
//2.1 ���� ����� getAge, ������� ���������� �������
//2.2 ���� ����� getSalary, ������� ���������� ��������
//2.3 ���� ����� getFullName, ������� ���������� ������������ firstName � lastName
//2.4 ���� ������ (�������) ��� ��������� ���� ����� (setAge, setSalary, setFirstName, setLastName)
//3.1 ���� �����������, ������� ��������� ��� 4 ����
//3.2 ���� �����������, ������� ��������� firstName, lastName � ������� (�������� �� ��������� 1_000.0)
//3.3 ���� �����������, ������� ��������� firstName, lastName (�������� �� ��������� 1_000.0, ������� �� ��������� 25)
//4. ����������� ����� toString, ������� ������� ���������� � ���������� � ��������� ������������� (������ ��������� ��������������). ++++
//5. ����������� ������ equals � hashCode, ������� ��������� ������ firstName � lastName.

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }



    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = 1000;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 25;
        this.salary = 1000;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String toString (){
        System.out.println(String.format("����� %s %s (%d ���) ����� �������� %f ������. ", firstName, lastName, age, salary));
        return null;
    }

    public String getFullName() {
        System.out.println(String.format(firstName + " " + lastName));
        return null;
    }

    @Override
    public boolean equals (Object anotherObject) {
        if (anotherObject == null) {
            return false;
        }
        if (!(anotherObject instanceof Employee)) {
            return false;
        }
        Employee anotherEmployee = (Employee) anotherObject;
        return firstName.equals(anotherEmployee.getFirstName()) && lastName.equals(anotherEmployee.getLastName());
    }


}
