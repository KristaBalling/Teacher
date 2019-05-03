package com.theironyard;

public class SubstituteTeacher extends SchoolStaff {

    public void teach() throws CannotTeachException {
        throw new CannotTeachException();
    }
}
