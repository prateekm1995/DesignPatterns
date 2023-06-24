package builderpattern;

/***
 * for to avoid constructor telescoping.
 * managable and customisable object creationg.
 * easy to make object mutable.
 * to make some fields mandatory, make those fields as arguments
 */
public class Driver {
    public static void main (String[] args) {
        Document document = Document.builder()
            .firstName("FirstName")
            .lastName("LastName")
            .address("Address")
            .age(25)
            .build();

        Document.Builder docBuilder = Document.builder();

        docBuilder.address("address");
         Document doc2 = document;
         doc2.setAge(15);
         
         System.out.println(document);  
         doc2.setAge(10);
         System.out.println(document);  
         System.out.println(docBuilder.build());  
         System.out.println(docBuilder.build() == docBuilder.build()); 
        }
}