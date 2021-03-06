package day35_Encapsulation.encapsulation;

public class Person {

      private String name;
      private int age;

     //getter
      public String getName(){
          return name;
      }

      //setter
      public void setName(String name){
          this.name=name;
      }

    //getter
      public int getAge(){
          return age;
      }


      // setter
      public void setAge(int age){
          if(age<=0 || age>150){
              System.err.println("Invalid age: "+age);
              System.exit(0);
          }

          this.age=age;
      }


}
