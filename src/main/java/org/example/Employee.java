package org.example;

public class Employee {

        static int portal_id = 0;
        private String name;
        private String surname;
        private String patronymic;
        private String afterbirth;
        private String position;
        private String address_work;
        // private String grade;
        private String telephone_stack;
        private boolean at_work = true;


        public Employee() {
            System.out.println();
        }

        public Employee(String name, String surname, String patronymic, String afterbirth, String position, String address_work, String telephone_stack, boolean at_work/*, String grade*/) {
            this.name = name;
            this.surname = surname;
            this.patronymic = patronymic;
            this.afterbirth = afterbirth;
            this.position = position;
            this.address_work = address_work;
            this.telephone_stack = telephone_stack;
            this.at_work = at_work;
            //this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public String getAfterbirth() {
            return afterbirth;
        }

        public String getPosition() {
            return position;
        }

        public String getAddress_work() { return address_work;}

        //public String getGrade() {
        //  return grade();}

        public String getTelephone_stack() {
            return telephone_stack;
        }

        public boolean getAt_work() {
            return at_work;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSurname (String surname) {
            this.surname = surname;
        }

        public void setPatronymic (String patronymic) {
            this.patronymic = patronymic;
        }

        public void setAfterbirth (String Afterbirth) {
            this.afterbirth = afterbirth;
        }

        public void setPosition (String position) {
            this.position = position;
        }

        public void setAddress_work(String address_work) {
            this.address_work = address_work;
        }

        //public String getGrade() {
        //  return grade();}

        public void setTelephone_stack (String telephone_stack) {
            this.telephone_stack = telephone_stack;
        }

        public void setAt_work (boolean at_work) {
            this.at_work = at_work;
        }


    }

