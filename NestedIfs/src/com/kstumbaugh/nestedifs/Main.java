package com.kstumbaugh.nestedifs;

public class Main {

    public static void main(String[] args) {
	    float students = 0.0f;
	    float rooms = 4.0f;

	    //CONDITIONAL ASSIGNMENT
        // result = condition ? true-value : false value;
        // float studentsPerRoom == 0.0f ? 0.0f : students/rooms;
        // System.out.println(studentsPerRoom)

	    if(students > 0.0f) { //block statement under this if
            if (rooms > 0.0f)
                System.out.println((students / rooms));
        }
	    else
            System.out.println("No Students");
        System.out.println();
        System.out.println("**end program **");

        /*Variable declared within block is not visible outside of block*/
            //variables range of visibility is known as the variable scope

        float student = 30.0f;
        float room = 4.0f;

        if (room > 0.0){
            System.out.println(student);
            System.out.println(room);
            float avg = student / rooms;
            System.out.println(avg);
        }
        }
}
