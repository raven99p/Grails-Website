package helloworld

import grails.gorm.transactions.Transactional
import groovy.sql.Sql

@Transactional
class CredService {

    def dataSource

    def getPwdByUser() {
        def sql = new Sql(dataSource)
        def resultRows = sql.rows('select * from users')
        sql.close()
        return resultRows
    }


}
