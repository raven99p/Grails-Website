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


}
