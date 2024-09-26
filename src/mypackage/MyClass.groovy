package mypackage

class MyClass {

    Object jenkinsSteps

    MyClass(Object jenkinsSteps) {
        this.jenkinsSteps = jenkinsSteps
    }

    void hello(String name) {
        jenkinsSteps.sh("echo hello ${name}")
    }

}
