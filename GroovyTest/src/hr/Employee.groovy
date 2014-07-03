package hr

import javax.persistence.*

@Entity
class Employee {
    
    @Id @GeneratedValue
    Integer id
    String name
    BigDecimal salary
    boolean manager

    String toString() { return name }
}