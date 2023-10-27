package com.usersservice.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "fco_users")
public class User {

	@DynamoDBHashKey
	private Long user_id;

	@DynamoDBAttribute
	private String user_name;

	@DynamoDBAttribute
	private Integer user_age;

	@DynamoDBAttribute
	private Integer num_orders;
}
