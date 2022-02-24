package com.springTutorial.security.AuthPackage;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.springTutorial.security.AuthPackage.ApplicationUserPermissions.*;


public enum ApplicationUserRoles {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSES_READ, COURSES_WRITE, STUDENT_READ, STUDENT_WRITE));

    private final Set<ApplicationUserPermissions> permissions;


    ApplicationUserRoles(Set<ApplicationUserPermissions> permissions) {
        this.permissions = permissions;
    }


}
