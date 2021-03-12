package General

import grails.gorm.transactions.Transactional
import groovy.sql.Sql

@Transactional
class GenService {
    def dataSource
    def getDept() {
        def sql = new Sql(dataSource)
        def resultRows = sql.rows('''
                                    select * from dept
                                    ''')
        sql.close()
        return resultRows
    }

    def getEmpByDept(id) {
        def sql = new Sql(dataSource)
        def D_id = id.toInteger()
        def resultRows = sql.rows('''
                                    select * from employee where dept_id=:D_id
                                    ''', [D_id: D_id])
        sql.close()
        return resultRows
    }

    def getDeptById(id) {
        def sql = new Sql(dataSource)
        def d_id = id.toInteger()
        def resultRows = sql.rows('''
                                    select d_name from dept where id=:id
                                    ''', [id: d_id])
        sql.close()
        return resultRows.d_name
    }
}
