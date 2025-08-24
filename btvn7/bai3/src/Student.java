
    public class Student {
        private String id;
        private String name;
        private int age;
        private String email;
        private String className;
        private String address;
        private double score;

        public Student(String id, String name, int age, String email, String className, String address, double score) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.email = email;
            this.className = className;
            this.address = address;
            this.score = score;
        }

        // getter
        public String getId() { return id; }
        public String getName() { return name; }
        public int getAge() { return age; }
        public String getEmail() { return email; }
        public String getClassName() { return className; }
        public String getAddress() { return address; }
        public double getScore() { return score; }

        // Xếp loại
        public String getGrade() {
            if (score >= 8) return "A";
            else if (score >= 6) return "B";
            else if (score >= 4) return "C";
            else return "D";
        }
    }

