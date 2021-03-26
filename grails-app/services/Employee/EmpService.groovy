package Employee

import grails.gorm.transactions.Transactional
import groovy.sql.Sql

import java.sql.Date
import java.text.SimpleDateFormat

@Transactional
class EmpService {
    def dataSource

    def getEmpById(int id) {
        def sql = new Sql(dataSource)
        try {
            def employee = sql.firstRow("""
                                    select employeeId,
                                           lastName,
                                           firstName,
                                           afm,
                                           to_char(dob, 'DD-MM-YYYY') as dob,
                                           departmentId
                                    from employees where employeeId=:employeeId
                                    """, [employeeId: id])
            return employee
        }
        catch (e) {
            e.printStackTrace();
            return []
        }

    }

    def updateEmp(params) {
        def sql = new Sql(dataSource)
        def employeeId = params.employeeId.toInteger()
        def temp = params.dob.split("-")
        def new_date = temp[2] + "-" + temp[1] + "-" + temp[0]
        def dob = Date.valueOf(new_date)
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

    def createEmp(params) {
        def sql = new Sql(dataSource)
        def temp = params.dob.split("-")
        def new_date = temp[2] + "-" + temp[1] + "-" + temp[0]
        def dob = Date.valueOf(new_date)


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

    def deleteEmp(params) {
        def sql = new Sql(dataSource)
        def employeeId = params.employeeId.toInteger()
        try {
            sql.execute('''
                        delete from employees where employeeId=:employeeId
                        returning *
                        ''', [employeeId: employeeId])
            return true
        }
        catch (e) {
            e.printStackTrace();
            return []
        }

    }

    def getEmpByDept(id) {
        def sql = new Sql(dataSource)
        def departmentId = id.toInteger()
        try {
            def employeesByDepartment = sql.rows('''
                                    select employeeId,
                                           firstName,
                                           lastName,
                                           afm,
                                           to_char(dob, 'DD-MM-YYYY') as dob,
                                            departmentId
                                    from employees where departmentId=:departmentId
                                    ''', [departmentId: departmentId])
            return employeesByDepartment
        }
        catch (e) {
            e.printStackTrace();
            return []
        }

    }



}
