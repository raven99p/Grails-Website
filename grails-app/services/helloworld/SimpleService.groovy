package helloworld

import grails.gorm.transactions.Transactional
import groovy.sql.Sql
import java.sql.Date


@Transactional
class SimpleService {
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
                                    ''',[D_id:D_id])
        sql.close()
        return resultRows
    }

    def getEmpById(int id) {
        def sql = new Sql(dataSource)
        def resultRows = sql.rows('''
                                    select * from employee where id=:id
                                    ''',[id:id])
        sql.close()
        return resultRows
    }

    def updateEmp(params) {
        def sql = new Sql(dataSource)
        def id = params.id.toInteger()
        def dob = Date.valueOf(params.dob)
        def d_id = params.dept_id.toInteger()
        def res = sql.executeUpdate('''
                                        update employee 
                                        set first_name=:fName,
                                            last_name=:lName,
                                            afm=:afm, 
                                            dob=:dob, 
                                            dept_id=:d_id  
                                        where id=:id
                                        ''',[fName:params.first_name, lName:params.last_name, afm:params.afm, id:id, dob:dob, d_id:d_id])
        sql.close()
        return res
    }

    def createEmp(params) {
        def sql = new Sql(dataSource)
        def dob = Date.valueOf(params.dob)
        def dept_id = params.dept_id.toInteger()
        def resultRows = sql.execute('''
                                        insert into employee 
                                            (first_name,last_name,afm,dob,dept_id) 
                                            values (?,?,?,?,?)
                                        ''',[params.first_name,params.last_name,params.afm,dob,dept_id])

        sql.close()
        return resultRows
    }

    def deleteEmp(params) {
        def sql = new Sql(dataSource)
        def id_integer = params.id.toInteger()
        sql.execute('''
                        delete from employee where id=:id
                        ''',[id:id_integer])
        sql.close()
        return 'fire Employee'
    }

    def createDept(params) {
        def sql = new Sql(dataSource)
        def resultRows = sql.execute('''
                                        insert into dept 
                                            (d_name) 
                                            values (?)
                                        ''',[params.d_name])
        sql.close()
        return resultRows
    }

    def updateDept(params) {
        def sql = new Sql(dataSource)
        def d_id = params.dept_id.toInteger()
        def res = sql.executeUpdate('''
                                        update dept 
                                        set d_name=:d_name 
                                        where id=:d_id
                                        ''',[d_name:params.d_name,d_id:d_id])
        sql.close()
        return res
    }

    def deleteDept(params) {
        def sql = new Sql(dataSource)
        def id_integer = params.d_id.toInteger()
        try {
            sql.execute('''
                        delete from dept where id=:id
                        ''',[id:id_integer])
            sql.close()
            return true
        }
        catch(e) {
            sql.close()
            return false

        }

    }
    def getDeptById(id) {
        def sql = new Sql(dataSource)
        def d_id = id.toInteger()
        def resultRows = sql.rows('''
                                    select d_name from dept where id=:id
                                    ''',[id:d_id])
        sql.close()
        return resultRows.d_name

    }




}
