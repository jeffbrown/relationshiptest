package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(Person)
@Mock(Address)
class PersonSpec extends Specification {

    void "test saving entity with a reference to another entity"() {
        given:
        def person = new Person(name: 'some name', homeAddress: new Address(city: "O'Fallon"))

        expect:
        person.save()
    }
}
