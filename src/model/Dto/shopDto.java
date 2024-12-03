package model.Dto;

public class shopDto {
        // 회원가입
        private int usernum;
        private String id;
        private String pwd;
        private int phnum;
        // 카테고리
        private int catenum;
        private String catename;
        // 상품
        private int prnum;
        private String prname;
        private int price;
        private String state;
        // 주문
        private int ordernum;
        private String buyer;
        private String seller;
        private String content;

        // 회원가입 생성자
        public shopDto(int usernum, String id, String pwd, int phnum) {
            this.usernum = usernum; this.id = id; this.pwd = pwd; this.phnum = phnum;
        }

        // 회원가입 getter,setter
        public int getUsernum() {return usernum;}
        public String getId() {return id;}
        public String getPwd() {return pwd;}
        public int getPhnum() {return phnum;}
        public void setId(String id) {this.id = id;}
        public void setPwd(String pwd) {this.pwd = pwd;}
        public void setUsernum(int usernum) {this.usernum = usernum;}
        public void setPhnum(int phnum) {this.phnum = phnum;}

        @Override
        public String toString() {
            return "shopDto{" +
                    "usernum=" + usernum +
                    ", id='" + id + '\'' +
                    ", pwd='" + pwd + '\'' +
                    ", phnum=" + phnum +
                    '}';
        }
    }
