package com.example.utility;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ResponseMessage {

	private String message;
	private String type;
	private String status;
}
