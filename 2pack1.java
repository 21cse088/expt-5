package pack1;
import pack.*;
    class suboops extends oops [
        public static void main(Strings[]args) {
            suboops obj=new suboops();
            obj.display();
            try{
                obj.display();
            }
            catch(Exception e) {
               System.out.println("Default property cannot be displayed");
           }
}