package org.fbreshbyte;


//exemplu
public class MandatoryFields {

    public class MandatoryFieldsChecker {

        public static boolean areFieldsMandatoryFilled(String... fields) {
            for (String field : fields) {
                if (field == null || field.trim().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            // Sample usage of the method
            String firstName = "Remus";
            String lastName = "Vescan";
            String email = "vescan.remus@gmail.com";
            String phone = "0777777777";
            // Add more fields if needed

            // Check if all fields are filled
            boolean allFieldsFilled = areFieldsMandatoryFilled(firstName, lastName, email, phone);
            if (allFieldsFilled) {
                System.out.println("Mandatory fields are filled.");
            } else {
                System.out.println("Some mandatory fields are empty.");
            }
        }
    }
}
