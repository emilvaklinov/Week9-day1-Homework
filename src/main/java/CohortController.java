import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class CohortController {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        staticFileLocation("/public");

        Cohort student1 = new Cohort("Ishtvan", 23);
        Cohort student2 = new Cohort("Ben", 24);
        Cohort student3 = new Cohort("John", 25);
        Cohort student4 = new Cohort("Isin", 26);
        Cohort student5 = new Cohort("Ben", 27);
        Cohort student6 = new Cohort("Josh", 28);
        Cohort student7 = new Cohort("Sam", 29);
        Cohort student8 = new Cohort("Benji", 30);
        Cohort student9 = new Cohort("Johnshua", 31);
        Cohort student10 = new Cohort("VanDam", 32);
        Cohort student11 = new Cohort("Yan", 33);
        Cohort student12 = new Cohort("Benson", 34);
        Cohort student13 = new Cohort("Harison", 35);
        Cohort student14 = new Cohort("Mat", 36);
        Cohort student15 = new Cohort("Timoty", 37);
        Cohort student16 = new Cohort("Hanna", 38);
        Cohort student17 = new Cohort("Kat", 39);
        Cohort student18 = new Cohort("Emilly", 40);
        Cohort student19 = new Cohort("Mark", 41);
        Cohort student20 = new Cohort("Bin", 42);

        ArrayList <Cohort> students = new ArrayList<Cohort>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);
        students.add(student16);
        students.add(student17);
        students.add(student18);
        students.add(student19);
        students.add(student20);

        get("/students", (req, res) -> {

            HashMap<String, Object> model = new HashMap<>();
            model.put("students", students);
            model.put("template", "students.vtl");


            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/random", (req, res) -> {

            HashMap<String, Object> model = new HashMap<>();
            model.put("students", students);
            model.put("template", "random.vtl");


            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);


        get("/pair", (req, res) -> {

            HashMap<String, Object> model = new HashMap<>();
            model.put("students", students);
            model.put("template", "pair.vtl");


            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);
    }

}
