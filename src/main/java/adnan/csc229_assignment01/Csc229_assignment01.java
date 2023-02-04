/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package adnan.csc229_assignment01;

/**
 *
 * @author adnan
 */
public class Csc229_assignment01 {

    public static void main(String[] args) {
        Course course = new Course();
        course.setID("1234");
        course.setName("CSC229");
        course.setCode(9999);
        System.out.println(course.getID());
        System.out.println(course.getName());
        System.out.println(course.getCode());
    }
}
