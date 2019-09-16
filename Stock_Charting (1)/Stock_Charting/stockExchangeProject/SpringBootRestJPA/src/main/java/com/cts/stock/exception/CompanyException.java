package com.cts.stock.exception;

public class CompanyException extends RuntimeException {

			
			private String message;
			
			public CompanyException(String message){
				
				this.message=message;
			}

			public String getMessage() {
				return message;
			}

			
			
			

		}

	
	
	

