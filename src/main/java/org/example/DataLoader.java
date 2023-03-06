package org.example;
//import com.itfactory.model.Course;
//import com.itfactory.model.Student;
//import com.itfactory.utils.DataLoaderUtils;

import java.io.IOException;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class DataLoader {

        private Map<Course, List<Student>> dataMap;
        private List<Student> students;

        public DataLoader() {
            dataMap = new HashMap<>();
            students = new ArrayList<>();

            //dataMap.get(Course).add(studentName);
        }

        public void loadData() throws IOException {
            loadCourses();
            loadStudents();

//            mapStudentsToCourses();
        }

        private void loadCourses() throws IOException {
            List<String> courseInputData = DataLoaderUtils.readFile(DataLoaderUtils.COURSE_FILE_PATH);
            System.out.println(courseInputData);

            for (String courseInputDatum : courseInputData) {
                String[] data = courseInputDatum.split(",");
                System.out.println(data);
                Course cursNou = createCourse(data);
                dataMap.put(cursNou, new ArrayList<>());
                System.out.println(dataMap);
            }
        }

        private Course createCourse(String[] data) {
            System.out.println(data[0]);
            int id = Integer.parseInt(data[0]);
            System.out.println(data[1]);
            String name = data[1];
            System.out.println(data[2]);
            double price = Double.parseDouble(data[2]);
            System.out.println(data[3]);

            LocalDate dataInceput = LocalDate.parse(data[3]);
            return new Course(id, name, price,dataInceput);
        }

        private void loadStudents() throws IOException{
            List<String> students = DataLoaderUtils.readFile(DataLoaderUtils.STUDENT_FILE_PATH);
            System.out.println(students);

            for (String line: students){
                String[] dateStudent = line.split(",");
                Student student = createStudent(dateStudent);
                students.add(String.valueOf(student));
            }

        }
        private Student createStudent(String[] dateStudent){
            int id = Integer.parseInt(dateStudent[0]);
            String nume = dateStudent[1];
            double buget = Double.parseDouble(dateStudent[2]);

            Student student = new Student(id,nume,buget);
            return student;
        }


        private void mapStudentsToCourses() {

        }

        public Map<Course, List<Student>> getDataMap() {
            return dataMap;
        }

}
