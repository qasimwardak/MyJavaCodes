package com.syntax.Class19;

public class Task4StaicCons {
    static int RegNumber;
    static String SchoolName;
    String Name;
    double GPA;
  Task4StaicCons(int RegNumber, String SchoolName,
                 String Name, double GPA) {
      RegNumber++;
      this.SchoolName=SchoolName;
      this.Name=Name;
      this.GPA=GPA;

  }


}
