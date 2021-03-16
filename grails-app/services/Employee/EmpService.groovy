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
            def resultRows = sql.rows('''
                                    select *,to_char(dob, 'DD-MM-YYYY') as greekDate from employee where id=:id
                                    ''', [id: id])
            sql.close()
            return resultRows
        }
        catch(e) {
            sql.close()
            return false
        }

    }

    def updateEmp(params) {
        def sql = new Sql(dataSource)
        def id = params.id.toInteger()
        def temp = params.dob.split("-")
        def new_date = temp[2] + "-" + temp[1] + "-" + temp[0]
        def dob = Date.valueOf(new_date)
        def d_id = params.dept_id.toInteger()
        try {
            def res = sql.executeUpdate('''
                                        update employee 
                                        set first_name=:fName,
                                            last_name=:lName,
                                            afm=:afm, 
                                            dob=:dob, 
                                            dept_id=:d_id  
                                        where id=:id
                                        ''', [fName: params.first_name, lName: params.last_name, afm: params.afm, id: id, dob: dob, d_id: d_id])
            sql.close()
            return res
        }
        catch(e) {
            sql.close()
            return false
        }

    }

    def createEmp(params) {
        def sql = new Sql(dataSource)
        def temp = params.dob.split("-")
        def new_date = temp[2] + "-" + temp[1] + "-" + temp[0]
        def dob = Date.valueOf(new_date)



        def dept_id = params.dept_id.toInteger()
        try {
            def resultRows = sql.execute('''
                                        insert into employee 
                                            (first_name,last_name,afm,dob,dept_id) 
                                            values (?,?,?,?,?)
                                        ''', [params.first_name, params.last_name, params.afm, dob, dept_id])
            sql.close()
            return resultRows
        }
        catch(e) {
            sql.close()
            return false
        }

    }

    def deleteEmp(params) {
        def sql = new Sql(dataSource)
        def id_integer = params.id.toInteger()
        try {
            sql.execute('''
                        delete from employee where id=:id
                        ''', [id: id_integer])
            sql.close()
            return true
        }
        catch(e) {
            sql.close()
            return false
        }

    }
}
