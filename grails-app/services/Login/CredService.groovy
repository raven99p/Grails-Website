package Login

import grails.gorm.transactions.Transactional
import groovy.sql.Sql

@Transactional
class CredService {

    def dataSource

    @SuppressWarnings('SqlResolve')
    def getUserInformation(params) {
        def sql = new Sql(dataSource)
        try {
            def credentials = sql.firstRow("""
                                    select password, isActive from users where username=:username
                                    """, [username: params.username])
            if (params.password.toString() == credentials.password && credentials.isActive == true) {
                return true
            } else {
                return false
            }
        }
        catch (e) {
            e.printStackTrace();
            return false
        }

    }


}
