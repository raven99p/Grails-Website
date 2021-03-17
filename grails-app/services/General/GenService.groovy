package General

import grails.gorm.transactions.Transactional
import groovy.sql.Sql

@Transactional
class GenService {
    def dataSource

    def getDept() {
        def sql = new Sql(dataSource)
        try {
            def resultRows = sql.rows('''
                                    select * from dept
                                    ''')
            return resultRows
        }
        catch (e) {
            return false
        }

    }

    def getEmpByDept(id) {
        def sql = new Sql(dataSource)
        def D_id = id.toInteger()
        try {
            def resultRows = sql.rows('''
                                    select *,to_char(dob, 'DD-MM-YYYY') as greekDate from employee where dept_id=:D_id
                                    ''', [D_id: D_id])
            return resultRows
        }
        catch (e) {
            return false
        }

    }

    def getDeptById(id) {
        def sql = new Sql(dataSource)
        def d_id = id.toInteger()
        try {
            def resultRows = sql.rows('''
                                    select d_name from dept where id=:id
                                    ''', [id: d_id])
            return resultRows.d_name
        }
        catch (e) {
            return false
        }

    }
}
