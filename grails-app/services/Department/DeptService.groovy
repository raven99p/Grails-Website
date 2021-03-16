package Department

import grails.gorm.transactions.Transactional
import groovy.sql.Sql

@Transactional
class DeptService {
    def dataSource

    def createDept(params) {
        def sql = new Sql(dataSource)
        try {
            def resultRows = sql.execute('''
                                        insert into dept 
                                            (d_name) 
                                            values (?)
                                        ''', [params.d_name])
            sql.close()
            return resultRows
        }
        catch (e) {
            sql.close()
            return false
        }


    }

    def updateDept(params) {
        def sql = new Sql(dataSource)
        def d_id = params.dept_id.toInteger()
        try {
            def res = sql.executeUpdate('''
                                        update dept 
                                        set d_name=:d_name 
                                        where id=:d_id
                                        ''', [d_name: params.d_name, d_id: d_id])
            sql.close()
            return res
        }
        catch (e) {
            sql.close()
            return false
        }

    }

    def deleteDept(params) {
        def sql = new Sql(dataSource)
        def id_integer = params.d_id.toInteger()
        try {
            sql.execute('''
                        delete from dept where id=:id
                        ''', [id: id_integer])
            sql.close()
            return true
        }
        catch (e) {
            sql.close()
            return false

        }
    }

    def getDeptById(int id) {
        def sql = new Sql(dataSource)
        try {
            def resultRows = sql.rows('''
                                    select * from dept where id=:id
                                    ''', [id: id])
            sql.close()
            return resultRows
        }
        catch (e) {
            sql.close()
            return false
        }

    }


}
