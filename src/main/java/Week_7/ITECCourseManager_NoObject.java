package Week_7;

import java.util.ArrayList;

public class ITECCourseManager_NoObject {
    public static void main(String[] args) {

        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

        //add students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.removeStudent("Carl");
        maintenanceCourse.removeStudent("Martha");

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30);

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();

        ITECCourse softwareCourse = new ITECCourse("Software Development Projects", 2903, 24);
        softwareCourse.addStudent("Gus");
        softwareCourse.addStudent("Harry");
        softwareCourse.addStudent("Izzy");

        softwareCourse.writeCourseInfo();

        ITECCourse smallCourse = new ITECCourse("Made up course", 1234, 3);
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        smallCourse.addStudent("Miriam");
        smallCourse.addStudent("Nita");

        smallCourse.writeCourseInfo();
    }
}
