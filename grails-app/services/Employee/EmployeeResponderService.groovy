package Employee

import grails.gorm.transactions.Transactional
import groovy.sql.Sql

import java.sql.Date

@Transactional
class EmployeeResponderService {
    def dataSource

    def createEmployee(params) {
        def sql = new Sql(dataSource)
        def afm = params.afm.toInteger()
        def smallDate =  params.dob.substring(0,10)
        def dob = Date.valueOf(smallDate)
        def departmentId = params.departmentId.toInteger()
        try {
            def insertion = sql.execute("""
                                        insert into employees 
                                            (firstName,lastName,afm,dob,departmentId) 
                                            values (${params.firstName},  ${params.lastName}, ${params.afm}, ${dob}, ${departmentId}) 
                                            returning *
                                         """)
            return insertion
        }
        catch (e) {
            e.printStackTrace();
            return 'Failed: create employee'
        }
    }

    def updateEmp(params) {
        def sql = new Sql(dataSource)
        def employeeId = params.employeeId.toInteger()
        def smallDate =  params.dob.substring(0,10)
        def dob = Date.valueOf(smallDate)
        def departmentId = params.departmentId.toInteger()
        try {
            def update = sql.execute('''
                                        update employees 
                                        set firstName=:firstName,
                                            lastName=:lastName,
                                            afm=:afm, 
                                            dob=:dob, 
                                            departmentId=:departmentId  
                                        where employeeId=:employeeId
                                        returning *
                                        ''', [firstName: params.firstName, lastName: params.lastName, afm: params.afm, employeeId: employeeId, dob: dob, departmentId: departmentId])
            return update
        }
        catch (e) {
            e.printStackTrace();
            return []
        }
    }
}
