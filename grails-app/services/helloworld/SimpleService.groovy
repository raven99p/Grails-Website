package helloworld

import grails.gorm.transactions.Transactional
import groovy.sql.Sql

import javax.sql.DataSource


@Transactional
class SimpleService {
    def dataSource

    def getDept() {
        def sql = new Sql(dataSource)
        def resultRows = sql.rows('select * from dept')
        sql.close()
        return resultRows
    }
    def getEmpByDept(int id) {
        def sql = new Sql(dataSource)
        def resultRows = sql.rows('select * from employee where dept_id=:id',[id:id])
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
        sql.executeUpdate "update employee set first_name=$params.first_name, last_name=$params.last_name, afm=$params.afm, dob=$params.dob  where id=$params.id"
        sql.close()
        return "Updated employee"
    }



}
