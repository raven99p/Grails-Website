package helloworld

import grails.gorm.transactions.Transactional
import groovy.sql.Sql
import java.sql.Date


@Transactional
class SimpleService {
    def dataSource

    def getDept() {
        def sql = new Sql(dataSource)
        def resultRows = sql.rows('select * from dept')
        sql.close()
        return resultRows
    }

    def getEmpByDept(id) {
        def sql = new Sql(dataSource)
        def D_id = id.toInteger()
        def resultRows = sql.rows('select * from employee where dept_id=:D_id',[D_id:D_id])
        sql.close()
        return resultRows
    }

    def getEmpById(int id) {
        def sql = new Sql(dataSource)
        def resultRows = sql.rows('select * from employee where id=:id',[id:id])
        sql.close()
        return resultRows
    }

    def updateEmp(params) {
        def sql = new Sql(dataSource)
        def afm = params.afm.toInteger()
        def id = params.id.toInteger()
        def dob = Date.valueOf(params.dob)
        def res = sql.executeUpdate('update employee set first_name=:fName, last_name=:lName, afm=:afm, dob=:dob  where id=:id',[fName:params.first_name, lName:params.last_name, afm:afm, id:id, dob:dob])
        sql.close()
        return res
    }

    def hireEmp(params) {
        def sql = new Sql(dataSource)
        def afm = params.afm.toInteger()
        def dob = Date.valueOf(params.dob)
        def dept_id = params.dept_id.toInteger()
        def resultRows = sql.execute('insert into employee (first_name,last_name,afm,dob,dept_id) values (?,?,?,?,?)',[params.first_name,params.last_name,afm,dob,dept_id])

        sql.close()
        return resultRows

    }



}
