package myapp

import grails.gorm.transactions.Transactional


@Transactional(connection = "two")
class DummyTwoService {

	void hello() {
		println "hello"
	}

}
