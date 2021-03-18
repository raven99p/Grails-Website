package Department

import grails.gorm.transactions.Transactional
import groovy.sql.Sql

@Transactional
class DeptService {
    def dataSource

    def createDept(params) {
        def sql = new Sql(dataSource)
        def departmentName = params.departmentName
        try {
            def insertion = sql.execute("""
                                        insert into departments 
                                            (departmentName) 
                                            values (${departmentName})
                                        """)
            return insertion
        }
        catch (e) {
            e.printStackTrace();
            return []
        }
    }

    def updateDept(params) {
        def sql = new Sql(dataSource)
        def departmentId = params.departmentId.toInteger()
        try {
            def update = sql.execute('''
                                        update departments 
                                        set departmentName=:departmentName 
                                        where departmentId=:departmentId
                                        returning *
                                        ''', [departmentName: params.departmentName, departmentId: departmentId])
            return update
        }
        catch (e) {
            e.printStackTrace();
            return []
        }
    }

    def deleteDept(params) {
        def sql = new Sql(dataSource)
        def departmentId = params.departmentId.toInteger()
        try {
            sql.execute('''
                        delete from departments where departmentId=:departmentId
                        ''', [departmentId: departmentId])
            return true
        }
        catch (e) {
            e.printStackTrace();
            return []
        }
    }

    def getDeptById(int departmentId) {
        def sql = new Sql(dataSource)
        try {
            def department = sql.firstRow("""
                                    select departmentName from departments where departmentId=:departmentId
                                    """, [departmentId: departmentId])
            return department
        }
        catch (e) {
            e.printStackTrace();
            return []
        }
    }

    def getAllDepartments() {
        def sql = new Sql(dataSource)
        try {
            def allDepartments = sql.rows('''
                                    select * from departments
                                    ''')
            return allDepartments
        }
        catch (e) {
            e.printStackTrace();
            return []
        }
    }
}
