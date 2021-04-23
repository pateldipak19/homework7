/*
*created by dipak patel
* Main method to run all java programs
 */

public class MainMethod {

    public static void main(String[] args) {

        //odd-even program 1
        OddEven p1 = new OddEven();
        p1.m();

        //find leap year or not program 2
        LeapYearFinder.m();

        //Student mark-sheet program 3
        StdentMarkSheet ms = new StdentMarkSheet();//object created
        ms.m();//calling instance method

        //salary slip printing with data input program 5
        SalarySlip.p5();

        //odd-even program using if-else statements program 6
        IFOddEven oe = new IFOddEven();
        oe.p6();

        //program to find seller commission program 7
        SalesCommission sc = new SalesCommission();
        sc.m();

        //find city name with alphabets with if-else statements program 8
        CityNAme.p8();

        //find city name with alphabets with switch statements program 9
        CityNameSwitch.cityName();

        //program for calculator using symbols program 10
        SymbolCalculator.m();

        //division by 3 and 5 for numbers 1 to 100 program 11
        DivisionBy db = new DivisionBy();
        db.p11();

        //find input value is number or an alphabet or symbol program 12
        NumberAlphabetSymbol.valueCheck();

        //input number find the day in a week program 13
        Number2Days.m();

        //person full name program 14
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

        //find wall area program 15
        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        //find number is positive,negative or zero program 16
        PositiveNegativeZero pnz = new PositiveNegativeZero();
        pnz.m();

        //sort numeric and string array program 17
        NumericString.m();

        //sum value of an array program 18
        ArraySum as = new ArraySum();
        as.m();

        //average of an array  program 19
        ArrayAverage aa = new ArrayAverage();
        aa.arrayAverage();

        //find array contains a specific value program 20
        ArraySpecificValue.m();




    }
}