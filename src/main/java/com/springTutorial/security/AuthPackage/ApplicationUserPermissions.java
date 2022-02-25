package com.springTutorial.security.AuthPackage;


import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum ApplicationUserPermissions {

    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write"),
    COURSES_READ("courses:read"),
    COURSES_WRITE("courses:write"),
    ;

    private final String permission;

    ApplicationUserPermissions(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }

}
