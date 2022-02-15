import java.util.Scanner;

public class BMI {
    private double weight;
    private double height;
    //private double bmi;
    public static final double POUNDSTOKILOGRAM = 0.45359237;
    public static final double INCHESTOMETERS = 0.0254;

    public BMI(double weight, double height){
        //double kilo = 0.45359237;
        //this.weight = weight * kilo;
        //double meters = 0.0254;
        //this.height = height * meters;
        this.weight = weight * POUNDSTOKILOGRAM;
        this.height = height * INCHESTOMETERS;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getWeight(){
        return weight;
    }

    public double getHeight(){
        return height;
    }

    public double getBMI(){
        // this.bmi = (this.weight/(this.height*this.height));
        // return bmi;
        return (this.weight/(this.height*this.height));
    }
    
    public void printInterpretation(){
        double bmi = getBMI();
        if(bmi<18.5){
            System.out.println("Underweight");
        }
        else if(18.5>=bmi && bmi<25.0){
            System.out.println("Normal");
        }
        else if(25.0>=bmi && bmi<30.0){
            System.out.println("Overweight");
        }
        else if(30.0>=bmi){
            System.out.println("Obese");
        }
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();

        BMI printB = new BMI(weight, height);
        System.out.println("BMI is " + printB.getBMI());
        printB.printInterpretation();
    }
}
