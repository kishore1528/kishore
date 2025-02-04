import java.util.Scanner;

public class Demo021 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your monthly gross salary: ");
            double monthlyGrossSalary = scanner.nextDouble();

            System.out.print("Enter your monthly HRA: ");
            double hra = scanner.nextDouble();

            System.out.print("Enter your monthly PF: ");
            double pf = scanner.nextDouble();

            double annualSalary = monthlyGrossSalary * 12;
            double annualHRA = hra * 12;
            double annualPF = pf * 12;

            double deductions = annualHRA + annualPF;
            double taxableIncome = annualSalary - deductions;

            double tax = calculateTax(taxableIncome);

            System.out.println("Annual Salary: " + annualSalary);
            System.out.println("Deductions (HRA + PF): " + deductions);
            System.out.println("Taxable Income: " + taxableIncome);
            System.out.println("Annual Income Tax: " + tax);
        }
    }

    public static double calculateTax(double taxableIncome) {
        if (taxableIncome <= 0) {
            return 0;
        } else if (taxableIncome <= 500000) {
            return taxableIncome * 0.1;
        } else if (taxableIncome <= 1000000) {
            return (500000 * 0.1) + (taxableIncome - 500000) * 0.2;
        } else {
            return (500000 * 0.1) + (500000 * 0.2) + (taxableIncome - 1000000) * 0.3;
        }
    }
}