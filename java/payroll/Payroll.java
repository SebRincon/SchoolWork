/* 
Sebastian Rincon
COSC-2436 2801
09/12/2021
Payroll 
*/

public class Payroll {
    // Initializing variables
    private String name;
    private String id;
    private double rate;
    private int hours;

    // No arg constructor
    public Payroll() {
        name = "";
        id = "";
        hours = 0;
        rate = 0.0;
    }

    // Full arg constructor
    public Payroll(String _name, String _id, int _hours, double _rate) {
        name = _name;
        id = _id;
        hours = _hours;
        rate = _rate;
    }

    // Partial arg constructors
    public Payroll(String _name, String _id) {
        name = _name;
        id = _id;
        hours = 0;
        rate = 0.0;
    }

    public Payroll(String _name) {
        name = _name;
        id = "";
        hours = 0;
        rate = 0.0;
    }

    // Name setter
    public void setName(String _name) {
        // Checking for name length
        if (_name.length() == 0) {
            throw new IllegalArgumentException("Name can not be empty");
        } else
            name = _name;
    }

    public void setId(String _id) {
        boolean isValid = true;
        // Looping over each char in _id
        for (int i = 0; i < _id.length(); i++) {
            if (i < 2) {
                // Validateing LL part of LLNNNN format
                if (Character.isDigit(_id.charAt(i))) {
                    isValid = false;
                    // Trowing exception when the format is broken
                    throw new IllegalArgumentException("Id Format is not correct! It Should be LLNNNN");
                }
            } else {
                // Validating the NNNN of the LLNNNN format
                if (!Character.isDigit(_id.charAt(i))) {
                    isValid = false;
                    throw new IllegalArgumentException("Id Format is not correct! It Should be LLNNN");
                }
            }
        }
        // if no exceptions have been called _id will be assigned to id
        if (isValid) {
            id = _id;
        }
    }

    public void setHours(int _hours) {
        // Validating that _hours is less than 84
        if (_hours > 84) {
            throw new IllegalArgumentException("Hours can not exceed 84!");
        }
        // Validating that _hours is not less than 0
        else if (_hours < 0) {
            throw new IllegalArgumentException("Hours can not be less than 0!");
        }
        // assigning _hours to hours if no exception has been called
        else {
            hours = _hours;
        }
    }

    public void setRate(double _rate) {
        // Validating that _rate is less than 25.00
        if (_rate > 25.00) {
            throw new IllegalArgumentException("Payrate can not exceed 25.00!");
        }
        // Validating that _rate is greater than 0
        else if (_rate < 0) {
            throw new IllegalArgumentException("Payrate can not be less than 0.0!");
        }
        // assigning rate to _rate if no exception has been called
        else {
            rate = _rate;
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getHours() {
        return hours;
    }

    public double getRate() {
        return rate;
    }

    public static void main(String[] args) {
        Payroll emp = new Payroll("Sebastian", "AA3232", 10, 12.00);

        emp.setName("Sebastian Rincon");
        emp.setId("As2332");

        System.out.println(emp.getName());
        System.out.println(emp.getId());

    }

}
