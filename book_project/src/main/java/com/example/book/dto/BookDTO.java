package com.example.book.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// @Date: @Getter, @Setter, @ToString을 모두 가지고 있음
@Getter
@Setter
@ToString
public class BookDTO {
	private Long id;
	private String bookName;
	private String bookAuthor;
	private String bookPublisher;
	private int bookPrice;
}