// ������� ����� Employee (���������), � ��������:
//1.1 ���� ��������� ���� String firstName (���)
//1.2 ���� ��������� ���� String lastName (�������)
//1.3 ��������� ���� int age (�������)
//1.4 ��������� ���� double salary (��������)
//2.1 ���� ����� getAge, ������� ���������� �������
//2.2 ���� ����� getSalary, ������� ���������� ��������
//2.3 ���� ����� getFullName, ������� ���������� ������������ firstName � lastName
//2.4 ���� ������ (�������) ��� ��������� ���� ����� (setAge, setSalary, setFirstName, setLastName)
//3.1 ���� �����������, ������� ��������� ��� 4 ����
//3.2 ���� �����������, ������� ��������� firstName, lastName � ������� (�������� �� ��������� 1_000.0)
//3.3 ���� �����������, ������� ��������� firstName, lastName (�������� �� ��������� 1_000.0, ������� �� ��������� 25)
//4. ����������� ����� toString, ������� ������� ���������� � ���������� � ��������� ������������� (������ ��������� ��������������).
//5. ����������� ������ equals � hashCode, ������� ��������� ������ firstName � lastName.


package org.example;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("������", "������", 25, 40000);
        Employee employee1 = new Employee("������", "������", 25);
        Employee employee2 = new Employee("������", "�������");

        employee.getFullName();
        employee2.toString();
    }
}