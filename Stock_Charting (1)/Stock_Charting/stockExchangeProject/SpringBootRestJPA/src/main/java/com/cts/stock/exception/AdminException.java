package com.cts.stock.exception;

public class AdminException extends RuntimeException{
		
		private String message;
		
		public AdminException(String message){
			
			this.message=message;
		}

		public String getMessage() {
			return message;
		}

		
		
		

	}


