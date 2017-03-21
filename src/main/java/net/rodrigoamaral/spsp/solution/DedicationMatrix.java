package net.rodrigoamaral.spsp.solution;

/**
 *
 * Represents a E x T dedication matrix where each matrix[i][j]
 * element is the dedication degree of employee i to the task j.
 *
 */
public class DedicationMatrix {

    private double[][] matrix;
    private int employees;
    private int tasks;

    public DedicationMatrix(int _employees, int _tasks) {
        employees = _employees;
        tasks = _tasks;
        matrix = new double[employees][tasks];
        for (int i = 0; i < employees; i++) {
            for (int j = 0; j < tasks; j++) {
                matrix[i][j] = Math.random();
            }
        }
    }

    public int getEmployees() {
        return employees;
    }

    public int getTasks() {
        return tasks;
    }

    public void setDedication(int employee, int task, double dedication) {
        matrix[employee][task] = dedication;
    }

    public double getDedication(int employee, int task) {
        return matrix[employee][task];
    }

    public double[] getEmployeeDedication(int employee) {
        return matrix[employee];
    }

    public double[] getTaskDedication(int task) {
        double[] taskDedication = new double[employees];
        for (int i = 0; i < tasks; i++) {
            taskDedication[i] = matrix[i][task];
        }
        return taskDedication;
    }

    public static void main(String[] args) {
        DedicationMatrix dm = new DedicationMatrix(3, 3);
        System.out.println("\n>>> By Employee\n");
        for (int i = 0; i < dm.getEmployees(); i++) {
            for (int j = 0; j < dm.getTasks(); j++) {
                System.out.println("Employee " + i +",  Task " + j +" = " + dm.getEmployeeDedication(i)[j]);
            }
        }
        System.out.println("\n>>> By Task\n");
        for (int j = 0; j < dm.getTasks(); j++) {
            for (int i = 0; i < dm.getEmployees(); i++) {
                System.out.println("Task " + j +", Employee " + i +" = " + dm.getTaskDedication(j)[i]);
            }
        }
    }
}