package builderpattern;

public class Document {
    private String firstName;
    private String lastName;
    private String address;
    private String gender;
    private Integer age;
    
    public Document() {
    }

    public Document(String firstName, String lastName, String address, String gender, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }


    public String getFirstName() {
        return this.firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return this.gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static Builder builder() {
        return new Builder();
    }


    @Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", address='" + getAddress() + "'" +
            ", gender='" + getGender() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String address;
        private String gender;
        private Integer age;

        public Builder lastName(String lastName) {
        this.lastName = lastName;
            return this;
        }
        public Builder firstName(String firstName) {
        this.firstName = firstName;
            return this;
        }
        public Builder address(String address) {
        this.address = address;
            return this;
        }
        public Builder gender(String gender) {
        this.gender = gender;
            return this;
        }
        public Builder age(Integer age) {
        this.age = age;
            return this;
        }

        public Document build() {
            Document document = new Document();
            document.setFirstName(this.firstName);
            document.setLastName(this.lastName);
            document.setAddress(this.address);
            document.setGender(this.gender);
            document.setAge(this.age);
            return document;
        }  
    }
}
