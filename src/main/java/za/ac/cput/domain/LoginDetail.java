/*
LoginDetail.java
2nd Domain entity
@Author: Siyakha Manisi (219239657)
09 April 2023
* */
package za.ac.cput.domain;

import java.util.Objects;

public class LoginDetail {
    private String username;
    private String password;

    private LoginDetail(Builder builder)
    {
        this.username = builder.username;
        this.password = builder.password;

    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    @Override
    public boolean equals(Object a)
    {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        LoginDetail ld = (LoginDetail) a;
        return Objects.equals(username, ld.username) && Objects.equals(password, ld.password);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(username, password);
    }

    @Override
    public String toString()
    {
        return "LoginDetail{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder
    {
        String username;
        String password;

        public Builder setUsername(String username)
        {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password)
        {
            this.password = password;
            return this;
        }

        public Builder copy(LoginDetail ld)
        {
            this.username = ld.username;
            this.password = ld.password;
            return this;

        }

        public LoginDetail build()
        {
            return new LoginDetail(this);
        }
    }
}
