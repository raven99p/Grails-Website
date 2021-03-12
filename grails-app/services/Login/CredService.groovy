package Login

import grails.gorm.transactions.Transactional
import groovy.sql.Sql

@Transactional
class CredService {

    def dataSource

    def getPwdByUser(params) {
        def sql = new Sql(dataSource)
        def resultRows = sql.rows('''
                                    select password, is_active from users where username=:username
                                    ''', [username: params.username])
        sql.close()
        if (params.password.toString() == resultRows.password[0] && resultRows.is_active[0] == true) {
            return true
        } else {
            return false
        }
    }


}
