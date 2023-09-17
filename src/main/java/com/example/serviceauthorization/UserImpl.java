package com.example.serviceauthorization;


import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserImpl {

    @Pattern(regexp = "^[a-zA-Z0-9]+$",
    message = "Разрешены только латинские буквы и цифр")
    @Size(min = 2, max = 100,
    message = "Имя должно быть больше двух символов")
    private String name;


    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^\\w\\s]).{6,}",
            message = "Пароль может состоять из латинских букв, цифр и спецсимволов")
    @Size(min = 6, max = 50,
    message = "Пароль должно быть больше шести символов")
    private String password;

    public UserImpl(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}