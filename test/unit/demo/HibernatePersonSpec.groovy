package demo

import grails.test.mixin.hibernate.HibernateTestMixin
import grails.test.mixin.gorm.Domain
import spock.lang.Specification

@TestMixin(HibernateTestMixin)
@Domain([Person, Address])
class HibernatePersonSpec extends Specification {

    void "test saving entity with a reference to another entity"() {
        given:
        def person = new Person(name: 'some name', homeAddress: new Address(city: "O'Fallon"))

        expect:
        person.save()
    }
}
