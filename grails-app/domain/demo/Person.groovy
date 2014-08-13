package demo

class Person {
    String name
    Address homeAddress

    static mapping = {
        homeAddress cascade: 'save-update'
    }
}
