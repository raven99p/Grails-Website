package helloworld

import grails.gorm.transactions.Transactional
import groovy.sql.Sql

@Transactional
class CredService {

    def dataSource

    def getPwdByUser(String username) {
        def sql = new Sql(dataSource)
        def resultRows = sql.rows('select password from users where login=:username',[username:username])
        sql.close()
        return resultRows
    }


}
