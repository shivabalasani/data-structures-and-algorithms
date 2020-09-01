package academy.learnprogramming.lists;

public class DoubleEmployeeNode {

    private Employee employee;
    private DoubleEmployeeNode next;
    private DoubleEmployeeNode previous;

    public DoubleEmployeeNode(Employee employee) {
	this.employee = employee;
    }

    public Employee getEmployee() {
	return employee;
    }

    public void setEmployee(Employee employee) {
	this.employee = employee;
    }

    public DoubleEmployeeNode getNext() {
	return next;
    }

    public void setNext(DoubleEmployeeNode next) {
	this.next = next;
    }

    public DoubleEmployeeNode getPrevious() {
	return previous;
    }

    public void setPrevious(DoubleEmployeeNode previous) {
	this.previous = previous;
    }

    public String toString() {
	return employee.toString();
    }

}