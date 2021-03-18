package Login

import grails.gorm.transactions.Transactional
import groovy.sql.Sql

@Transactional
class CredService {

    def dataSource

    def getPwdByUser(params) {
        def sql = new Sql(dataSource)
        try {
            def resultRows = sql.firstRow("""
                                    select password, is_active from users where username=:username
                                    """, [username: params.username])
            if (params.password.toString() == resultRows.password && resultRows.is_active == true) {
                return true
            } else {
                return []
            }
        }
        catch (e) {
            e.printStackTrace();
            return []
        }

    }


}
