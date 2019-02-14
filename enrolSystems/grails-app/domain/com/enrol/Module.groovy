package com.enrol

class Module 	{
	String 	moduleTitle
	String 	moduleCode
	int 	credits
	String	lecturer
	String	course
	String	description

    	static constraints = {
		moduleTitle		nullable: false , blank: false
		moduleCode		nullable: false , blank: false
		credits			nullable: false , blank: false , size	: 20..120
		lecturer		nullable: false , blank: false
		course			nullable: false , blank: false
		description		nullable: false , blank: false , size	: 0..5000 , widget: 'textarea'
    }
}
