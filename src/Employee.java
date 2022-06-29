public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax() {


        if (salary > 1000) {
            double afterTax = this.salary - (this.salary * 0.03);
            return afterTax;

        } else {
            System.out.println("Vergi borcunuz yoktur!");

            return 0;
        }


    }public double bonus(){
        if(workHours <40){
            return 0;

        }else{
            double bonuss = (workHours-40)*30;
            return bonuss;
        }
    }public double raiseSalary(){
        if(2021-hireYear <10){
            double increase = this.salary *0.05;
            return increase;
        }if(2021-hireYear>9 && 2021-hireYear <20){
            double increase = this.salary *0.10;
            return increase;
        }if(2021-hireYear >=20){
            double increase = this.salary *0.15;
            return increase;
        }
        return 0;
    }

    public void run() {

        double taxAndBonus= (this.salary - (this.salary - tax()) +bonus());
        double totalSalary= taxAndBonus + raiseSalary();
        System.out.println("Adı : " + this.name);
        System.out.println("Maaş miktarı : " + this.salary);
        System.out.println("Çalışma saati : " + this.workHours);
        System.out.println("Başlangıç yılı : " + hireYear);
        System.out.println("Vergi miktarı : " + (this.salary - tax()));
        System.out.println("Bonus : "  + bonus());
        System.out.println("Maaş artışı : " + raiseSalary());
        System.out.println("Vergi ve bonuslar ile maaş : " + taxAndBonus );
        System.out.println("Toplam Maaş (Vergi Kesintisi dahil!)) : " + totalSalary);

    }


}
