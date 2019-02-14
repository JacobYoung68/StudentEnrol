package com.enrol

class BootStrap {

	def init = { servletContext ->
		def Computing = new Course(
		department:		'ACES',
		courseTitle:		'BSc Hons Computing',
		courseLeader:		'Dr Michelle Murphy',
		courseCode:		'CS123',
		startDate:		new Date('09/09/2019'),
		endDate:		new Date('07/07/2023'),
		description:		'Lorem Ipsum',
		numberOfStudents:	55,
		tuitionFees:		9000,
		studyMode:		'Fulltime'
		).save()

		def ComputerScience = new Course(
		department:		'ACES',
		courseTitle:		'BSc Hons Computer Science',
		courseLeader:		'Dr Mike Meredith',
		courseCode:		'CS124',
		startDate:		new Date('09/09/2019'),
		endDate:		new Date('07/07/2023'),
		description:		'Lorem Ipsum',
		numberOfStudents:	130,
		tuitionFees:		9000,
		studyMode:		'Fulltime'
		).save()

		def JacobYoung = new Student(
		studentName:		'Jacob Young',
		studentID:		'b6010137',
		dob: 			new Date('18/08/1998'),
		isFundingAvailable:	false,
		studentEmail:		'b6010137@my.shu.ac.uk',
		studentUsername:	'b6010137',
		studentPassword:	'OiOiNiceTry',
		course:			'Computing'
		).save()

		def LucaNochivelli = new Student(
		studentName:		'Luca Nochivelli',
		studentID:		'b7010346',
		dob: 			new Date('10/11/1999'),
		isFundingAvailable:	false,
		studentEmail:		'b7010346@my.shu.ac.uk',
		studentUsername:	'b7010346',
		studentPassword:	'NahNahNah',
		course:			'Computing'
		).save()

		def SystemArchitecture = new Module(
		moduleTitle:		'System Architecture',
		moduleCode:		'C112',
		credits: 		20,
		lecturer: 		'Tonderai Maswera',
		course:			'Computing',
		description:		'Lorem Ipsum'		
		).save()

		def TonderaiMaswera = new Lecturer(
		fullName:		'Tonderai Maswera',
		post:			'Something',
		subject:		'Computing',
		lecturerEmail:		'Tonderai@shu.ac.uk',
		office:			'9310',
		bio:			'Lorem Ipsum'
		).save()
    	}
	def destroy = {
    	}
}
