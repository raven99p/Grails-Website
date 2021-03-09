package helloworld

import grails.gorm.transactions.Transactional
import groovy.sql.Sql

@Transactional
class CredService {

    def dataSource

    def getPwdByUser(username) {
        def sql = new Sql(dataSource)
        def usm = username
        def resultRows = sql.rows('select password from users where login=:username',[usm])
        sql.close()
        return resultRows
    }


}
