package hello.entity;

import java.util.List;

public class LoginResponse {

    public boolean success;
    public Data data;

    public static class Contacts {
        public String vk;
        public String phone;
        public String email;
        public String updated;
    }

    public static class Data {
        public User user;
        public String token;
    }

    public static class ProfileValues {
        public Integer homeTask;
        public Integer projects;
        public Integer linesCode;
        public Integer rait;
        public String updated;
    }


    public static class PublicInfo {
        public String bio;
        public String avatar;
        public String photo;
        public String updated;
    }

    public static class Repo {
        public String id;
        public String git;
        public String title;
    }

    public static class Repositories {

        public List<Repo> repo = null;
        public String updated;

    }

    public static class User {
        public String id;
        public String firstName;
        public String secondName;
        public Integer v;
        public Repositories repositories;
        public Contacts contacts;
        public ProfileValues profileValues;
        public PublicInfo publicInfo;
        public String specialization;
        public String role;
        public String updated;
    }
}