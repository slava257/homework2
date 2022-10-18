public class Main {
    public static void main(String[] args) {
        System.out.println("задание 6");
        var weightOfOneBoxer =78.2;
        var weightOfTheSecondBoxer =82.7;
        var totalWeightOfBoxers = weightOfOneBoxer + weightOfTheSecondBoxer;
        System.out.println("общий вес боксеров" + totalWeightOfBoxers +  "кг");
        System.out.println("задание 7");
        var boxerWeightDifference = weightOfTheSecondBoxer - weightOfOneBoxer;
        System.out.println("разница в весе" + boxerWeightDifference +"кг!");
        System.out.println("разница в весе" + (weightOfTheSecondBoxer % weightOfOneBoxer));
        System.out.println("задание8");
        var openingHours = 640;
        var WorkingShift = 8;
        var companyEmployees = openingHours / WorkingShift;
        System.out.println("всего работников в компании" + companyEmployees+ "человек" );
        var companyEmployees2 = 94;
        var totalNumberOfEmployees = companyEmployees + companyEmployees2;
        var totalWorkingHours = totalNumberOfEmployees * WorkingShift;
        System.out.println("если в компании работает" + totalNumberOfEmployees + "человек, то всего" + totalWorkingHours +"часов работы может быть поделено между сотрудниками");
        System.out.println("если в компанииработает" + (companyEmployees +  companyEmployees2) + "человек, то всего" +totalNumberOfEmployees * WorkingShift + "часов работы может быть поделено между сотрудниками");
    }
}