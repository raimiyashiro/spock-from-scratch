import spock.lang.Specification

class FirstSpecification extends Specification {

    def "Should sum 1+1 = 2"() {
        expect:
        1 + 1 == 2
    }

    def "two plus two should equal four"() {
        given:
        def a = 2
        def b = 2

        when:
        def result = a + b
        then:
        result == 4
    }

    def "Should be able to remove from list"() {
        given:
        def list = [1, 2, 3, 4]
        when:
        list.remove(3)
        then:
        list == [1, 2, 3]
    }

    def "Should divide by 2 in blocks"() {
        expect:
        a == 2 * b
        where:
        a  | b
        2  | 1
        4  | 2
        32 | 16
    }
}
